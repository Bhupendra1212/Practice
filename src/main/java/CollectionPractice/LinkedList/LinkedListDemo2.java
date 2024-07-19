package CollectionPractice.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("X");
		l.add("Y");
		l.add("P");
		l.add("M");
		l.add("C");
		l.add("U");
		
		//Add all element of linkedlist to the another linkedlist
		
		LinkedList dup_l=new LinkedList();
		dup_l.addAll(l);
		System.out.println(dup_l);
		
		//remove all element from the linkedlist
		dup_l.removeAll(l);
		System.out.println(dup_l);
		
		//Sorting Ascending order
		
		Collections.sort(l);
		System.out.println(l);
		
		//Sorting in descending order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		//Shuffling the element
		Collections.shuffle(l);
		System.out.println(l);
		
		
		

	} 

}
