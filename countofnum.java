import java.util.Scanner;

public class countofnum {

	public static void main(String[] args) { 

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the digits: ");

	int b = s.nextInt();

	int count = 0;

	for (; b > 0 ; b = b / 10) {

		count ++;

	}

	System.out.println(count);

	s.close();

	}

}