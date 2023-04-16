package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.builder;

import lombok.AllArgsConstructor;

/**
 * An Armor.
 *
 * @author Sanjay Singh Rawat
 */
@AllArgsConstructor
public enum Armor {
    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain mail"),
    PLATE_MAIL("plate mail");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
