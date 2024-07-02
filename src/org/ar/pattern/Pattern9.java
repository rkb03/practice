package org.ar.pattern;

import java.util.Scanner;

/*

5432*
543*1
54*21
5*321
*4321

 */
public class Pattern9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i==j) {System.out.print("*");}
				else
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
