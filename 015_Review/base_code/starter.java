import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		
		
		String a = new String("Wizard");
		
		String b = new String("Warrior");
		
		String c = new String("Rogue ");
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("WHat is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue? ");
		String Selection = sc.nextLine();
		
		if(Selection.equals("Wizard")|| Selection.equals("wizard")){
		System.out.println("You've chosen the Wizard! Excelsior! ");
	}
		else if(Selection.equals("Warrior")|| Selection.equals("warrior")){
		System.out.println("You've chosen the Warrior! For honor! ");
	}
		else if(Selection.equals("Rogue")|| Selection.equals("rogue")){
		System.out.println("You've chosen the Rogue! How cunning! ");
	}
		else {
		System.out.println("You've decided to not choose a role. Rerun program. ");
	}
	
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		int skillpoints = 25;

		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		
		while(strength > 10){
			System.out.println("Please choose a smaller number. Strength (1-10): " );
			strength = sc.nextInt();
		}
		while(strength > skillpoints){
			System.out.println("Please choose a smaller number. Strength (1-10): ");
			strength = sc.nextInt();
		}
		
		System.out.println("You have " + (skillpoints -= strength) + " left to spend.");
		
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		
		while(Dexterity > 10){
		System.out.println("Please choose a smaller number. Dexterity (1-10): ");
		Dexterity = sc.nextInt();
	}
		while(Dexterity > skillpoints){
			System.out.println("Please choose a smaller number. Dexterity (1-10): ");
			Dexterity = sc.nextInt();
		}
		System.out.println("You have " + (skillpoints -= Dexterity) + " left to spend.");
		
		System.out.print("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		
		while(Intelligence > 10){
		System.out.println("Please choose a smaller number. Intelligence (1-10): ");
		Intelligence = sc.nextInt();
	}
		while(Intelligence > skillpoints){
			System.out.println("Please choose a smaller number. Intelligence (1-10): ");
			Intelligence = sc.nextInt();
		}
		
		System.out.println("You have " + (skillpoints -= Intelligence) + " left to spend.");
		
		System.out.print("Constitution (1-10): ");
		int Constitution = sc.nextInt();
		while(Constitution > 10){
		System.out.println("Please choose a smaller number. Constitution (1-10): ");
		Constitution = sc.nextInt();
	}
		while(Constitution > skillpoints){
		System.out.println("Please choose a smaller numer. Constitution (1-10): ");
		Constitution = sc.nextInt();
		}
		System.out.println("You have " + (skillpoints -= Constitution) + " left to spend.");
	
		
		System.out.print("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		
		while(Charisma > 10){
		System.out.println("Please choose a smaller number. Charisma (1-10): ");
		Charisma = sc.nextInt();
	}
		while(Charisma > skillpoints){
		System.out.println("Please choose a smaller number. Charisma (1-10): ");
		Charisma = sc.nextInt();
	}
	
		System.out.println("---------------------------------------------");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You're a " + Selection + " with the following stats!");
		
		System.out.println("Strength: " + strength);
		System.out.println("Strength: "  + strength);
		
		System.out.println("Dexterity: " + Dexterity);
		
		System.out.println("Intelligence: " + Intelligence);
		
		System.out.println("Constitution: " + Constitution);
		
		System.out.println("Charisma: " + Charisma);
	}
}
