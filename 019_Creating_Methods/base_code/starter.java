import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String something) {
		System.out.println(something);
		return;
	}
	public static void toStringCombined(String something, String something1) {
			System.out.print(something + something1);
			return;
	}
	public static void main(String args[]) {
		System.out.println("This is using the methods!");
		toString("HI");
		toStringCombined("hi ", "hello");

	}
}
