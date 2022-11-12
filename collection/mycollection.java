package collection;
import java.util.*;

public class mycollection {

	public static void main(String[] args) {
		//list collection 
		//Arralist
		ArrayList<Integer>i=new ArrayList<>();
		i.add(10);
		i.add(3);
		i.add(45);
		i.add(7);
		System.out.println("Array list"+i);
		ArrayList a=new ArrayList();
		a.add("poovi");
		a.add(45);
		a.add("John");
		System.out.println("list"+a);
		//Update
		i.set(0, 8);
		System.out.println("The list"+i);
		//find element
		System.out.println(i.get(1));
		//checking the number in the list or not
		i.contains(45);
		System.out.println(i.contains(3));
		System.out.println(i.clone());
		//it print the number into the line by line
		Iterator<Integer>r=i.iterator();
		System.out.println( r.next());
		System.out.println( r.next());
		System.out.println( r.next());
		System.out.println( r.next());
		/*while(i.hashNext()) {
			System.out.println(i.next());*/
		
		//Queue
		Queue<Integer>q=new LinkedList<>();
		q.add(4);
		q.add(5);
		q.add(10);
		q.add(2);
		q.add(1);
		System.out.println("Head is"+q);
		
		
		
		
		
			
		}
		

	}

}
