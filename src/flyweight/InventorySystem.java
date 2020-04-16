package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	
	// CopyOnWriteArrayList is concurrent, thread-safe; 
	// ArrayList is fast, but not thread-safe
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	// default in java means can be visit within the package
	void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}
	
	void process() {
		for(Order order: orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	String report() {
		return "\nTotal Item objects made: " + catalog.totalItemsMade();
	}
}
