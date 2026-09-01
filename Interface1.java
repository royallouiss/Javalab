abstract class Employee {

	protected String name;

	Employee(String name) {

	this.name = name;

	}

	void displayName() {

	System.out.println("Name: " + name);	

	}

	abstract void work();

}


interface Payable {

	void calculatePay();

}


class Manager extends Employee implements Payable {

	Manager(String name) {
        
	super(name);
	
	}

	@Override

	void work() {

	System.out.println("Manager manages the team");

	}

	@Override

	public void calculatePay() {

	System.out.println("Developer salary calculated");

	}

}

class Developer extends Employee implements Payable {

	Developer(String name) {
        
	super(name);
	}

	@Override

	void work() {

	System.out.println("Developer writes code");

	}

	@Override

	public void calculatePay() {

	System.out.println("Developer salary calculated");

	}

}

class Interface1 {

	public static void main(String[] args) {

	Employee[] employees = new Employee[2];

	employees[0] = new Manager("Aljo");

	employees[1] = new Developer("Rahul");

	for (int i = 0; i < employees.length; i ++) {

		employees[i].displayName();

		employees[i].work();

	}

	}

}

	
	
	
	

	

	