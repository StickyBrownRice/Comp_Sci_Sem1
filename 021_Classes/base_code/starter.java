import java.util.Scanner;
import java.util.Random;

class Character{
	public String Role = new String("Wizard");
	public int Strength = 5;
	public int Dexterity = 5;
	public int Intelligence = 5;
	public int Constitution = 5; 
	public int Charisma = 5;
}

class starter {
	public static void main(String args[]) {
		Character MyCharacter = new Character();
		System.out.println(MyCharacter.Role);
		System.out.println("Strength: " + MyCharacter.Strength);
		System.out.println("Dexterity: " + MyCharacter.Dexterity);
		System.out.println("Intelligence: " + MyCharacter.Intelligence);
		System.out.println("Constitution: " +MyCharacter.Constitution);
		System.out.println("Charisma: " + MyCharacter.Charisma);
	}
}
