package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Start fan command.
 *
 * @author Sanjay Singh Rawat
 */

@Slf4j
public class StartFanCommand implements Command {

    private final Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        log.info("Starting fan.");
        fan.start();
    }
}
