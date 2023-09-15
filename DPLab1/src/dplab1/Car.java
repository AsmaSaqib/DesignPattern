/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dplab1;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void NoOfTyres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
