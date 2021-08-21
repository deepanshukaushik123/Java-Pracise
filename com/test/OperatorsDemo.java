package com.test;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
	//	int z=20;
		
		System.out.println(x >= y); //False  RELATIONAL OPERATOR
		System.out.println(x <= y); //True
		
		System.out.println(x == y); //False COMPARISON OPERATOR
		
		System.out.println(x / y);
		
		System.out.println(x + y);
		
		System.out.println(x < y && y>x);
		
		System.out.println(x < y?"Yes":"No"); //Ternary Operator
		System.out.println(x > y?"Yes":"No");
		
		System.out.println(10+30+"hi"+20+10);
		
		
		System.out.println(x+ "\t"+ y);
	//	x++;  
	//	++y;
		int a=x++;  //Difference b/w post and pre increment
		int b=++y;
		System.out.println(x + "\t"+ y);
		System.out.println(a + "\t"+ b);
		
		a=x--;
		b=--y;
		System.out.println(x + "\t"+ y);
		System.out.println(a + "\t" + b);
	}

}
