/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThirdExample;

/**
 *
 * @author sp20-bse-072
 */
import java.util.ArrayList;

public class Commentary implements Publisher{
	ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String desc;
	
	public void subsrcibe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}
		
	}

	public void unSubsrcibe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}	
	}

	public void notifySubscribers() {
		for(Subscriber s:subscribers){
			s.update(desc);
		}
		
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifySubscribers();
	}
}