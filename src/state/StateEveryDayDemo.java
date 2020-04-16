package state;

public class StateEveryDayDemo {
	public static void main(String[] args) {
		GarageDoor garageDoor = new GarageDoor();
		
		System.out.println(garageDoor);
		
		garageDoor.openDoor();
		
		System.out.println(garageDoor);
		
		garageDoor.closeDoor();
		
		System.out.println(garageDoor);
	}
}


class GarageDoor {

	final static int CLOSED = 0;
	final static int OPEN = 1;
	
	int state = CLOSED;
	
	public GarageDoor() {
		
	}
	
	public void openDoor() {
		if(state == OPEN) {
			System.out.println("Door is already open");
		}
		else if (state == CLOSED) {
			System.out.println("Opening door.");
			state = OPEN;
		}
		
	}
	
	public void closeDoor() {
		if(state == OPEN) {
			System.out.println("Closing door.");
			state = CLOSED;
		}
		else if (state == CLOSED) {
			System.out.println("Door is already closed.");
		}
	}
	
	public String toString() {
		if(state == OPEN) {
			return "Door is open";
		}
		else {
			return "Door is closed";
		}
	}
}