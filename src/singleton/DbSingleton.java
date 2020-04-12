package singleton;

public class DbSingleton {
	// ~~~ purpose ~~~
	// 1. Only one instance created
	// 2. Lazily loaded
	// 3. Guarantees control of resource
	// ~~~ example ~~~
	// Logger
	
	// Volatile: for multi-thread safe, guarantees the visibility for other threads of writes to that variable. 
	// (write/read to/from main memory, not CPU cache)
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create!");
		}
	}
	
	public static DbSingleton getInstance() {
		// if instance is null, create
		if(instance == null) {
			// for multi-thread safey
			synchronized(DbSingleton.class) {
				if(instance == null)
					instance = new DbSingleton();
			}
		}
		return instance;
	}
}
