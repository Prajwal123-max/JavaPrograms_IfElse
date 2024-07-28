/*
 * check weather given num is Lowercase ASCII num or not
 */
package org;

import java.util.Scanner;

public class LowercaseAsciiCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		if(n>=97 && n<=122) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
