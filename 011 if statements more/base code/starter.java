import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your first number: ");
		int number1 = sc.nextInt();
		
		System.out.println("Please input your first number: ");
		int number2 = sc.nextInt();
		
		String same = new String("Your numbers are the same!");
		String different = new String("Your numbers are different!");
		
		boolean x = number1 != number2;
		if(x)
	{
		System.out.println(different);
	}
		boolean z = number1 == number2;
		if(z)
	{
		System.out.println(same);
	}
		
	}
}