package Practice.Practice;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num = sc.nextInt();

		int digit = 0;
		int reverse = 0;
		int sum = num;
		for (int i = 1; num > 0; i++) {
			digit = num % 10;
			reverse = digit + (reverse * 10);
			num = num / 10;

		}
		if (reverse == sum) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}

}
