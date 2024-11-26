package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class ReverseADigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int result = 0;
		int n1 = 0;
		while(num !=0) {
			n1 = num % 10;
			result = n1;
			num = num/10;
			System.out.print(result);
		}
		scan.close();

	}

}
