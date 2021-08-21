package com.test;

import java.util.Scanner;

public class OddEvenDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter number:");
		int num = new Scanner(System.in).nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Even number");
			
		}
		else {
			System.out.println("Odd  number");
		}

  /*		Scanner input = new Scanner(System.in);
		System.out.println("enter number to cheak if it is Odd or Even");
		int a=input.nextInt();
		int b= a%2;
		if (b==0) {
			System.out.println("This number is even");
			
		}
		else {
			System.out.println("This number is odd");
		} */
		
	}

}
