class Employee {

	String name;
	
	double salary;

	void displayEmployee() {

		System.out.println("Name : " + name);

		System.out.println("Salary : " + salary);

	}
}


class Manager extends Employee {

	String department;

	void displayManager() {

		System.out.print("Departmet : " + department);

		}
}

class inheritance {

	public static void main(String[] args) {

	Manager m = new Manager();

	m.name = "Aljo";

	m.salary = 50000;

	m.department = "IT";
	
	m.displayEmployee();

	m.displayManager();

	}

}

