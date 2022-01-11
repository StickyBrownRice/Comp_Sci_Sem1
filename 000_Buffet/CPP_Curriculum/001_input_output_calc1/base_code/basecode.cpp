// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	int x;
	int y;
	
	cout << "What is your first number? " << endl;
	cin >> x;
	
	cout << "What is your second number? " << endl;
	cin >> y;
	
	int answer = x * y;
	cout << "Your answer is " << answer << endl;
}
