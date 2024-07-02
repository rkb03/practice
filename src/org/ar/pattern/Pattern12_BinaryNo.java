package org.ar.pattern;

import java.util.Scanner;
/*
10101
01010
10101
01010
10101
 */
public class Pattern12_BinaryNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag=true;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(flag) {
					System.out.print(1);
					flag=false;
				}else {System.out.print(0);
				flag=true;}
			}System.out.println();
		}
	}

}
