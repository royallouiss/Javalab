import java.util.Scanner;

public class Atmswitch {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");
	
	System.out.print("\n Enter your choice: ");

	int a = s.nextInt();

	switch(a) {

		case 1:

		System.out.println("Your balance is 10000");

		break;
	
		case 2:

		System.out.println("Deposit successful");

		break;

		case 3:

		System.out.println("Withdrawal successful");

		break;

		case 4:

		System.out.println("Thank you for using our ATM");

		break;

		default:

		System.out.println("Invalid choice");

		break;

		}

	s.close();
}

}