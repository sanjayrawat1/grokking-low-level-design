package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Turn on light command.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class TurnOnLightCommand implements Command {

    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        log.info("Turning on light.");
        light.turnOn();
    }
}
