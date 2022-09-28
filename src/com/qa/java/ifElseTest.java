package com.qa.java;

public class ifElseTest {

	public static void main(String[] args) {

		/*
		 * int number; number = 97; if(number % 2 == 0) { System.out.println(number
		 * +" is even."); } else { System.out.println(number + " is odd."); }
		 */

		int experience;
		experience = 7;
		String department;
		department = "S";
		float salary;
		salary = 25000;

		if (experience > 2 && department == "D") {
			salary = salary * 1.1f;
			System.out.println("new salary is " + salary);
		} else if (experience > 5 && department == "S") {
			salary = salary * 1.08f;
			System.out.println("new salary is " + salary);
		} else {
			System.out.println("Salary remains as " + salary);
		}

	}

}
