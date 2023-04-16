package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

/**
 * The facade pattern.
 *
 * @author Sanjay Singh Rawat
 */
public class App {

    public static void main(String[] args) {
        var facade = new GoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
