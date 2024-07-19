 package CollectionPractice.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueqeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue q = new PriorityQueue(); // [10, 10, 11, 20, 12]
//		LinkedList q=new LinkedList();        //[10, 20, 11, 12, 10]

		// Add element in the queue with the help of add and offer
		q.add('A');
		q.add('Y');
		q.add('M');
		q.add('O');
		q.offer('A');
		System.out.println(q);

		// Return the head element in the queue with the help of the element and peek
		// method
//		System.out.println(q.element()); // 10 return head element if head queue is empty no such element exception
//		System.out.println(q.peek()); // 10 return head element if head queue is empty false return

		// remove head element in the queue with the help of remove and poll method
//		q.remove();
//		System.out.println();   //remove head element if head queue is empty no such element exception
//		System.out.println(q.poll());  //remove head element if head queue is empty false return

		// Reading the data

//		Iterator itr = q.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(Object e:q) {
			System.out.println(e);
		}

	}

}
