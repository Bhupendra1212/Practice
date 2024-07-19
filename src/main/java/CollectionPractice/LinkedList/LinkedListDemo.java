package CollectionPractice.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

//		LinkedList<Integer> l=new LinkedList<Integer>(); //For Homogeneous element stored only stored Integer type element

		LinkedList l = new LinkedList(); // For heterogeneous element stored

		// Add Element in the linked list
		l.add(100);
		l.add("Hello");
		l.add(true);
		l.add(5.5f);
		l.add('A');
		l.add(60);

		System.out.println(l);

		// Size of linkedlist

		System.out.println(l.size());

		// remove element

		l.remove(4);
		System.out.println(l);

		// Inserding /adding element in the linked list in the middle

		l.add(4, "Java");
		System.out.println(l);

		// Retriving the value/object
		System.out.println(l.get(2));

		// Change the value
		l.set(5, 111);
		System.out.println(l);

		// Contains check value available or not
		System.out.println(l.contains("Java"));

		// isEmpty
		System.out.println(l.isEmpty());

		// Reading the linked list using the for loop
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l.get(i));
//		}

		// Reading the linked list using the for each loop

//		for(Object e:l) {
//			System.out.println(e);
//		}

		// Reading the data using the iterator

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
