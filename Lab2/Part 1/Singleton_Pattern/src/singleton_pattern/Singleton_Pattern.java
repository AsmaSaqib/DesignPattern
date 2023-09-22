/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_pattern;

/**
 *
 * @author sp20-bse-072
 */
public class Singleton_Pattern {


    public static void main(String[] args) {
        // TODO code application logic here
//        Connection c = Connection.getInstance();
//		c.getData();
     Configuration config = Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));
    }
    
}
