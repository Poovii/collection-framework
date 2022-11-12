package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class collection4 {

	public static void main(String[] args) {
		//HashMap
		HashMap<String,Integer>m=new HashMap<String,Integer>();
		m.put("a", 10);
		m.put("b", 8);
		m.put("c",6);
		System.out.println("map"+m);
		//get=finding the element
		System.out.println("key value"+m.get("a"));
		//remove-key values
		System.out.println("remove"+m.remove("a"));
		//container=specify the particular values and keys
		System.out.println("contains"+m.containsKey("c"));
		System.out.println(m.containsValue(8));
		//size
		System.out.println(m.size());
		//replace=updated
		System.out.println(m.replace("b",8,12));
		System.out.println(m);
		//values
		System.out.println(m.values());
		//keyset-it will display the key only
		System.out.println(m.keySet());
		//LinkedMap
		LinkedHashMap<String,Integer>n=new LinkedHashMap<>();
		n.put("b", 7);
		n.put("a", 3);
		
		

	}

}
