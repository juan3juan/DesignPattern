package memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayDemo {
	private static EmployeeEveryday deserialize() {
		EmployeeEveryday emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (EmployeeEveryday) in.readObject();
			in.close();
			fileIn.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		return emp;
	}

	private static void serialize(EmployeeEveryday emp) {

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static void main(String args[]) {
		EmployeeEveryday emp = new EmployeeEveryday();
		emp.setName("Bryan Hansen");
		emp.setAddress("111 E Code Street");
		emp.setPhone("888-555-1212");

		serialize(emp);

		EmployeeEveryday newEmp = deserialize();
		
		System.out.println(newEmp.getName());
	}
}
