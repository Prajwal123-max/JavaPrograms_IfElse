/*
 * Even or Odd Program with user input.
 */
package org;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
