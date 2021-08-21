package com.LogicalProgramming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String to reversse:");
		String abc = input.next();
		
	//	int xyz=Integer.parseInt(abc); 	TO COVERT STRING TO INT
		StringBuffer  obj=new StringBuffer(abc);
	
		System.out.println(obj.reverse());
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}

	}

}
