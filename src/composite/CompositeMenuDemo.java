package composite;

public class CompositeMenuDemo {
	public static void main(String[] args) {
		// ~~~ purpose ~~~
		// 1. Components represent part or whole structure
		// 2. Compose objects into tree structures
		// 3. Individual object treated as a Composite
		// 4. Same operations applied on individual and composites
		// ~~~ example ~~~
		// restful gets
		
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
