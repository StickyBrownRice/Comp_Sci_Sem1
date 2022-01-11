import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		
		System.out.println("How many times do you want your name listed? ");
		int times = sc.nextInt();
		
		int counter = 0;
		
		while(true) {
			System.out.println(name);
			if(counter == times - 1) {
				break;
			}
			counter = counter + 1;
		}
		 

		
	}
}
