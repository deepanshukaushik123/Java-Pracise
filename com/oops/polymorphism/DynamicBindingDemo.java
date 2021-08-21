package com.oops.polymorphism;
class Animal {
	void speak() {
		System.out.println("Animal is speaking");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.println("Dog is barking");
	}
}
public class DynamicBindingDemo {

	public static void main(String[] args) {
		//Normal OverRiding
		Dog dog=new Dog();
		dog.speak();

		//DynamicBinding
		Animal animal=new Dog();
		animal.speak();
	}

}
