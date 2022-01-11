import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random generator = new Random();
		int rand_num1 = generator.nextInt(1000)+1;
		
		System.out.println("Pick a number between 1-1000: ");
		int random = sc.nextInt();
		
		boolean x = random == rand_num1;
		if(x)
	{
		System.out.println("You have guessed a correct number. ");
	}
		else if(random > rand_num1)
	{
		System.out.println("Your number was greater than the number. The number was " + rand_num1);
	}
		else
	{
		System.out.println("Your number was smaller than the number. The number was " + rand_num1);
	}
		System.out.print("This is a potato");
		System.out.println("Ilove my potato");
	}
}
