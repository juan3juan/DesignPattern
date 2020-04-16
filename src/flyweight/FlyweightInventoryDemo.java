package flyweight;

public class FlyweightInventoryDemo {
	
	// ~~~ purpose ~~~
	// 1. More efficient use of memory, immutable
	// 2. Large number of similar objects
	// 3. use factory pattern inside
	// 4. usually use HashMap to realize flyweight
	// ~~~ example ~~~
	// Amazon inventory item(same item) retrieval
	// java.lang.String, java.lang.Integer#valueOf(int)
	
	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();

		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Samsung TV", 323);
		ims.takeOrder("Roomba", 563);
		ims.takeOrder("Bose Headphones", 321);
		ims.takeOrder("Roomba", 234);
		ims.takeOrder("Samsung TV", 54);
		ims.takeOrder("Roomba", 34);
		ims.takeOrder("Bose Headphones", 365);
		ims.takeOrder("Samsung TV", 332);
		ims.takeOrder("Roomba", 456);

		ims.process();
		
		System.out.println(ims.report());

	}
}
