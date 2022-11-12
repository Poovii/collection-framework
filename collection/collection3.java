package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.HashSet;

public class collection3 {

	public static void main(String[] args) {
		//hashset-it will store the value into the address of the pointer and does not allow duplicate entry only unique elements	
		HashSet<String>h=new LinkedHashSet<>();
		h.add("ravi");
		h.add("poovi");
		h.add("gokul");
		h.add("moorthy");
		System.out.println(h);
		// linkedhashset
	LinkedHashSet<Integer>i=new LinkedHashSet<Integer>();
		i.add(5);
		i.add(7);
		i.add(2);
		i.add(2);
		System.out.println("hash values"+i);
		//treeset- it will display only sorted list 
		TreeSet<String>t=new TreeSet<>();
		t.add("ravi");
		t.add("poovi");
		t.add("gokul");
		t.add("moorthy");
		System.out.println("set values"+t);
		
		
		
	}

}
