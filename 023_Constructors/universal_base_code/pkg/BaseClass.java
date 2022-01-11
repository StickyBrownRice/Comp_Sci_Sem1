package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public String Role;
	public String Wiz;
	public String War;
	public String Rog;
	public int Strength;
	public int Dexterity;
	public int Intelligence;
	public int Constitution;
	public int Charisma;
	
	public BaseClass() {
		Role = new String("Your role is no role.");
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		
	}
	public BaseClass(String r){
		Scanner sc = new Scanner(System.in);
		
		Wiz = new String("You've chosen the Wizard! Excelsior! ");
		War = new String("You've chosen the Warrior! For Honor! ");
		Rog = new String("You've chosen the Rogue! How cunning! ");
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Constitution = 0;
		Charisma = 0;
		
	}
	
}

