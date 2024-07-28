/*
 * check weather the given num is add without using plus(+) operator.
 */
package org;

import java.util.Scanner;

public class AdditionWithoutUsingPluseOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first num: ");
		int a=s.nextInt();
		System.out.println("Enter the second num: ");
		int b=s.nextInt();

		int res=add(a, b);
		System.out.println("Ans: "+res);
	}
	public static int add(int a,int b) {
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry << 1;
		}
		return a;
	}
}
