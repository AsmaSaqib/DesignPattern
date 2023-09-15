/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author sp20-bse-072
 */
public class MotorCycle extends VehicleAbstract{

    @Override
    void speed() {
        System.out.println("speed is about 120km/h");
    }

    @Override
    void price() {
        System.out.println("Price ranges from 500$-5000$.");
    }

    @Override
    void NoOfTyres() {
        System.out.println("It has two tyres.");
    }
    
}
