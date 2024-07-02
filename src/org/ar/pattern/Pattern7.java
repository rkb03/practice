package org.ar.pattern;

import java.util.Scanner;

/*
*****
*   *
*   *
*****
 */
public class Pattern7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int l = sc1.nextInt();

		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= l; j++) {
				if (i == 1 || i == w || j == 1 || j == l) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
