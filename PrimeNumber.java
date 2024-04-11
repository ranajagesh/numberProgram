package com.numberProgram;
import java.util.*;
public class PrimeNumber {
	
	static boolean isPrime(int n) {
		if(n<=1) return false;
		int count = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count = 1;
				break;
			}
		}
		if(count==0) 
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
//		Scanner sc =  new Scanner(System.in);
//		System.out.println("Enter a Number ");
//		 int num =	sc.nextInt();
		System.out.println("Enter a Number ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num)) {
			System.out.println("Prime Number ");
		}
		else {
			System.out.println("Not a Prime Number ");
		}
		//sc.close();
	}
	

}
