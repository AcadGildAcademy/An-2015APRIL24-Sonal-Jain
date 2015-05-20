/**
* program to print ArrayList
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Challenge1 {
	public static void main(String[] args) {
		// using Arrays class to create an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4,
				5, 6));
		
		Iterator<Integer> iterator = numbers.iterator();
		// using while instead of for-each since it helps in modifying ArrayList
		// and moreover we can backtrack too
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
