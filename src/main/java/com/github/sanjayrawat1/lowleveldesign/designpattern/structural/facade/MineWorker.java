package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 * Mine worker.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public abstract class MineWorker {

    public void goToSleep() {
        log.info("{} goes to sleep.", name());
    }

    public void wakeUp() {
        log.info("{} wakes up.", name());
    }

    public void goHome() {
        log.info("{} goes home.", name());
    }

    public void goToMine() {
        log.info("{} goes to the mine.", name());
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP -> goToSleep();
            case WAKE_UP -> wakeUp();
            case GO_HOME -> goHome();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            default -> log.info("Undefined action");
        }
    }

    protected abstract String name();

    protected abstract void work();
}
