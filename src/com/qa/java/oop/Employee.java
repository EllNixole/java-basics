package com.qa.java.oop;

public class Employee {

	
	
		// State (data)
		
		int id;
		String name;
		String department;
		double salary;
		int age;
		char gender;
		
		//Each employee object will have its own state
		Employee(){
			System.out.println("New Employee Added Without Details");
		}

		public Employee(int id, String name, String department, double salary, int age, char gender) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
			this.age = age;
			this.gender = gender;
		}
		
		
		

	

}
