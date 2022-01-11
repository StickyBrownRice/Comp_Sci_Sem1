import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	Scanner sc = new Scanner(System.in);
	BaseClass test = new BaseClass();
	
	static void bruh(){
		String start = new String("Your role is no role. ");
		System.out.println(start);
		return;
	} 
	static void selection(String Wizard, String Warrior, String Rogue){
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass("Wizard");
		System.out.println("Would you like to be a wizard, warrior, or rogue? ");
		String choice = sc.nextLine();
		
		if(choice.equals("Wizard")){
			System.out.println(test.Wiz);
		}
		else if(choice.equals("Warrior")){
			System.out.println(test.War);
		}
		else if(choice.equals("Rogue")){
			System.out.println(test.Rog);
		}
		else{
			System.out.println("You have decided to not choose a role. Rerun program. ");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		
		bruh();
	
		selection("Wizard", "Warrior", "Rogue");
		

		
	}
}
