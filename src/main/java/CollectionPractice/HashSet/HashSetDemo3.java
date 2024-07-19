package CollectionPractice.HashSet;

import java.util.HashSet;

public class HashSetDemo3 {
	public static void main(String[] args) {

		// Union ,Iteresection,Difference

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		//Union compare both hashset and same all value print same value print once only
//		set.addAll(set2);
//		System.out.println(set);
		
		//Iteresection Same value in both HashSet
//		set.retainAll(set2);
//		System.out.println(set);
		
		//Difference in both hashSet
		set.removeAll(set2);
		System.out.println(set);
	}

}
