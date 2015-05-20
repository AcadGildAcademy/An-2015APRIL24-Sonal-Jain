/**
* program to print area of rectangle and triangle
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package inheritance;

public class Rectangle {
	protected final float length;
	protected final float breadth;

	public Rectangle(final float l, final float b) {
		length = l;
		breadth = b;
	}
	
	public double area() {
		return length * breadth;
	}
	@Override
	public String toString(){
		return "Rectangle [breadth: " + breadth + " length: " + length + "]";
	}
}
