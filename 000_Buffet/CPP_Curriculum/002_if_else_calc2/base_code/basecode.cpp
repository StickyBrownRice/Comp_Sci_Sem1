// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x; 
	int y;
	
	string choice = "Would you like to add, subtract, divide, or multiply? ";
	
	cout << "What is your first number? " << endl;
	cin >> x;
	
	cout << "What is your second number? " << endl;
	cin >> y;
	
	cout << choice << endl;
	cin >> choice;
	
	if(choice == "add"){
		int num1 = x + y;
		cout << num1 << endl;
	}
	else if(choice == "subtract"){
		int num2 = x - y;
		cout << num2 << endl;
	}
	else if(choice == "multiply"){
		int num3 = x * y;
		cout << num3 << endl;
	}
	else if(choice == "divide"){
		int num4 = x / y;
		cout << num4 << endl;
	}
	else{
		cout << "You have decided to not do anything. Rerun program. " << endl;
	}
}
