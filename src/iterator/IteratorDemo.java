package iterator;

import java.util.Iterator;

public class IteratorDemo {
	
	// ~~~ purpose ~~~
	// 1. Traverse a container
	// 2. Doesn't expose underlying structure
	// 3. Decouples algorithms
	// 4. Sequential
	// ~~~ example ~~~
	// java.util.Iterator
	// IteratorEverydayDemo for List & Set
	
	public static void main(String[] args) {

		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		//while(bikeIterator.hasNext()) {
		//	System.out.println(bikeIterator.next());
		//}
		
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}
