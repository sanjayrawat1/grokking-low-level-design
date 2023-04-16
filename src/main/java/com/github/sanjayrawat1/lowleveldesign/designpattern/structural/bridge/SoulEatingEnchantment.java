package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * A Soul Eating Enchantment.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class SoulEatingEnchantment implements Enchantment {

    @Override
    public void activate() {
        log.info("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        log.info("The item eats the soul of enemies.");
    }

    @Override
    public void deactivate() {
        log.info("Bloodlust slowly disappears.");
    }
}
