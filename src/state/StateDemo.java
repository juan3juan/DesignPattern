package state;

public class StateDemo {
	
	// ~~~ purpose ~~~
	// 1. Localize state behavior
	// 2. State Object
	// 3. Separates what from where
	// ~~~ example ~~~
	// Iterator
	
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		System.out.println(fan);
		
		fan.pullChain();
		
		System.out.println(fan);
		
		fan.pullChain();
		
		System.out.println(fan);
		
		fan.pullChain();
		
		System.out.println(fan);
		
		fan.pullChain();
		
		System.out.println(fan);
	}
}
