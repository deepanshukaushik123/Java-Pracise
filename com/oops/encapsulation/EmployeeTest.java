package com.oops.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("Deepanshu");
		obj.setAddress("Delhi, India");
		obj.setAge(18);
		obj.setSalary(50000D);
//		System.out.println(obj);
		
		Employee obj2=new Employee();
		obj2.setName("Amit");
		obj2.setAddress("Delhi, India");
		obj2.setAge(19);
		obj2.setSalary(35000D);
//		System.out.println(obj2);
		
		Employee obj3=new Employee();
		obj3.setName("Shikha");
		obj3.setAddress("Delhi, India");
		obj3.setAge(18);
		obj3.setSalary(42000D);
		
		
		Employee [] employees=new Employee[3];
		employees[0]=obj;
		employees[1]=obj2;
		employees[2]=obj3;
		
		for (Employee emp:employees) {
			System.out.println("Name:- "+emp.getName()+"\t Age:- "+emp.getAge()+"\t Sallary:- "+emp.getSalary()+"\t Address:- "+emp.getAddress());
		}
	}
	

}
