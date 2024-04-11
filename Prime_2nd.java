package com.numberProgram;

public class Prime_2nd {

	public static void main(String[] args) {
		int primeCount = 0;
		int st = 1;
		int end = 100;
		
		for(int i=end;i>=st;i--) {
			int n = i;
			int count = 0;
			if(n<=1) {
			count++;
			}
			for(int j=2;j<=n/2;j++) {
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				primeCount++;
				if(primeCount==1)
				{
					System.out.println(n+" Prime Number ");
					//break;
				}
			}
			
		}
	}

}
