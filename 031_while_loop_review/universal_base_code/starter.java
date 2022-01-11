import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		Random rand = new Random();
		
		int num1 = 101;
		
		int counter = 0;
		
		while(true){
			int num2 = rand.nextInt(101);
			System.out.println(num2);
			counter ++;
			if(counter == num2 - 1){
				break;
			}
		}
		
	}
}
