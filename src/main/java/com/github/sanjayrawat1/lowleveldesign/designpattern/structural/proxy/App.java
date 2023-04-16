package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.proxy;

/**
 * The proxy pattern.
 *
 * @author Sanjay Singh Rawat
 */
public class App {

    public static void main(String[] args) {
        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
    }
}
