/**
* program to print area of rectangle and triangle.
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package inheritance;

public class Test {

	public static void main(String[] args) {
		//passing parent object
		Rectangle rect = new Rectangle(10, 15);
		System.out.println(rect.area());
		//toString() is overridden
		System.out.println(rect);
        //passing child object
		rect = new Triangle(10, 15);
		System.out.println(rect.area());
		//toString() is overridden
		System.out.println(rect);
	}

}
