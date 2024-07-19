package CollectionPractice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;

public class Arraylist {

	public static void main(String[] args) {

//		Declaration
//		ArrayList<Integer> al=new ArrayList<Integer>(); //For Save only integer type data type
//		ArrayList<String> al =new ArrayList<String>(); //For String type data
//		List al=new ArrayList();  

		ArrayList al = new ArrayList();

		// Add Element
		al.add(100);
		al.add("Hi");
		al.add(5.5f);
		al.add(true);
		al.add('c');

//		System.out.println(al);  //[100, Hi, 5.5, true, c]
//		
//		//Size of arraylist
//		System.out.println(al.size());  //5
//		
//		
//        //Remove Element from arraylist
//		al.remove(1);
//		System.out.println(al);   //[100, 5.5, true, c]
//		
//		//insert the value in the arraylist
//		al.add(3, "java");
//		System.out.println(al);
//		
//		//Retrive the value from the attaylist
//		System.out.println(al.get(2));  //At the 2nd index true vallue retrive
//		
//		//change/Replace element
//		
//	    al.set(3, "Python");
//	    System.out.println("After change the value in the arraylist:-"+al);
//	    
//	    //search contains (value is available or not)
//	    System.out.println(al.contains("Python"));
//	    
//	    //Check arraylist empty or not
//	    System.out.println(al.isEmpty());

		// Reading the the data of the arraylist

		// For loop

//	    System.out.println("Reading the element using for loop..");
//	    
//	    for(int i=0;i<al.size();i++) {
//	    	System.out.println(al.get(i));
//	    	
//	    }

		// For each loop
		System.out.println("Reading the element using the for each loop..");

		for (Object element : al)// al data save in the e variable and return type object because we can save all
									// types of data

		{
			System.out.println(element);

		}

		// For Iterator
		System.out.println("Reading the element using iterator");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	
}
