package com.LogicalProgramming;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		String str=sc.next();
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
