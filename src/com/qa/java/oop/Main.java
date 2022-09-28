package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
		
		int x;
		x = 50;
		
		
		
		EmloyeeData danielle;
		danielle = new EmloyeeData(); //an employee object is created
		
		danielle.id = 1;
		danielle.name = "Danielle";
		danielle.department = "Student";
		danielle.gender = 'f';
		danielle.salary = 18500.0;
		danielle.age = 23;
		
		
		System.out.println("id: " + danielle.id);
		System.out.println("Name: " + danielle.name);
		System.out.println("Department: " + danielle.department);
		System.out.println("Gender: " + danielle.gender);
		System.out.println("Salary: " + danielle.salary);
		System.out.println("Age: " + danielle.age);
		
		EmloyeeData falguni = new EmloyeeData();
		falguni.name = "Falguni";
		falguni.id = 2;
		falguni.department = "Student";
		falguni.gender = 'f';
		falguni.salary = 18000.0;
		falguni.age = 30;
		
		System.out.println("id: " + falguni.id);
		System.out.println("Name: " + falguni.name);
		System.out.println("Department: " + falguni.department);
		System.out.println("Gender: " + falguni.gender);
		System.out.println("Salary: " + falguni.salary);
		System.out.println("Age: " + falguni.age);
		
		
		
		

	}

}
