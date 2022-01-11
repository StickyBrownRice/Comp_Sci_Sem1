import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b) {
		int base = a;
		int exponent = b;
		
		int variable = a;
		
		int counter = 1;
		while(true){
			base = base * variable;
			counter = counter + 1;
			if(counter == exponent){
				break;
			}
		}
		return base;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int Base  = sc.nextInt();
	
		System.out.println("What is your exponent?");
		int Exponent  = sc.nextInt();
	
		int answer = pow(Base, Exponent);
		System.out.println(answer);
	}
}
