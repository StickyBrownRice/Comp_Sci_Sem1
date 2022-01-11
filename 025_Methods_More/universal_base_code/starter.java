import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void setRole(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue? ");
		String selection = sc.nextLine();
		
		if(selection.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior! ");
		}
		else if(selection.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor! ");
		}
		else if(selection.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning! ");
		}
		else{
			System.out.println("You've decided to not choose a role. Rerun program. ");
		}
	}
	public static void setStrength(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points would you like to add to strength? ");
		int strength = sc.nextInt();
		System.out.println("Strength: " + strength);
	}
	public static void setDexterity(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points would you like to add to dexterity? ");
		int dexterity = sc.nextInt();
		System.out.println("Dexterity: " + dexterity);
	}
	public static void setIntelligence(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points would you like to add to intelligence? ");
		int intelligence = sc.nextInt();
		System.out.println("Intelligence: " + intelligence);
	}
	public static void setConstitution(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points would you like to add to constitution? ");
		int constitution = sc.nextInt();
		System.out.println("Constitution: " + constitution);
	}
	public static void setCharisma(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points would you like to add to charisma? ");
		int charisma = sc.nextInt();
		System.out.println("Charimsa: " + charisma);
	}
	public static void setAll(){
		boolean setRole = true;
		boolean setStrength = true;
		boolean setDexterity = true;
		boolean setIntelligence = true;
		boolean setConstitution = true;
		boolean setCharisma = true;
		if(setRole == true && setStrength == true && setDexterity == true && setIntelligence == true && setConstitution == true && setCharisma == true){
			System.out.println("True");
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		setRole();
		setStrength();
		setDexterity();
		setIntelligence();
		setConstitution();
		setCharisma();
		setAll();
	}
}
