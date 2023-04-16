package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

/**
 * A home automation remote.
 *
 * @author Sanjay Singh Rawat
 */
public class HomeAutomationRemote {

    private Command command;

    public void changeCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
