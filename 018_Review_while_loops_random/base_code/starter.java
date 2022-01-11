import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int num = random.nextInt(1000)+1;
		
		System.out.println("Guess a number: ");
		int number = sc.nextInt();
		
		while(true) {
			System.out.println("Try again! ");
			number = sc.nextInt();
			if(number == num) {
				System.out.println("Good Job! ");
				break;
			}
		}

		
	}
}
