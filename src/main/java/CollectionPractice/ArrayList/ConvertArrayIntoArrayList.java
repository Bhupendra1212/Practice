package CollectionPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class ConvertArrayIntoArrayList {
	public static void main(String[] args) {
		Integer [] ar= {11,22,14,3,8};
		
		//Read individual data
//		for(int value:arr) {
//			System.out.println(value);
//		}
		//convert array into the arraylist
		
		ArrayList al=new ArrayList(Arrays.asList(ar));
		System.out.println(al);	

	}
}
