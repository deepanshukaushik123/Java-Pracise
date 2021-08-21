package com.StringClass;

public class StringDemo {

	public static void main(String[] args) {
		
		String sbc=new String("abc").intern(); 
		String axg="abc";
		System.out.println(sbc==axg);
		
		String str=new String("abc"); //  Heap area
		//String str=new String("abc"); // 1-object

		
		String str2="abc"; // String pool //1-object //3x2=6 bytes
	//	char [] str2= {'a','b','c'};
		
		//Memory management
		// 1+1+1+1+1+1=6
		String str11="abc"+"xyz" + new String ("123"); //6 x 6=36 bytes
		/*
		 * How str11 will work:-
		 * 1. new String("abc"); 		1-object
		 * 2. new String("xyz"); 		1-object
		 * 3. new String(abcxyz"); 		1-object
		 * 4. new String("123"); 		1-object
		 * 5."abcxyz123"				1-object
		 * 6.new String("abcxyz123"); 	1-object
		 */
		
	//	StringBuffer(is thread safe) & StringBuilder(is not thread safe) class
		StringBuffer sb=new StringBuffer("abc"); //1-object
		sb.append("xyz");		
		sb.append("123");
		
		
		String str3=new String("abc");
		String str4="abc";
		
		if(str==str3) { //Different Object
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

		if(str2==str4) { //Same Object
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(str2==str4?"yes":"no"); //Using ternary operator
	}

}
