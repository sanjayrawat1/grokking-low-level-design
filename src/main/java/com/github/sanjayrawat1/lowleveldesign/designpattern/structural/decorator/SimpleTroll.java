package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * A simple troll.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class SimpleTroll implements Troll {

    @Override
    public void attack() {
        log.info("The troll tries to grab you!");
    }

    @Override
    public int attackPower() {
        return 10;
    }
}
