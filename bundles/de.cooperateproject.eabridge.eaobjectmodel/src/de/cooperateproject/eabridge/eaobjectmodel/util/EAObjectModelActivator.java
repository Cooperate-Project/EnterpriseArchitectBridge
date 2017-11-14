package de.cooperateproject.eabridge.eaobjectmodel.util;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class EAObjectModelActivator extends Plugin {

		// The shared instance
		private static EAObjectModelActivator plugin;
		
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			plugin = this;
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