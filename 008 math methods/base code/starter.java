import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		double num = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double num2 = Math.sqrt(3 * 8 + 31 % 7);
		double num3 = Math.pow(37 / 3, 35 % 21);
		
		double pow = Math.pow(2,14%3);
		double sqrt = Math.sqrt(2*6);
		
		double max = Math.max(pow, sqrt);
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(max);
		
	}
}
