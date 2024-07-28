/*
 * check weather the given num is Even or Odd without using Modulus(%) operator.
 */
package org;

import java.util.Scanner;

public class EvenOrOddWithoutUsingModulusOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num which you want to check: ");
		int n=s.nextInt();

		if(isEven(n)) {
			System.out.println("Given num is Even.");
		}else {
			System.out.println("Given num is Odd");
		}
	}
	public static boolean isEven(int n) {
		return (n&1)==0;
	}
}
