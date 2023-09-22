/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondexample;

/**
 *
 * @author sp20-bse-072
 */
public class Person implements Subscriber{
	String name;
	

	public Person(String name) {
		this.name = name;
	}


	@Override
	public void update() {
		System.out.println("Hello "+name+", product is now in stock");
		
	}

}