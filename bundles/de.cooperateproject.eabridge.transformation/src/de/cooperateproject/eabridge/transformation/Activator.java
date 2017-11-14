package de.cooperateproject.eabridge.transformation;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	public static String PLUGIN_ID = "de.cooperateproject.eabridge.transformation";
	private static Plugin instance;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		setInstance(this);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		setInstance(null);
	}

	public static Plugin getInstance() {
		return instance;
	}
	
	private static void setInstance(Plugin instance) {
		Activator.instance = instance;
	}
	
}
