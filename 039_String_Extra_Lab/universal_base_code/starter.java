import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a phrase: ");
		String phrase = sc.nextLine();
		
		for(int i = 0; i < phrase.length(); i++ ){
			System.out.println(phrase.substring(0, phrase.indexOf(" ")));
		}

		
	}
}
