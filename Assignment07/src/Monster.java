//CSE110: Class #77686/iCOURSE
//ASSIGNMENT: ASSIGNMENT #7
//AUTHOR: EMMANUEL ALEMU/1216878221
//DESCRIPTION: THIS FILE SETS UP MONSTER CHARACTERISTICS FOR BATTLE
public class Monster {

	private String name;
	private int healthScore;
	private Weapon weapon;
	
	
	public Monster(String monName, int health, Weapon weapon1) {
		name = monName;
		healthScore =health;
		weapon = weapon1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealthScore() {
		return healthScore;
	}
	
	public String getWeaponName() {
		return weapon.getName();
	}

	public int attack(Monster aMonster) {
		int damage = (int) (Math.random()*10.0) * weapon.getMaxDamage();
		healthScore-= damage;
		return damage;
	}

}

