package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A clubbed troll.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class ClubbedTroll implements Troll {

    private final Troll decorated;

    @Override
    public void attack() {
        decorated.attack();
        log.info("The troll swings at you with a club!");
    }

    @Override
    public int attackPower() {
        return decorated.attackPower() + 20;
    }
}
