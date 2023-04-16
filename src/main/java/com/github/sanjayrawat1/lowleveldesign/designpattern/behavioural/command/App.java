package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.command;

/**
 * The command pattern.
 *
 * @author Sanjay Singh Rawat
 */
public class App {

    public static void main(String[] args) {
        var livingRoomLight = new Light();
        var livingRoomFan = new Fan();

        var bedRoomLight = new Light();
        var bedRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.changeCommand(new TurnOnLightCommand(livingRoomLight));
        remote.buttonPressed();

        remote.changeCommand(new TurnOnLightCommand(bedRoomLight));
        remote.buttonPressed();

        remote.changeCommand(new TurnOffLightCommand(livingRoomLight));
        remote.buttonPressed();

        remote.changeCommand(new TurnOffLightCommand(bedRoomLight));
        remote.buttonPressed();

        remote.changeCommand(new StartFanCommand(livingRoomFan));
        remote.buttonPressed();

        remote.changeCommand(new StartFanCommand(bedRoomFan));
        remote.buttonPressed();

        remote.changeCommand(new StopFanCommand(livingRoomFan));
        remote.buttonPressed();

        remote.changeCommand(new StopFanCommand(bedRoomFan));
        remote.buttonPressed();
    }
}
