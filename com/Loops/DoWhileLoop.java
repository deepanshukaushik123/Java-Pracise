package com.Loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int i=1;
		do {
			System.out.println(num+ " x "+ i + "= "+ num*i);
			if (i==4) {
		//		break;
			}
			i++;
		} while(i<=10);

	}

}
