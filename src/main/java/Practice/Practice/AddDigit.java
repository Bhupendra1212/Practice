package Practice.Practice;

public class AddDigit {
	public static void main(String[] args) {
		int num=233536;
		int digit=0;
		int sum=0;
		for(int i=1;num>0;i++) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;	
		}
		System.out.println(sum);
	}
	
	

}
