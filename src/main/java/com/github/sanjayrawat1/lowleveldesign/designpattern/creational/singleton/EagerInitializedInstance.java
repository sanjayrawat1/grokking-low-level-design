package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.singleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread safety.
 *
 * @author Sanjay Singh Rawat
 */
public final class EagerInitializedInstance {

    private static final EagerInitializedInstance INSTANCE = new EagerInitializedInstance();

    private EagerInitializedInstance() {}

    public static EagerInitializedInstance getInstance() {
        return INSTANCE;
    }
}
