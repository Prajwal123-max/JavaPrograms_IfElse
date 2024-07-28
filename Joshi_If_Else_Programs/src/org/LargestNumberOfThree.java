/*
 * Largest of Three num with user input.
 */
package org;

import java.util.Scanner;

public class LargestNumberOfThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num1:");
		int a=s.nextInt();
		System.out.print("Enter the num2:");
		int b=s.nextInt();
		System.out.print("Enter the num3:");
		int c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
