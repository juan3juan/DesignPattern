package chainOfResponsibility;

public class ChainOfResponsibilityDemo {
	// ~~~ purpose ~~~
	// 1. Decoupling of sender and receiver
	// 2. Receiver contains reference to next receiver
	// 3. Promotes loose coupling
	// 4. No handler - OK
	// ~~~ example ~~~
	// Call Center
	// java.util.logging.Logger#log()

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);
	}
}
