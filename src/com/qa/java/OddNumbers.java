package com.qa.java;

public class OddNumbers {

	public static void main(String[] args) 
	{
		
		//Print all odd numbers from 1-1000
		
		int number = 1;
		
		while(number <= 1000) 
		{
			if(number % 2 == 0)
			{
				number++;
			}
			else
			{
				System.out.println(number);
				number++;
			}
	
		}

	}

}
