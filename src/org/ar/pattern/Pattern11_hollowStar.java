package org.ar.pattern;

import java.util.Scanner;

/*
 
*****
*  *
* *
**
*

 */
public class Pattern11_hollowStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==1||i==n||j==1||i==j) {
				System.out.print("*");}
				else { System.out.print(" ");}
				
			}
			System.out.println();
		}
	}

}
