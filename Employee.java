package learnCode;


public class Employee {
		
	private int id;
	private int employeeId;
	private String firstName;
	private String lastName;
	private String deptId;
	
	public Employee(int id, int employeeId, String firstName, String lastName, String deptId) {
	//	super();
		this.id = id;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", deptId=" + deptId + "]";
	}
	
	


	
}
