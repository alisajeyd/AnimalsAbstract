package hehe;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.print("Birds love to eat seeds and ");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep for 10-12 hours a day.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Tweet Tweet");
		
		
	}

}
