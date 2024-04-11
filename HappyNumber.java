package com.numberProgram;

public class HappyNumber {

	public static int isHappy(int n) {
		int sum = 0;
		while(n>0) {
			int r = n%10;
			int sq = r*r;
			sum+=sq;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int m  =13;
		int n =m;
		while(n!=1 && n!=4) {
			isHappy(n);
		}
		if(n==1) System.out.println("Happy Number");
		else System.out.println("Not Happy Number");
	}

}
