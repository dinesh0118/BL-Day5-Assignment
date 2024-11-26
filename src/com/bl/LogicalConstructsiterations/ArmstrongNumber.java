package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numnber : ");
		int num = scan.nextInt();
		int originalNumber = num;
		int length = 0;
		int result = 0;
		int temp = num;
		
		while(temp != 0) {
			length++;
			temp = temp/10;
		}
		
		while(num != 0) {
			int digit = num %10;
			result += Math.pow(digit, length);
			num = num/10;
		}
		
		if(result == originalNumber) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		scan.close();
	}

}
