/**
* program to check whether you are eligible for vote or not?
* @version 1.0 03-05-2015
* @author Sonal Jain
*/
import java.util.Scanner;


public class RightToVote {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner in = new Scanner(System.in);//for user input
		System.out.println("Enter your age:");
		age = in.nextInt();//for initializing age
		if(age >= 18)
			System.out.println("You are eligible to vote.");
		else
		    System.out.println("You are not eligible to vote.");
	}

}
