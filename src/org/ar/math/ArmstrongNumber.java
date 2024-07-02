package org.ar.math;

public class ArmstrongNumber { //P-2

	public static void main(String[] args) {

		int num=153;
		int sum = check(153);
		if(sum==num) {
		System.out.println("The given Number is Armstrong Number  :- "+ sum);}
		else {
			System.out.println("The given Number is not Armstrong Number :- "+sum);
		}
	}

	private static int check(int n) {

		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		return sum;
	}

}
