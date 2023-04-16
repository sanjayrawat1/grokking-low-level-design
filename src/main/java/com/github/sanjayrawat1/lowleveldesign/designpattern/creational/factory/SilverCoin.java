package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.factory;

/**
 * Silver coin.
 *
 * @author Sanjay Singh Rawat
 */
public class SilverCoin implements Coin {

    static final String DESCRIPTION = "This is a silver coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
