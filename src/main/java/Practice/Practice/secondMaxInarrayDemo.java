package Practice.Practice;

public class secondMaxInarrayDemo {

	public static void main(String[] args) {
		int x[]= {1,12,45,23,12,32,21,12};
		int max=x[0];
		for(int i=0;i<x.length-1;i++) {
			if(max<x[i]) {
				max=x[i];
				
			}
			System.out.println(max);
		}

	}

}
