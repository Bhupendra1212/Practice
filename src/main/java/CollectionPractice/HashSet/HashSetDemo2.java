package CollectionPractice.HashSet;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet number = new HashSet();
		number.add(2);
		number.add(1);
		number.add(12);
		number.add(21);

		//Add all the element from one hashset to another hashset
		HashSet numbernew = new HashSet();
		numbernew.addAll(number);
		numbernew.add(17);
		System.out.println(numbernew);
		
		//Remove all the element
		number.removeAll(numbernew);
		System.out.println(number);
		
		

	}

}
