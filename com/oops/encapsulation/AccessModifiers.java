package com.oops.encapsulation;
/*
 * Within Same class:-
 * 1. default: can access
 * 2. private: can access
 * 3. protected: can access
 * 4. public: can access
 * 
 * Outside of class but within same package:-
 * 1. default: can access
 * 2. private: can't access
 * 3. protected: can access
 * 4. public: can access
 * 
 * Outside of class and in another package:-
 * 1. default: can't access
 * 2. private: can't access
 * 3. protected: can't access
 * 4. public: can access
 * 
 *  Outside of class and in another package with inheritance:-
 * 1. default: can't access
 * 2. private: can't access
 * 3. protected: can access
 * 4. public: can access
 */
public class AccessModifiers {
	int age=20; //Default 
	private String name="Deepanshu";
	protected Double salary=50000D;
	public String address="Delhi";
	
	}
