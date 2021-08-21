package com.test;

import java.util.Scanner;

public class CalculateTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		
		System.out.println("Addition of two no. will be= "+ c);
		System.out.println("Subtraction of two no. will be= "+ d);
		System.out.println("Multiplication of two no. will be= "+ e);
		System.out.println("Division of two no. will be= "+ f);
		System.out.println("Reminder of two no. will be= "+ g);
		
		System.out.println(d < e?"Yes":"No"); //Ternary operator
		

	}

}
