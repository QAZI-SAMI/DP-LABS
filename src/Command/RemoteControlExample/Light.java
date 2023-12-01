/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Command.RemoteControlExample;

/**
 *
 * @author Hamza
 */
//Receiver

public class Light {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

}
