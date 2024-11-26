package com.bl.LogicalConstructsiterations;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		int n1=0,n2=1;
			if (num >= 1) {
				System.out.print(n1 + " ");
			}if(num >= 2) {
				System.out.print(n2+ " ");
			}
			for(int i=3;i<=num;i++) {
				int n3 = n1+n2;
				System.out.print(n3 + " ");
				n1 = n2;
				n2 = n3;
			}
			//System.out.println();
			scan.close();

	}

}
