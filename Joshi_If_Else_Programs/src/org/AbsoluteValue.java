/*
 * write java program to get absolute value with user input.
 */
package org;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		if(n>0) {
			System.out.println(n);
		}else {
			n=n*(-1);
			System.out.println(n);
		}
	}

}
