package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * A cart operator.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class CartOperator extends MineWorker {

    @Override
    protected String name() {
        return "Cart operator";
    }

    @Override
    protected void work() {
        log.info("{} moves gold chunks out of the mine.", name());
    }
}
