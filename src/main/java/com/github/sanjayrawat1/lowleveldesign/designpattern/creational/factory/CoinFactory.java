package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.factory;

/**
 * Coin factory.
 *
 * @author Sanjay Singh Rawat
 */
public class CoinFactory {

    public static Coin getCoin(CoinType coinType) {
        return coinType.getConstructor().get();
    }
}
