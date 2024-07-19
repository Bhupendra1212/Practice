package CollectionPractice.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap hm = new HashMap();
		HashMap<Integer,Character> hm =new HashMap<Integer,Character>(); //In the key Int and value string data type allowed

		hm.put(101, 'A');
		hm.put(102, 'B');
		hm.put(103, 'C');
		hm.put(104, 'D');
		hm.put(105, 'E');
		hm.put(106, 'F');

		System.out.println(hm);
		System.out.println(hm.get(102)); // Retrive the data with the help of key

		hm.remove(103);
		System.out.println(hm); // Remove the data from the Hashmap

		System.out.println(hm.containsKey(103)); // Verify key is available or not
		System.out.println(hm.containsValue('A')); // Verify value is available or not

		System.out.println(hm.isEmpty()); // To verify hashmap is empty or not
		System.out.println(hm.keySet()); // Return only the set of key, return type is set
		System.out.println(hm.values()); // Return the set of the values and Return type is collections

		System.out.println(hm.entrySet()); // Return the set of key and value.

		// Print the key one by one

		for (Object e : hm.keySet()) {
			System.out.println(e);
		}

		// Print the Value one by one

		for (Object e : hm.values()) {
			System.out.println(e);
		}

		// Print the Key and vale one by one using key set

//		for (Object e : hm.keySet()) {
//			System.out.println(e + "  " + hm.get(e));
//
//		}
		// Print the Key and vale one by one using Entry set method
		
//		for(Map.Entry entry:hm.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//			
//		}
		
		// Print the Key and vale one by one using ITerator 
		
		Set s=hm.entrySet();                                             // With the help of entry set get the entry value
		Iterator itr=s.iterator();                                       // Iterate the entry set
		while(itr.hasNext()) {                                           // Verify iterator having next value or not
			Map.Entry entry=(Entry) itr.next();                          // Next value stored in in entry return type is Map.Entry
			System.out.println(entry.getKey()+"   "+entry.getValue());   //print the value
		}
	}

}
