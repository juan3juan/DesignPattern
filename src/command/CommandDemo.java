package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	
	// ~~~ purpose ~~~
	// 1. Encapsulate request as an Object
	// 2. OO callback
	// 3. Decouple sender from processor
	// 4. Often used for "undo" functionality
	// ~~~ example ~~~
	// java.lang.Runnable

	
	public static void main(String[] args) {
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
	
		lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
