package adaptor;

public class EmployeeAdapterCSV implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		// transfer int to String
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}
}
