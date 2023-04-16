package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.singleton;

/**
 * Thread safe lazy loaded singleton pattern.
 *
 * @author Sanjay Singh Rawat
 */
public final class ThreadSafeLazyLoadedInstance {

    private static volatile ThreadSafeLazyLoadedInstance instance;

    /**
     * private constructor to prevent client from instantiating.
     */
    private ThreadSafeLazyLoadedInstance() {
        // to prevent instantiating by Reflection call
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static synchronized ThreadSafeLazyLoadedInstance getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedInstance();
        }
        return instance;
    }
}
