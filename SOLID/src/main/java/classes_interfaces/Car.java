/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_interfaces;

/**
 *
 * @author User A1
 */
public class Car {
    private Drivable motor;

    public Car(Drivable motor) {
        this.motor = motor;
    }
    
    public void startUp(){
        motor.turnON();
    }
    
    public void stop(){
        motor.turnOFF();
    }
}
