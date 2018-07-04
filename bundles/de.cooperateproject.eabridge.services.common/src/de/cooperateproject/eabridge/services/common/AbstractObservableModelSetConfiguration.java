package de.cooperateproject.eabridge.services.common;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfigurationObserver;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;

public class AbstractObservableModelSetConfiguration extends AbstractObservable<ModelSetConfigurationObserver> implements ModelSetConfiguration {
	class ChangeObserver extends EContentAdapter {
		@Override
		public void notifyChanged(Notification notification) {
			if (!notification.isTouch()) {
				AbstractObservableModelSetConfiguration.this.dirty = true;
				for (QualifiedModel qm : AbstractObservableModelSetConfiguration.this.values) {
					qm.getModel().eAdapters().remove(this);
				}
			}
			super.notifyChanged(notification);
		}
	}
	
	private List<QualifiedModel> values;
	private ModelSetSpecification spec;
	private boolean dirty = false;

	AbstractObservableModelSetConfiguration(List<QualifiedModel> values, ModelSetSpecification spec) {
		this.values = values;
		this.spec = spec;
		
		values.forEach(qm -> qm.getModel().eAdapters().add(new ChangeObserver()));
	}

    @Override
    public Resource getModel(String forNamespace, Optional<String> identifier) {
        return values.stream().filter(qm -> qm.getModelNamespace().getNamespace().equals(forNamespace))
                .filter(qm -> qm.getModelNamespace().getQualifier().equals(identifier)).findFirst().get().getModel();
    }

    @Override
    public Iterator<QualifiedModel> iterator() {
        return Collections.unmodifiableList(values).iterator();
    }

    @Override
    public ModelSetSpecification getSpecification() {
        return spec;
    }

	@Override
	public boolean isDirty() {
		return this.dirty;
	}

}
