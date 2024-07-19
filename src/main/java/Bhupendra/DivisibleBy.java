package Bhupendra;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Divisible by 3 and 5");

		}
		else if (num % 3 == 0) {
			System.out.println("Divisible by 3");

		}
		else if (num % 5 == 0) {
			System.out.println("Divisible by 5");
		} else {
			System.out.println("Number not divisible");
		}

	}
}
