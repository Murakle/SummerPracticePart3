package ru.murat.dautov.printer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;


public class PrintHelloWorldActivator implements BundleActivator {

    private ServiceRegistration<IPrintHelloWorld> serviceRegistration;

    public void start(BundleContext context) throws Exception {
        System.out.println("Start plugin activator");
        //noinspection unchecked
        serviceRegistration = (ServiceRegistration<IPrintHelloWorld>)
                context.registerService(IPrintHelloWorld.class.getName(),
                        new PrintHelloWorldImpl(),
                        null);
    }

    public void stop(BundleContext context) throws Exception {
        serviceRegistration.unregister();
        System.out.println("Stop plugin activator");
    }
}