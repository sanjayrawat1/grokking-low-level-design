package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * A fan.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class Fan {

    public void start() {
        log.info("Fan started.");
    }

    public void stop() {
        log.info("Fan stopped.");
    }
}
