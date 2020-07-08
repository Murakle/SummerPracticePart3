package ru.murat.dautov.printer;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;


@Component(service = IPrintHelloWorld.class)
public class PrintHelloWorldImpl implements IPrintHelloWorld {
    @Activate
    void activate() {
        System.out.println("Activated: " + this.getClass().getCanonicalName());
    }

    @Deactivate
    void deactivate() {
        System.out.println("Deactivated: " + this.getClass().getCanonicalName());
    }

    @Override
    public void printHelloWorld() {
        System.out.println("Hello OSGi World!");
    }
}
