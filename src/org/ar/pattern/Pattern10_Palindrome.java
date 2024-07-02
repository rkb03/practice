package org.ar.pattern;

import java.util.Scanner;

/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

 */
public class Pattern10_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			--ch;
			for(int j=1;j<=i-1;j++) {
				System.out.print(--ch);
				
			}
			System.out.println();
		}
		
	}

}
