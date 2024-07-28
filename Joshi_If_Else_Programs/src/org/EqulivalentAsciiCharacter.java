/*
 * convert number into ASCII character.
 */
package org;

import java.util.Scanner;

public class EqulivalentAsciiCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		char ans=(char)n;
		System.out.println("Equivalent of ASCII Character: "+ans);
	}

}
