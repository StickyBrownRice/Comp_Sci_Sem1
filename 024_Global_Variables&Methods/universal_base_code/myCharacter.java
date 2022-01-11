import pkg.*;
import java.util.Scanner;
import java.util.Random;
         
public class myCharacter {
	
	static void myToString(){
		BaseClass test = new BaseClass();
		
		System.out.println(test.role);
		System.out.println(test.strength);
		System.out.println(test.dexterity);
		System.out.println(test.intelligence);
		System.out.println(test.constitution);
		System.out.println(test.charisma);
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		myToString();
		
	}
}
