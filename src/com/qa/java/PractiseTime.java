package com.qa.java;

import java.util.Scanner;

public class PractiseTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		name = "Danielle";

		int age;
		age = 23;

		boolean living;
		living = true;

		Scanner userInp = new Scanner(System.in);

		while (living = true) {
			String response = userInp.nextLine();

			if (response.equals("birthday")) {
				age++;
				System.out.println(name + " is " + age);
			} else if (response.equals("dead")) {
				living = false;
				System.out.println(name + " has passed away.");
			} else {
				System.out.println("Something went wrong");
			}
		}

	}

}
