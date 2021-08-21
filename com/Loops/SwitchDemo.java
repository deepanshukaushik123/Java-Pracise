package com.Loops;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		System.out.println("**********ACCOUNT STATEMENT***********");
		
		System.out.println("To Cheak balance 1");
		System.out.println("To Update balance 2");
		System.out.println("Print Statement 3");
		System.out.println("Exit 4");
		
		System.out.println("Enter your choice:");
		
	Scanner sc=new Scanner(System.in);
	
		int num=sc.nextInt();
	switch (num) {
	
	case 1: {
		System.out.println("100000");
		break;
	}
	
	case 2: {
		System.out.println("Sorry this feature is currently unavailable");
		break;
	}
	
	case 3: {
		System.out.println("00000 transferred");
		break;
	}
	case 4: {
		System.out.println("Exit");
		break;
	}
	default: {
		System.out.println("You have not chosen the right option");
		break;
	}

}
}
}