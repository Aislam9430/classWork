package search;

public class Pokemon 
{	
	private int hp;
	private int level;
	private String name;
	private boolean poisoned;
	
	 public static void main(String[] args) 
	 {
		 Pokemon charmeleon = new Pokemon("charmeleon ",26);
		 Pokemon ivysaur = new Pokemon("ivysaur",26);
		 charmeleon.iChooseYou();
		 ivysaur.iChooseYou();
		 System.out.println("Charmeleon is preparing to attack with ember");
		 charmeleon.attack(ivysaur, new Attack()
		 {
			 public void attack(Pokemon target) {
				 int hp = target.getHp();
				 target.setHp(hp/2);
			 }
		 });
		System.out.println("Ivyasaur is preparing to attack with poison.");
		 ivysaur.attack(charmeleon, new Attack() 
		 {
				 
			public void attack(Pokemon target) 
			{
				 target.setPoisoned(true);
			}
		 });
		 charmeleon.lapse();
		 ivysaur.lapse();
		 System.out.println("charmeleon is attacking with fire blast!!!");
		 charmeleon.attack(ivysaur, new Attack() 
		 { 
			 public void attack(Pokemon target) 
			 {
				 int hp = target.getHp();
				 target.setHp(hp - 100);
			 }
		 });
		 charmeleon.levelUp(new Effect()
		 {
			 public void happen()
			 {
				 //final if modify a reference out of file
				 charmeleon.setHp(100);
			 }
		 });

					
	 }
	
	 public void levelUp(Effect e)
	 {
		 level++
		 e.happen();
	 }
			 
	public Pokemon(String name, int level)
	{
		this.name = name;
		this.level = level;
		poisoned = false;
		hp = 100;
	}
	public void attack(Pokemon target, Attack attack)
	{
		 if(Math.random() < .9)
		 {
			 attack.attack(target);
			 System.out.println("The attack hit");
		 }
		 else
		 {
			 System.out.println("The attack missed");
		 }
	 }
	public void iChooseYou()
	{
		System.out.println(name);
		System.out.println(name);
	}
	public int getHp() 
	{
		return hp;
	}
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setPoisoned(boolean poisoned) 
	{
		this.poisoned = poisoned;
	}
	public void lapse()
	{
		if(poisoned == false)
		{
			hp = hp-15;
		}
	}



	

}
