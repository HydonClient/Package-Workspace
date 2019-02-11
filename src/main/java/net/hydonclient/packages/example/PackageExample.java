package net.hydonclient.packages.example;

import net.hydonclient.packages.AbstractPackage;

public class PackageExample extends AbstractPackage {

    @Override
    public void load() {
        System.out.println("Hi! This is coming from the example package.");
    }

    @Override
    public void shutdown() {
        System.out.println("Goodbye from the example package!");
    }
}
