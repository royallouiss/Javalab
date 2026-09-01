import java.util.Scanner;

public class array {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	int[] ar = {32, 35, 29, 40, 38, 33, 31};

	float avg = 0;

	int max = 0;

	for (int i = 0; i < ar.length; i ++) {

		avg = avg + ar[i];
		
		if ( ar[i] > max ){
			
			max = ar[i];

			}

		}

	avg = avg / ar.length;

	System.out.println(avg);

	System.out.println(max);

	}

}