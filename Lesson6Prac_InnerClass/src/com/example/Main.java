package com.example;

import java.util.function.IntPredicate;

public class Main {
	public static int sum(int[] numbers, IntPredicate c) {
		int total = 0;
		for(int n: numbers) {
			if(c.test(n)) {
				total += n;
			}
		}
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate and initialize
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(sum(numbers,new CheckOddNumber()));
//		System.out.println(sum(numbers,new CheckEventNumber()));
//		
//		int result = sum(numbers, new Calculate() {
//			public boolean checkNumber(int n) {
//				return true;
//			}
//		});
//		System.out.println(result);
		int result = sum(numbers, n->n%2==0);
		System.out.println(result);
		
		result = sum(numbers, n->n%2!=0);
		System.out.println(result);
		
		result = sum(numbers, n->n%3!=0);
		System.out.println(result);
		result = sum(numbers, n->true);
		System.out.println(result);
	
	}

}
