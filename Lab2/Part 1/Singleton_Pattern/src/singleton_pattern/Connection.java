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
public class Connection {
private static Connection instance;
	private Connection(){
		
	}
	public static Connection getInstance(){
		if(instance == null){
                    synchronized (Connection.class){
			instance = new Connection();}
		}
		return instance;
	}
	public void getData(){
		System.out.println("This is the data retrieved from the DB");
	}
}