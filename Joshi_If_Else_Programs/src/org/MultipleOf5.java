/*
 * Check given num is Multiple of 5 or not (Yes/No).
 */
package org;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		if(n%5==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
