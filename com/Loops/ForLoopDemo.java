package com.Loops;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number whose table you want:");
		int num=input.nextInt();
		
		// for(intialitaion;condition;increment/decrement) {}
 //		int num=3;
		for (int i=1; i<=10; i++) {
			System.out.println(num+ " x "+ i + "= "+ num*i);
		//	System.out.println("3 x "+ i + "= "+ 3*i);  one way of writing
			
		}
	}

}
