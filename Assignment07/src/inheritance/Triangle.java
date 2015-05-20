/**
* program to print area of rectangle and triangle
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package inheritance;

public class Triangle extends Rectangle {
	private final float diagonal;
	
	public Triangle(final float base, final float height) {
		super(base, height);
		diagonal = (float)Math.sqrt(base*base + height * height);
	}
	
	@Override
	public double area() {
		return breadth * length / 2;
	}
	
    @Override
    public String toString(){
    	return "Triangle[base: " + breadth + " height: " + length + " hypotenuse: " + diagonal + "]";
    }
}
