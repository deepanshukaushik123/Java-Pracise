package com.Loops;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		int c=a+b;
	
		//IF ELSE statement
		
		if (c>40) {
			System.out.println("Greater value");
		}else if (c == 40) {
			System.out.println("Equal value");
		}
		else {
				System.out.println("Smaller value");
			
		}
	}

}
