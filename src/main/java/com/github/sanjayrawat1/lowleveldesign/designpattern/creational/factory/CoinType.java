package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.factory;

import java.util.function.Supplier;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Coin type.
 *
 * @author Sanjay Singh Rawat
 */
@Getter
@RequiredArgsConstructor
public enum CoinType {
    GOLD(GoldCoin::new),
    SILVER(SilverCoin::new);

    private final Supplier<Coin> constructor;
}
