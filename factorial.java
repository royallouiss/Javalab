import java.util.Scanner;

public class factorial {

	public static void main(String[] args) { 

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the number to find the factorial: ");

	int b = s.nextInt();

	int a = 1;

	for (int i = b; i >= 1; i --) {

		a = a  * i;		}
	
	System.out.println("Factorial of " + b + " numbers is = " + a);

	s.close();

	}

}