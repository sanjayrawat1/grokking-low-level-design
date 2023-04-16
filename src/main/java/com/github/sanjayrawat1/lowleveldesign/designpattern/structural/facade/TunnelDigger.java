package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * A tunnel digger.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class TunnelDigger extends MineWorker {

    @Override
    protected String name() {
        return "Tunnel digger";
    }

    @Override
    protected void work() {
        log.info("{} creates another promising tunnel.", name());
    }
}
