package observer;

public class ObserverDemo {

	// ~~~ purpose ~~~
	// 1. One to Many
	// 2. Decoupled
	// 3. Event Handling
	// 4. Pub/Sub
	// 5. M-V-C
	// ~~~ example ~~~
	// java.util.Observer
	
	public static void main(String[] args) {
		Subject subject = new MessageStream();
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here is a new message!");
		tabletClient.addMessage("Another new message!");
	}
}
