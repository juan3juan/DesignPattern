package mediator;

public class MediatorDemo {
	
	// ~~~ purpose ~~~
	// 1. Loose coupling
	// 2. Well-defined, but complex
	// 3. Reusable components
	// 4. Hub/Router
	// ~~~ example ~~~
	// java.util.Timer
	
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
	}
}
