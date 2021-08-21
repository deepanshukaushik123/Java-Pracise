package com.oops.encapsulation;
/*
 *  POJO:- Plain Old Java Object / Bean Class
 * 1. All variables should be private
 * 2. Generate Getter/Setter meathod
 * 3. Create Default constructor
 * 4. Generate parameterized constructor
 * 5. Override toString() meathod
 */
public class Employee {
	private String name;
	private int age;
	private Double salary;
	private String address;
	public String getName() {
		return name;
	}
	public Employee() {
		
	}
	// Parameterized constructor
	public Employee(String name, int age, Double salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	
	//Getter and Setter meathod
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
