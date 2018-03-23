import java.util.*;

public class Employee {
	private String name;
	private Date hireDate;

	public Employee() {
		this.name = "no name";
		this.hireDate = new Date(1000, 01, 1); // Placeholder
	}

	public Employee(String theName, Date theDate) {
		if (theName == null || theDate == null) {
			System.out.println("Error creating employee");
			System.exit(0);
		}
		this.name = theName;
		this.hireDate = new Date(theDate);
	}

	public Employee(Employee other) {
		this.name = other.name;
		this.hireDate = new Date(other.hireDate);
	}

	public String getName() {
		return this.name;
	}

	public Date getHireDate() {
		return new Date(hireDate);
	}

	public void setName(String newName) {
		if (newName == null) {
			System.out.println("Error setting employee name");
			System.exit(0);
		} else {
			this.name = newName;
		}
	}

	public void setHireDate(Date newHireDate) {
		if (newHireDate == null) {
			System.out.println("Error setting hire date");
			System.exit(0);
		} else {
			this.hireDate = new Date(newHireDate);
		}
	}

	public String toString() {
		return name + " " + hireDate.toString();
	}

	public boolean equals(Employee other) {
		return name.equals(other.name) && hireDate.equals(other.hireDate);
	}
}
