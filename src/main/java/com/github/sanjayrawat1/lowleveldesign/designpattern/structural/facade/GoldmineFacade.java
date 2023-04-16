package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

import java.util.Collection;
import java.util.List;

/**
 * A goldmine facade.
 *
 * @author Sanjay Singh Rawat
 */
public class GoldmineFacade {

    private final List<MineWorker> workers;

    public GoldmineFacade() {
        this.workers = List.of(new GoldDigger(), new CartOperator(), new TunnelDigger());
    }

    public void startNewDay() {
        makeActions(workers, Action.WAKE_UP, Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, Action.WORK);
    }

    public void endDay() {
        makeActions(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
    }

    private static void makeActions(Collection<MineWorker> workers, Action... actions) {
        workers.forEach(mineWorker -> mineWorker.action(actions));
    }
}
