import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word. ");
		String word = sc.nextLine();
		
		int find = lastIndexOf(word.length());
		
		for(int i = 0; i < word.length(); i++){
			System.out.print(find.substring(i, i-1));
		}


		
	}
}
