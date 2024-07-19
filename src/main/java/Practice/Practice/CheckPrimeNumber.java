package Practice.Practice;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not prime number");

		}
	}
}
