/**
* program to print HashSet
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Challenge2 {

	public static void main(String[] args) {
		//HashSet(unordered and no duplicates) is created by using Arrays class
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4,5, 6));

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
