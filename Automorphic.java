package com.numberProgram;

public class Automorphic {
	static boolean isAutomorphic(int n) {
		int sq = n*n;
		int m = n;
		int length = 0;
		int k = 1;
		
		while(n>0) {
			n/=10;
			length++;
		}
		
		for(int i=1;i<=length;i++) {
			k*=10;
		}
		if(sq%k==m) {
			return true;
		} else
			return false;
		
	}
	public static void main(String[] args) {
		//int num = 25;
		int st = 1;
		int end = 1000;
		boolean arm = true;
		for(int i=st;i<=end;i++) {
			if(isAutomorphic(i)==true) {
				//if(arm) {
				System.out.println(i);
//				}
//				arm = !arm;
			}
			
		}
		
		
		
//		 System.out.println("Automorphic Number");
//		 System.out.println("Not a Automorphic Number");
	}

}
