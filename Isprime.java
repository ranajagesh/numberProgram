package com.numberProgram;

public class Isprime {
	
	public static void main(String[] args) {
		boolean isPrime = true;
		int start = 1;
		int end = 10;
		for(int i=start;i<=end;i++) {
			int count = 0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				if(isPrime) {
				System.out.println(i);
				} 
					isPrime = !isPrime;
				
			}
		}		
	}
}
