package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class collection2 {

	

	public static void main(String[] args) {
		//Queue
				Queue<Integer>q=new LinkedList<>();
				q.add(4);
				q.add(5);
				q.add(10);
				q.add(2);
				q.add(1);
				
				//peek - to specify the head of the queue
				System.out.println("Head is"+ q.peek());
				//remove-it shown a head and also show the remove element,but it does not show thrown a exception
				System.out.println("Remove of"+q.remove());
				//polll- it remove the elements suppose emplty queue it show null
				System.out.println(q.poll());
				
				System.out.println("The queue"+q);
			//priority queue-sorting the elements into the list-does not add duplicate
				PriorityQueue<Integer>q1=new PriorityQueue<>();
			q1.add(45);	
			q1.add(55);
			q1.add(67);
			q1.add(22);
			q1.add(11);
			q1.add(100);
				System.out.println("Sorted list"+q1);
				
	      
	}

}
