package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * The factory pattern.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        var coint1 = CoinFactory.getCoin(CoinType.GOLD);
        var coint2 = CoinFactory.getCoin(CoinType.SILVER);

        log.info(coint1.getDescription());
        log.info(coint2.getDescription());
    }
}
