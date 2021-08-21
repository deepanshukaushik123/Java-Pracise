package com.LogicalProgramming;

import java.util.Scanner;

public class GreaterValue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=input.nextInt();
		int	b=input.nextInt();
		int	c=input.nextInt();
		
		if (a>b && a>c) {
			System.out.println("A is greatest among all three");
		}
		else if (b>a && b>c) {
			System.out.println("B is greatest among all three");
		}
		else {
			System.out.println("C is greatest among all three");
			
		}
	
	}

}
