import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random random = new Random();
		int randomInt = random.nextInt(10);
		System.out.println("A number between 0 - 9: " + randomInt);
		
		Random random1 = new Random();
		int random1Int = random.nextInt(100)+1;
		System.out.println("A number between 1 = 100: " + random1Int);
		
		Random generator = new Random();
		double rand_num2 = generator.nextDouble()+2.5;
		System.out.println("A number between 2.5 and 3.5: " + rand_num2);
		
		int rand_num10 = generator.nextInt(575);
		double random3Double = generator.nextDouble()+14;
		System.out.println("A double between 14 and 589: " + (random3Double + rand_num10));
		
	}
}
