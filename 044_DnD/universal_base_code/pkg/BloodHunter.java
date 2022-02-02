package pkg;
import java.util.Scanner;
import java.util.Random;


public class BloodHunter {
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public BloodHunter() {
		this("", rand.nextInt(15)+1, rand.nextInt(15)+1)
	}
	public BloodHunter(String name) {
		this.name = name;
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;

	}
	public void setHealth(int health) {
		this.health = health;
		return;
	}
	public int getHealth() {
		return health;	
	}
	public String getName() {
		return name;
	}
	
