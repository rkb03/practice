package org.ar.matrix;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int A[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int B[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println(A[i][j] + B[i][j]);
			}
		}
	}
}
/*
2 2
1 2
3 4
5 6
7 8
1 + 5 = 6
2 + 6 = 8
3 + 7 = 10
4 + 8 = 12
*/