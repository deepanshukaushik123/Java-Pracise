package com.test;

public class StaticDemo2 {
	void show () {
		System.out.println("show");	
	}
	static void display () {
		System.out.println("display");
	} 
	public static void main(String[] args) {
		display(); //static field can be shown directly
		new StaticDemo2().show();  //object to show non static field
	//	StaticDemo2 obj=new StaticDemo2();  //full fleged object
		
	
}
	/*
	 * This  is static block we can have them as many as we want
	 * 
	 * This static block run before main meathod
	 * 
	 * @Deepanshu
	 */
	static {
		System.out.println("2");
	}
	//init block or instance block
	{
		System.out.println("3");
		System.out.println("4");
	}

}
