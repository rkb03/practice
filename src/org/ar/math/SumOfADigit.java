package org.ar.math;

public class SumOfADigit {//P-1

	public static void main(String[] args) {
//M-1::Normal Integer method using while loop
		int n = 123;
		int sum = digit(n);
		System.out.println(sum);
//M-2:String Approach::agar number Long datatype ke range se bhi bda ho 
		String s1 = "123";
		int sum1 = digitStringSum(s1);
		System.out.println(sum1);
	}

	private static int digitStringSum(String s1) {
		int sum1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			sum1 = sum1 + ch - 48;// to make value 0f char '1' from 49 to 1
		} // i.e. 49-48=1 Note:- '1' is different from 1
		return sum1;
	}

	private static int digit(int n) {
		int r;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			sum += r;
			n = n / 10;

			// System.out.println("r="+r +", sum = "+sum+" n ="+n);
		}
		return sum;
	}

}
