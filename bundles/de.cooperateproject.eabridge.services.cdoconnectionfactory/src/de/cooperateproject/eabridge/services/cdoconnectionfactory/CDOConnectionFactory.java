package de.cooperateproject.eabridge.services.cdoconnectionfactory;

import org.eclipse.emf.cdo.session.CDOSession;

public interface CDOConnectionFactory {
    CDOSession getSession();
}
