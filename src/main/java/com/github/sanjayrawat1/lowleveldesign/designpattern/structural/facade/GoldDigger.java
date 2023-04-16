package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * A gold digger.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class GoldDigger extends MineWorker {

    @Override
    protected String name() {
        return "Gold digger";
    }

    @Override
    protected void work() {
        log.info("{} digs for gold.", name());
    }
}
