package human;

public final class Berserker extends Warrior {


	public Berserker(String name)
	{
		this.name=name;
		this.health=500;
		this.attack=150;
		this.defense=80;
	}

	@Override
	public void attack(Warrior target) {
		// TODO Auto-generated method stub
		
		target.health = target.health - this.attack + target.defense/2;
		int dmg = this.attack - target.defense/2;
		System.out.println(this.name+ " has attacked "+target.name+" causing " + dmg + " damage");
		
	}
}
