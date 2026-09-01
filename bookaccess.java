class book {

	private String title;

	private String author;

public void setBook(String t, String a) {

	title = t;

	author = a;

	}

void display() {

	System.out.println("Title : "+ title + "\n Author : "+ author);

	}

}


public class bookaccess {
	
	public static void main(String[] args) {

	book k1 = new book();

	book k2 = new book();

	k1.setBook("Java Programming" , "James");

	k2.setBook("Python Basics" , "John");

	k1.display();

	k2.display();
		
	}

}