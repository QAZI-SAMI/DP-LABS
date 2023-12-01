/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Command.RemoteControlExample;

/**
 *
 * @author Hamza
 */
public class Main {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();

    }

}