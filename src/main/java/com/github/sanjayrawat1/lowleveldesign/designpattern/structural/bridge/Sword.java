package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.bridge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A Sword.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class Sword implements Weapon {

    private final Enchantment enchantment;

    @Override
    public void wield() {
        log.info("The sword is wielded");
        enchantment.activate();
    }

    @Override
    public void swing() {
        log.info("The sword is swung");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("Thor sword is unwielded");
        enchantment.deactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
