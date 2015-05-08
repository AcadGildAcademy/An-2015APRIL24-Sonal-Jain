/**
* program to check whether year is leap year or not?
* @version 1.0 03-05-2015
* @author Sonal Jain
*/
import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year:");
		year = in.nextInt();
		if(year % 100 == 0){
			if(year % 400 == 0)
				System.out.println(year + " is leap year.");
			else
				System.out.println(year + " is not leap year.");
		}
		else
			System.out.println(year + " is not leap year.");	
	}

}
