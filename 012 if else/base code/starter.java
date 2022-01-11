import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random generator = new Random();
		int rand_num1 = generator.nextInt(1000)+1;
		
		System.out.println("Guess a random number between 1 and 1000.");
		int random = sc.nextInt();
		
		String correct = new String("You have guessed the correct number.");
		String incorrect = new String("You have guessed an incorrect number.");
		
		boolean x = random == rand_num1;
		if(x)
	{
		System.out.println(correct);
	}
		else
	{
		System.out.println(incorrect);
	}
		
	}
}
