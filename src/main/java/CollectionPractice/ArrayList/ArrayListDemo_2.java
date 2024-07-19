package CollectionPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo_2 {
	
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(4);
		al.add(11);
		al.add(2);
		al.add(1);
		al.add(56);
		al.add(12);
		al.add(24);
		
		//Add all element from one arraylist to another arraylist
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		//Remove all element from arraylist
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		//Sort the arraylsit in the ascending order
		Collections.sort(al);
		System.out.println("After the sorting"+al);
		
		//Sort the arraylist in the descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//Shuffle the element
		
		Collections.shuffle(al);
		System.out.println(al);
		

		
		
		

	}
}
