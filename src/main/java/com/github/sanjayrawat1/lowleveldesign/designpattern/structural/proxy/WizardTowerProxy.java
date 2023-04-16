package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A Wizard Tower proxy.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class WizardTowerProxy implements WizardTower {

    private static final int MAX_WIZARD_ALLOWED = 3;

    private int numWizard;

    private final WizardTower tower;

    @Override
    public void enter(Wizard wizard) {
        if (numWizard < MAX_WIZARD_ALLOWED) {
            tower.enter(wizard);
            numWizard++;
        } else {
            log.info("{} is not allowed to enter!", wizard);
        }
    }
}
