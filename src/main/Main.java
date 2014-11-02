/**
 * 
 */
package main;

import human.Berserker;
import human.Paladin;


/**
 * @author Andrei
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Berserker b= new Berserker("Andrei");
		b.travel("Braila");
		Paladin p= new Paladin("George");
		p.attack(b);
		b.attack(p);
		b.attack(p);
		b.attack(p);
		p.heal();
		p.showHealth();
		b.showHealth();

	}

}
