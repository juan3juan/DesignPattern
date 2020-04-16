package decorator;

public class DecoratorSandwichDemo {
	
	// ~~~ purpose ~~~
	// 1. Wrapper, add behavior without affecting others
	// 2. More than just inheritance
	// 3. Single responsibility principle
	// 4. Compose behavior dynamically
	// ~~~ example ~~~
	// UI components, java.io.InputStream
	
	public static void main(String args[]) {
		
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}
