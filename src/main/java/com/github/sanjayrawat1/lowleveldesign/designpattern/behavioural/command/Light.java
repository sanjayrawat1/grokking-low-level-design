package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * A light.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class Light {

    public void turnOn() {
        log.info("Light is on.");
    }

    public void turnOff() {
        log.info("Light is off.");
    }
}
