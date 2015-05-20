/**
* program to print HashMap
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Challenge3 {

	public static void main(String[] args) {
		//HashMap is used to create key-value pairs
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "tutorials");
		map.put(2, "point");
		map.put(3, "is best");
		
		Set<Map.Entry<Integer, String>> keySet = map.entrySet();
		System.out.println(keySet);
	}

}
