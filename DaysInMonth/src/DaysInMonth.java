/**
* program to print no. of days in a month
* @version 1.0 03-05-2015
* @author Sonal Jain
*/
import java.util.Scanner;


public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;//user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter month:");
		month = in.nextLine();
		switch (month) {
		case "January":
			System.out.println("no.of days in January = 31");
			break;
		case "February":
			System.out.println("no.of days in February = 28/29");
			break;
		case "March":
			System.out.println("no.of days in March = 31");
			break;
		case "April":
			System.out.println("no.of days in April = 30");
			break;
		case "May":
			System.out.println("no.of days in May = 31");
			break;
		case "June":
			System.out.println("no.of days in June = 30");
			break;
		case "July":
			System.out.println("no.of days in July = 31");
			break;
		case "August":
			System.out.println("no.of days in August = 31");
			break;
		case "September":
			System.out.println("no.of days in September = 30");
			break;
		case "October":
			System.out.println("no.of days in October = 31");
			break;
		case "November":
			System.out.println("no.of days in November = 30");
			break;
		case "December":
			System.out.println("no.of days in December = 31");
			break;
        
		default:
			break;
		}
	}

}
