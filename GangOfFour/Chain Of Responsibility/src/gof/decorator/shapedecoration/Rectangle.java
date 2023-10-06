/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.decorator.shapedecoration;

/**
 *
 * @author sp20-bse-072
 */
public class Rectangle implements Shape {
   private int Price=56;
   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
       System.out.println("Price is "+Price);
   }
}
