import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] Haha) {
		for(int i = 0; i < Haha.length; i++) {
			System.out.println(Haha[i]);
		}
	}
	public static double getArrayAverage(int[] Haha) {
		int counter = 0;
		double average = 0;
		while(counter < Haha.length) {
			average += Haha[counter];
			counter += 1;
		}
		average = average/Haha.length;
		return average;
	}
	public static int getArrayMax(int[] Haha) {
		int counter = 0;
		int maximum = -1000;
		while(counter < Haha.length) {
			if(Haha[counter] > maximum) {
				maximum = Haha[counter];
			}
			counter += 1;
		} 
		return maximum;
	}
	public static int getArrayMin(int[] Haha) {
		int counter = 0;
		int minimum = 1000;
		while(counter < Haha.length) {
			if(Haha[counter] < minimum) {
				minimum = Haha[counter];
			}
			counter += 1;
		}
		return minimum;
	}
 
	public static void main(String args[]) {
		Random rand = new Random();
		int counter = 0;
		int[] Haha = new int[100];
		while(true) {
			int num2 = rand.nextInt(100)+1;
			if(counter == Haha.length) {
				break;
			}
			Haha[counter] = num2;
			counter += 1;
		}
		System.out.println("These are the Elements!");
		toStringArray(Haha);
		
		System.out.println(" ");
		System.out.println("This is the average!");
		System.out.println(getArrayAverage(Haha));
		
		System.out.println("This is the Maximum!");
		System.out.println(getArrayMax(Haha));
		
		System.out.println("This is the Minimum!");
		System.out.println(getArrayMin(Haha));
		
	}
} 
	
