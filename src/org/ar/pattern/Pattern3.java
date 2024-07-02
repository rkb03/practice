package org.ar.pattern;
/*
   1
  12
 123
1234
 */

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			
			for(int ws=n-i;ws>=1;ws--) {//or for(int ws=1;ws<=n-i;ws++)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
