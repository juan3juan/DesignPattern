package template;

public class TemplateDemo {
	
	// ~~~ purpose ~~~
	// 1. Code reuse
	// 2. Common in libraries/frameworks
	// 3. IoC
	// 4. Algorithm emphasis
	// ~~~ example ~~~
	// java.util.Collections#sort()
	
	public static void main(String[] args) {
		System.out.println("Web Order:");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		System.out.println("\nStore Order:");
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
