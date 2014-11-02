package human;

import exceptions.AttackException;
import interfaces.Human;


public abstract class Warrior implements Human {
	String name;
	int health;
	int attack;
	int defense;
	
	@Override
	public void travel(String location) {
		// TODO Auto-generated method stub
		System.out.println(name+" has travelled to "+location);
	}

	@Override
	public void sleep(int hours) {
		// TODO Auto-generated method stub
		System.out.println(name+" has slept "+hours+" hours");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+" is FULL !");
	}
	
	/* abstract method for attacking an enemy*/
	
	public abstract void attack(Warrior target) throws AttackException;
	
	/* public method for showing health points*/
	
	public void showHealth()
	{
		System.out.println(this.name+" has "+this.health+" health points !");
	}
}
