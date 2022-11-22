package hehe;
import java.util.Scanner;

public class RunAnimal {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Bird birdie = new Bird();
	Cat pusi = new Cat();
	Dog dogie = new Dog();
	
	System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
	String choose = sc.nextLine();
	
	if(choose.equalsIgnoreCase("B")) {
		birdie.eat();
		birdie.sleep();
		birdie.makeSound();
	}
	else if(choose.equalsIgnoreCase("C")) {
		pusi.eat();
		pusi.sleep();
		pusi.makeSound();
	}
	else if(choose.equalsIgnoreCase("D")) {
		dogie.eat();
		dogie.sleep();
		dogie.makeSound();
	}
	else {
		System.out.println("Wrong imput! Only enter letters B, C or D.");
	}
	}
	
}
