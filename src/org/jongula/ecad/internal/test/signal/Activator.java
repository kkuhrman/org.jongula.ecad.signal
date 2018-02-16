package org.jongula.ecad.internal.test.signal;

import org.jongula.ecad.signal.ISignal;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	/**
	 * 
	 */
	private ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		TestSignal signal = new TestSignal();
		registration = context.registerService(ISignal.class.getName(),
					signal, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
	}

}
