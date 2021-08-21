package com.test;

public class StaticDemo {
	static int x=50;
	int y=50;
		
		void add () {
			x=x+10;
			y=y+10;
				
		}
		
		public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
		System.out.println("X="+x +"\tY="+obj.y); // x=50 , y=50
		obj.add();
		System.out.println("X="+x +"\tY="+obj.y); // x=60 , y=60
		/*
		 * this is descrriptive comment
		 */
		StaticDemo obj2=new StaticDemo();
		System.out.println("X="+x +"\tY="+obj.y); //x=60 , y=60
		obj.add();
		System.out.println("X="+x +"\tY="+obj.y); //x=70 , y=70
		

	}
	

}
