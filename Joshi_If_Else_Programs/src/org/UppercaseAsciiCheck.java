/*
 * check weather given num is Uppercase ASCII num or not
 */
package org;

import java.util.Scanner;

public class UppercaseAsciiCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		if(n>=65 && n<=90) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
