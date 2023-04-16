package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Stop fan command.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class StopFanCommand implements Command {

    private final Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        log.info("Stopping fan.");
        fan.stop();
    }
}
