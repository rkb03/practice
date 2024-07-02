package org.ar.math;

public class HarshadNumber {//P-3

	public static void main(String[] args) {

		int num=1132;
		boolean flag = hnum(num);
		if(flag) {
			System.out.println("Is num, a Harshad No. ? :: Yes");
		}else {
			System.out.println("Is num, a Harshad No. ? :: No");
		}
		
	}

private static boolean hnum(int n) {
	int rem=0;
	int sum=0;
	int temp=n;
	while(n!=0) {
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	
	if(temp%sum==0) {
		return true;
	}else return false;
}
}
