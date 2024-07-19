package CollectionPractice.Hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HashTableDemo {

	public static void main(String[] args) {

		// Hashtable hs=new Hashtable(); //Initial capacity 11
		// HashTable hs=new Hashtable(initial capacity); //Can defined initial capacity
		// HashTable hs =nre HashTable(initial capacity,load factor) //Defined initial
		// capacity and load factor

		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();

		hs.put(101, "Deepak");
		hs.put(102, "Rahul");
		hs.put(103, "Ram");
		hs.put(104, "Deepak");

		System.out.println(hs);
		System.out.println(hs.get(102));

		// Remove element
		hs.remove(102);
		System.out.println(hs);

		System.out.println(hs.containsKey(102));
		System.out.println(hs.containsValue("Ram"));
		System.out.println(hs.isEmpty());

		// print all the key
		System.out.println(hs.keySet());

		//// print all the values
		System.out.println(hs.values());

		// Print one by one key and value using keyset method
//
//		for (int e : hs.keySet()) {
//			System.out.println(e + " " + hs.get(e));
//		}

		// Entry Specific methods print the key and value

//		for(Map.Entry entry:hs.entrySet()) {
//			System.out.println(entry.getKey()+"   "+entry.getValue());
//			
//		}

		// Using iterator methods print the key and value onr by one

		Set s = hs.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
