package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.proxy;

/**
 * A Wizard.
 *
 * @author Sanjay Singh Rawat
 */
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
