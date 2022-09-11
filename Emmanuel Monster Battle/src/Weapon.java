//CSE110: Class #77686/iCOURSE
//ASSIGNMENT: ASSIGNMENT #7
//AUTHOR: EMMANUEL ALEMU/1216878221
//DESCRIPTION: THIS FILE SETS UP WEAPON CHARACTERISTICS FOR BATTLE
public class Weapon {
	
	private String name;
	private int maxDamage;
	
	
	public Weapon(){
		name = "Pointy Stick";
		maxDamage=1;
	}

	public Weapon(String string, int num){
		name = string;
		maxDamage=num;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String aName){
		name = aName;
	}

	public  int getMaxDamage(){
		return maxDamage;
	}
	
	public void  setMaxDamage(int num){ 
		maxDamage = num;
	}
}