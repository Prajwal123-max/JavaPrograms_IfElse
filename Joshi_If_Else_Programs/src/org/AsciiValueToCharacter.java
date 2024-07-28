/*
 * convert ASCII character to num.
 */
package org;

import java.util.Scanner;

public class AsciiValueToCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char c=s.nextLine().charAt(0);
		
		int ans=(int)c;
		System.out.println("ASCII value of Character: "+ans);
	}

}
