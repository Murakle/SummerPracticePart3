package ru.murat.dautov;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import ru.murat.dautov.printer.*;

public class SimpleActivator implements BundleActivator {
    private ServiceReference<IPrintHelloWorld> serviceReference;

    public void start(BundleContext context) throws Exception {
        //noinspection unchecked
        serviceReference = (ServiceReference<IPrintHelloWorld>)
                context.getServiceReference(IPrintHelloWorld.class.getName());
        IPrintHelloWorld printer = context.getService(serviceReference);
        printer.printHelloWorld();
    }

    public void stop(BundleContext context) throws Exception {
        context.ungetService(serviceReference);
    }

}
