package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * Flying Enchantment.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class FlyingEnchantment implements Enchantment {

    @Override
    public void activate() {
        log.info("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        log.info("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void deactivate() {
        log.info("The item's glow fades.");
    }
}
