package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Turn off light command.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class TurnOffLightCommand implements Command {

    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        log.info("Turing off light.");
        light.turnOff();
    }
}
