package hehe;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.print("Dog loves to eat chicken and ");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep for 12-14 hours a day.");
	}

	@Override
	public void makeSound() {
		System.out.println("Wooof!");
		
	}

}
