package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.bridge;

/**
 * A Weapon.
 *
 * @author Sanjay Singh Rawat
 */
public interface Weapon {
    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
