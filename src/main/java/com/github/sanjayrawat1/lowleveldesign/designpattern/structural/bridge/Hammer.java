package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.bridge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A Hammer.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class Hammer implements Weapon {

    private final Enchantment enchantment;

    @Override
    public void wield() {
        log.info("The hammer is wielded");
        enchantment.activate();
    }

    @Override
    public void swing() {
        log.info("The hammer is swung");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("Thor hammer is unwielded");
        enchantment.deactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
