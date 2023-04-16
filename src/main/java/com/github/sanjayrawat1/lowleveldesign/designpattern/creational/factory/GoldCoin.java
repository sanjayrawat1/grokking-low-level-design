package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.factory;

/**
 * Gold coin.
 *
 * @author Sanjay Singh Rawat
 */
public class GoldCoin implements Coin {

    static final String DESCRIPTION = "This is a gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
