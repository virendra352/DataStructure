import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

	int salary;
	String name;
	String address;
	String department;
	
	
	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", address=" + address + ", department=" + department
				+ "]";
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Employee(int salary, String name, String address,String department) {
		
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.department=department;
	}


	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}






	
	
	
	
	
	

}
