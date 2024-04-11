package com.numberProgram;

public class Palindrome {
	
	static boolean isPalindrome(int n) {
		int rev = 0;
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n/=10;			
		} return true;
	}

	public static void main(String[] args) {
		int num = 122;
		if(isPalindrome(num)== true) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a palindrome ");
		}
	}
}
