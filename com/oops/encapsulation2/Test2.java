package com.oops.encapsulation2;

import com.oops.encapsulation.AccessModifiers;

public class Test2 {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println(obj.name);  		//Private:- not accessible
		System.out.println(obj.age);		//Default:- not accessible
		System.out.println(obj.address);	//Public
		System.out.println(obj.salary);		//Protected:- not accessible
	}

}
