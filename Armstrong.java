package com.numberProgram;

public class Armstrong {
	static int isArmstrong(int n) {
		int m = n;
		int count = 0;
		int sum = 0;
		
		while(n>0) {
			n/=10;
			count++;
		}
		n = m;
		while(n>0) {
			int rem = n%10;
			sum = (int) (sum+Math.pow(rem, count));
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int st = 10;
		int end = 1000;
		for(int i=st;i<=end;i++) {
		if(isArmstrong(i)==i)
			System.out.println(i+ " is Armstrong Number");
		}
		
		
	

	}
}
