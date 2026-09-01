import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the mark: ");

	int a = s.nextInt();

	if ( a > 100) {
		
		System.out.println("Invalid input, marks must be >= 100");
	}

	else if ( a >= 90 ) {

		System.out.println("Grade A");
	}
	else if ( a >= 75 ) {

		System.out.println("Grade B");
	}
	else if ( a >= 50 ) {
		
		System.out.println("Grade C");
	}

	else {

		System.out.println("Failed");
	}


}

}


