package adaptor;

import java.util.List;

public class AdapterDemo {
	// ~~~ purpose ~~~
	// 1. Convert interface into another interface
	// 2. Translates requests
	// 3. Client, Adapter, Adaptee
	// ~~~ example ~~~
	// Arrays -> Lists
	
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		System.out.println(employees);
	}
}
