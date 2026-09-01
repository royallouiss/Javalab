class Student {

	private String name;

	public void setName(String n) {

		name = n;

		}

	void display() {

		System.out.println(name);

	}

}	


public class Accessmod {

	public static void main(String[] args){

		Student s = new Student();

		s.setName("ALJO");

		s.display();

		}

	}