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
public class Demo {

	public static void main(String[] args) {
		Commentary commentary = new Commentary();
		Subscriber subscriber = new SMSSubscriber("Shouzeb Hassan [Kohat]");
		commentary.subsrcibe(subscriber);

		Subscriber subscriber2 = new SMSSubscriber("Saim Jehangir [Nathiagali]");
		commentary.subsrcibe(subscriber2);

		commentary.setDesc("Welcome to live Soccer match");
		commentary.setDesc("Current score 0-0");
		commentary.unSubsrcibe(subscriber2);

		
		commentary.setDesc("It’s a goal!!");
		commentary.setDesc("Current score 1-0");

		Subscriber subscriber3 = new SMSSubscriber("Afaq Ahmed [Abbottabad]");
		commentary.subsrcibe(subscriber3);
		commentary.setDesc("It’s another goal!!");
		commentary.setDesc("Half-time score 2-0");


	}

}
