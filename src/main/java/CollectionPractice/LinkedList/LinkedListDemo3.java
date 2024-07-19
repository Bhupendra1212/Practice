package CollectionPractice.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("cat");
		l.add("Cow");
		System.out.println(l);

		l.addFirst("Horse");
		l.addLast("Elephant");
		System.out.println(l);

		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
	
		
	}

}
