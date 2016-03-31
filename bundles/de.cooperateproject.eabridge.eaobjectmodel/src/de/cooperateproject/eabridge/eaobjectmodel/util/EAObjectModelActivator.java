package de.cooperateproject.eabridge.eaobjectmodel.util;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabasePropertiesFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabaseFactoryImpl;
import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabasePropertiesFactoryImpl;

public class EAObjectModelActivator extends Plugin {

		// The shared instance
		private static EAObjectModelActivator plugin;
		
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			plugin = this;
			DatabaseFactory.INSTANCE = new DatabaseFactoryImpl();
			DatabasePropertiesFactory.INSTANCE = new DatabasePropertiesFactoryImpl();
		}

		@Override
		public void stop(BundleContext context) throws Exception {
			plugin = null;
			super.stop(context);
		}

		public static EAObjectModelActivator getPlugin() {
			return plugin;
		}

	}