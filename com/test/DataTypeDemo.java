package com.test;

// JVM Memory Allocation = 512MB

public class DataTypeDemo {
/* static */	int a=20; // 4 byte
/* static */ 	long b=200L; // 8 bytes
/*	static */	char c='A'; // 2 bytes
/* static */	double d=200.05D; //8 bytes
	 			float e=20.33F;
	 			// String is a array of characters
	 	static	String r="Deepanshu"; //['D','e','e','p','a',..]  9x2=18 bytes
	 			
	 			
	// Total=22 bytes FOR STATIC VARIABLE
	 		
	/*Total=22+22+22=66 bytes  FOR INSTANCE VARIABLE
	 		(It is preffered to use instance variable) */
	
	 		public static void main (String[] args) {
		
		DataTypeDemo obj1=new DataTypeDemo(); //22 bytes
		
		
		DataTypeDemo obj2=new DataTypeDemo(); //22 bytes
		
		
		DataTypeDemo obj3=new DataTypeDemo(); //22 bytes
		
		
		System.out.println(obj1.a);
		System.out.println(obj2.b);
		System.out.println(obj3.c);
		System.out.println(obj1.d);
		System.out.println(r);
	}

}
