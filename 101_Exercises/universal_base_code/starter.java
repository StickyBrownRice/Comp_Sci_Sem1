import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii test = new Ascii();
		Ascii art1 = new Ascii("Human");
		Ascii art2 = new Ascii("Human", "Dog");
		Ascii art3 = new Ascii("Cactus", 1);
		Ascii art4 = new Ascii("Human", "Other", 1);
		Ascii art5 = new Ascii("Mama");
		
		art1.setAscii("__̴ı̴̴̡̡̡ ̡͌l̡̡̡ ̡͌l̡*̡̡ ̴̡ı̴̴̡ ̡̡͡|̲̲̲͡͡͡ ̲▫̲͡ ̲̲̲͡͡π̲̲͡͡ ̲̲͡▫̲̲͡͡ ̲|̡̡̡ ̡ ̴̡ı̴̡̡ ̡͌l̡̡̡̡.___");
		art1.printArt();
		art2.printArt();
		art3.printArt();
		art4.printArt();
		art5.printArt();
	}
}
