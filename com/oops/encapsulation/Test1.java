package com.oops.encapsulation;

public class Test1 {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
	//	System.out.println(obj.name);  		//Private:- not accessible
		System.out.println(obj.age);		//Default
		System.out.println(obj.address);	//Public
		System.out.println(obj.salary);		//Protected
	}

}
