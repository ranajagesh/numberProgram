package com.numberProgram;

public class Strong {

	static int isStrong(int num) {
		int sum = 0;		
		while(num>0) {
			int fact = 1;
			int rem = num%10;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			num/=10;		
		} return sum;
	}
	
	public static void main(String[] args) {
		int start = 3;
		int end = 100000;
		for(int i=start;i<=end;i++) {
			if(isStrong(i)==i) {
				System.out.println(i);
			}
		}
	}

}
