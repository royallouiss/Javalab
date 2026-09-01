class Employee {

	private String name;

	private double salary;

	public void setEmployee(String n, double a) {

		name = n;

		salary = a;
		
		}

	void display() {

		System.out.println("Name : " + name  +  ", Salary : "+ salary);

		}

	}


public class Access {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		e1.setEmployee("Rahul", 23000);

		e1.display();

		}

	}