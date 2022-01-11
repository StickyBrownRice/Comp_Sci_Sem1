// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	int num1;
	string direction;
	cout << "Please enter the symbol you wish to draw a line with. " << endl;
	cin >> char;
	cout << "How long would you like to make the line? " << endl;
	cin >> num1;
	cout << "Would you like the line printed horizontally or vertically? " << endl;
	cin >> direction;
	
	int i;
	for(i = num1){
		cout << char * num1 << endl;
	}

}
