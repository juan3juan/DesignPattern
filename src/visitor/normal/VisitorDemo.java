package visitor.normal;

public class VisitorDemo {
	
	// ~~~ purpose ~~~
	// 1. Seperate Algorithm from Object
	// 2. Adding new features
	// 3. Maintain Open/Closed principle
	// 4. Visitor changes
	// ~~~ example ~~~
	// java.lang.model.element.ElementVisitor
	
	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		order.accept(new AtvPartsShippingVisitor());
		// another visitor, easy to create
		order.accept(new AtvPartsDisplayVisitor());
	}
	
}
