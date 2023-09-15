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
public class CarInt implements VehicleInterface {

    @Override
    public void speed() {
        System.out.println("Usualy cars have 120km/h");
    }

    @Override
    public void price() {
        System.out.println("Prices ranges 3000$-100000$");
    }
    
}
