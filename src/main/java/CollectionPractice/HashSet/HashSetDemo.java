package CollectionPractice.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

//		HashSet hs =new HashSet(100);
//		HashSet hs=new HashSet(100,075f);
//		HashSet<Integer> hs=new HashSet<Integer>();

		hs.add(100);
		hs.add("Hello");
		hs.add(null);
		hs.add(11);
		hs.add("Java");
		hs.add(1.5f);

		System.out.println(hs);

		// contains
		System.out.println(hs.contains(11));

		// remove()
		hs.remove("Java");
		System.out.println(hs);

		// Reading the data of HashSet using for each method

//		for(Object e:hs) {
//			System.out.println(e);
//		}

		// Reading the data of HashSet using iterator metohd

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
 
	}

}
