import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Random rand = new Random();
		
		int num1 = rand.nextInt(101);
		
		int[] haha;
		haha = new int[1000];
		
		int counter;
		counter = 0;
		
		while(counter < haha.length){
			haha[counter] = num1;
			counter ++;
			if(counter > haha.length){
				break;
			}
		}
		int index = 0;
		while(index < haha.length){
			num1 = rand.nextInt(101);
			System.out.println(num1);
			index++;
			if(index > haha.length){
				break;
			}
		}
	}
}
