package com.test;

public class ReverseString {

	public static void main(String[] args) {
//		String str="abcd";
//		String rev="";
//		for (int i=str.length()-1;i>=0;i--) {
//			
//		//	System.out.print(str.charAt(i));
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println("befor reverse : "+ str);
//		System.out.println("after reverse : "+ rev);
		
	//	String str="abcd";
		
		String xyz="abcd";
		int bcd=1234;
		String aas=String.valueOf(bcd); //for int
		String str=String.valueOf(xyz); //for string
		StringBuffer  abc=new StringBuffer(str);
		StringBuffer asd=new StringBuffer(aas);
		
		System.out.println(abc.reverse());
		System.out.println(asd.reverse());
		

			}

}
