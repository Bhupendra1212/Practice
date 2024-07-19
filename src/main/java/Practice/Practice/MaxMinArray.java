package Practice.Practice;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinArray {
public static void main(String[] args) {
	Integer[] ar= {1,5,8,3,5,8,9,10};
	int min=ar[0];
	int max=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(min>ar[i]) {
			min=ar[i];
		}else if(max<ar[i]) {
			max=ar[i];
		}
		
	}
	System.out.println(min);
	System.out.println(max);
	}
	
	
}

	


