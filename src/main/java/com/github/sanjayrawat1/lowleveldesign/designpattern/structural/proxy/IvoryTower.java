package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Ivory tower.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }
}
