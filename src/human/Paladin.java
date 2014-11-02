package human;

public final class Paladin extends Warrior {


	public Paladin(String name)
	{
		this.name=name;
		this.health=800;
		this.attack=90;
		this.defense=200;
	}

	@Override
	public void attack(Warrior target) {
		// TODO Auto-generated method stub
		target.health = target.health - this.attack - this.defense/4 +target.defense/2;
		int dmg = this.attack + this.defense/4 - target.defense/2;
		System.out.println(this.name+ " has attacked "+target.name+" causing " + dmg + " damage");
	}
	
	public void heal()
	{
		this.health += 300;
		if(this.health > 800)
			this.health=800;
		System.out.println(this.name+ "has healed 300 life points");
	}
}
