package com.qa.java.oop;


public class Main {

	public static void main(String[] args) {
		
		
		
		Employee danielle = new Employee(1, "Danielle", "Development", 18500, 23, 'F');
		Employee falguni = new Employee(2, "Falguni", "Development", 18000, 25, 'F');
		
		
		
		System.out.println("id: " + danielle.id);
		System.out.println("Name: " + danielle.name);
		System.out.println("Department: " + danielle.department);
		System.out.println("Gender: " + danielle.gender);
		System.out.println("Salary: " + danielle.salary);
		System.out.println("Age: " + danielle.age);
		System.out.println();
		
		
		System.out.println("id: " + falguni.id);
		System.out.println("Name: " + falguni.name);
		System.out.println("Department: " + falguni.department);
		System.out.println("Gender: " + falguni.gender);
		System.out.println("Salary: " + falguni.salary);
		System.out.println("Age: " + falguni.age);
		System.out.println();
	
		
		
		

	}

}
