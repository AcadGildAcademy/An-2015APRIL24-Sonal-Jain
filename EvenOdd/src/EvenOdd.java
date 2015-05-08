/**
* program to check whether number is even or odd?
* @version 1.0 03-05-2015
* @author Sonal Jain
*/
import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		number = in.nextInt();
		if(number % 2 == 0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}

}
