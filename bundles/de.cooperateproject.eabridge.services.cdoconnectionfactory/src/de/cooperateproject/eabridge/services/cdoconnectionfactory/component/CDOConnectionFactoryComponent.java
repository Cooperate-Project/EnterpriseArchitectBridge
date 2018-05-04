package de.cooperateproject.eabridge.services.cdoconnectionfactory.component;

import de.cooperateproject.cdo.util.utils.CDOHelper;
import de.cooperateproject.eabridge.services.cdoconnectionfactory.CDOConnectionFactory;

import java.util.Map;
import org.eclipse.emf.cdo.session.CDOSession;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;

@Component(name=CDOConnectionFactoryComponent.SERVICE_PID, configurationPolicy=ConfigurationPolicy.REQUIRE)
public class CDOConnectionFactoryComponent implements CDOConnectionFactory {
    public static final String SERVICE_PID = "cdoconnection";
    public static final String CDO_FACTORY_USER = "username";
    public static final String CDO_FACTORY_PASS = "password";
    public static final String CDO_FACTORY_HOST = "hostname";
    public static final String CDO_FACTORY_PORT = "port";
    public static final String CDO_FACTORY_REPO = "repository";
    
    protected CDOSession cdoSession;
    
    @Activate
    protected void activate(Map<String, Object> properties) {
        cdoSession = CDOHelper.createCDOSession(
                properties.get(CDO_FACTORY_HOST).toString(),
                Integer.valueOf(properties.get(CDO_FACTORY_PORT).toString()),
                properties.get(CDO_FACTORY_REPO).toString());
    }
    
    @Deactivate
    protected void deactivate() {
        if (cdoSession != null && !cdoSession.isClosed()) {
            cdoSession.close();
        }
    }

    @Override
    public CDOSession getSession() {
        if (cdoSession == null) {
            throw new IllegalStateException(
                    String.format("The component %s has not been initialized yet.", this.getClass().getName()));
        }
        return cdoSession;
    }
}