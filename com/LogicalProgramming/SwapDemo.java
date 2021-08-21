package com.LogicalProgramming;

public class SwapDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before Swap a=" +a+"\tb= "+ b);
		//Swap number using 3rd variable
//		int temp=a;
//		a=b;
//		b=temp;
		
		//Swap number without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap  a=" +a+"\tb= "+ b);
			
	}

}
