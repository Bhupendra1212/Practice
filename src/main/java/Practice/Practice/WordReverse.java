package Practice.Practice;

public class WordReverse {
	public static void main(String[] args) {
		String str="I love India";
		String part="";
		String[] parts=str.split(" ");
//		for(int i=2;i>=0;i--) {
//			System.out.print(parts[i]+" ");
//		OR
		// s=s+parts[i];
		for(int i=0;i<str.length();i++) {
			if(i==parts.length-1) {
				part=parts[1]+parts[0]+parts[2];
				
			}
		}
		System.out.println(part);
			
		}
		
		
		
		
	}

//}
