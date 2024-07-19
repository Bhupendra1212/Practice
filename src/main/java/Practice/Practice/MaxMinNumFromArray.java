package Practice.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinNumFromArray {
	public static void main(String[] args) {
		Integer[] ar={12,2,36,8,89,41,1,23};
//		int min=Collections.max(Arrays.asList(ar));
//		int max=Collections.min(Arrays.asList(ar));
//		System.out.println(min);
//		System.out.println(max);
//		
//		  OR
		int minArray=ar[0];
		int maxArray=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(minArray>ar[i]) {
				minArray=ar[i];
				
			}else if(maxArray<ar[i]) {
				maxArray=ar[i];
			}
		}
		System.out.println(minArray);
		System.out.println(maxArray);
			
			
		}
	}

