package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int num = scan.nextInt();
		
		for(int i=0;i<=num;i++) {
			System.out.println((int)Math.pow(2,i));
		}
		scan.close();

	}

}
