package hehe;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.print("Cat love to eat fish and ");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep for 12-16 hours.");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow!!");
		
	}

}
