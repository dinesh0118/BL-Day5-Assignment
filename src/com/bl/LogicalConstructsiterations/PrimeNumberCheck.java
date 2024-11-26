package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		if(num <= 1) {
			System.out.println("Please enter the number greater than zero");
		}
		else if(isPrime(num)) {
			System.out.println("Given number is a prime");
		}
		else {
			System.out.println("Given number is not a prime number.");
		}
		scan.close();
	}

	private static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

}
