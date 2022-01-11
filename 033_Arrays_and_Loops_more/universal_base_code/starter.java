import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		
		int num1 = rand.nextInt(150)+51;
		int num2 = rand.nextInt(100)+1;
		
		int x = num1;
		int[] Haha = new int[x];
		
		int min = 1;
		int max = 100;

		for(int i = 0; i < Haha.length; i++) {
			Haha[i] = rand.nextInt(100)+1;
			System.out.println(Haha[i]);
		}
		
		for(int i = 1; i < Haha.length; i++) {
			if(Haha[i] < min){
				min = Haha[i];
			}
			if(Haha[i] > max){
				max = Haha[i];
			}
		}
		int average = 0;
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		
		for(int i = 0 ; i < 100; i++) {
			average += Haha[i];
		}
		int average2 = average /= 100;
		System.out.println("Average: " + average2);
	}
}
