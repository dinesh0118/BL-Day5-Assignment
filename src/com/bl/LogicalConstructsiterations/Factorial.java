package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int input = scan.nextInt();
		int result = factorial(input);
		System.out.println(result);
		scan.close();
	}

	private static int factorial(int input) {
		
		if(input == 0) {
			return 1;
		}
		return input * factorial(input - 1);
	}

}
