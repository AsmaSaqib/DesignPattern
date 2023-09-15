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
public class Car extends VehicleAbstract {

    @Override
    void speed() {
        System.out.println("Usualy cars have 120km/h");
    }

    @Override
    void price() {
        System.out.println("Their Price Starts from 3000$ and reaches to more than a lakh.");
    }

    @Override
    void NoOfTyres() {
        System.out.println("They have four tyres.");
    }
    
}
