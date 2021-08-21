package com.Loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		/*
		 * Syntax of while loop
		 * while (condition) {
		 * Statement
		 *  increment/decrement
		 * }
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for table:");
		int num=input.nextInt();
		int i=1;
		while (i<=100) {
			System.out.println(num+ " x "+ i + "= "+ num*i);
			i++;
		}

	}

}
