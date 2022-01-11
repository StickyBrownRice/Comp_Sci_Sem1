 import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		
		
		String a = new String("Wizard");
		
		String b = new String("Warrior");
		
		String c = new String("Rogue ");
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue? ");
		String Selection = sc.nextLine();
		
		
		if(Selection.equals("Wizard"))
	{
		System.out.println("You've chosen the Wizard! Excelsior! ");
	}
		else if(Selection.equals("Warrior"))
	{
		System.out.println("You've chosen the Warrior! For honor! ");
	}
		else if(Selection.equals("Rogue"))
	{
		System.out.println("You've chosen the Rogue! How cunning! ");
	}
		else 
	{
		System.out.println("You've decided to not choose a role. Rerun program. ");
	}
	
	}
}
