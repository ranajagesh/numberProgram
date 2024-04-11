package com.numberProgram;

public class Fibonacci {

	public static void main(String[] args) {
		boolean fab  =true;
		int a =0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<=20;i++) {
			c = a+b;
						
				if (fab) {
	            System.out.print(c + " ");
				a = b;
				b = c;
			}
			fab = !fab;
			
			
		}
	}

}
