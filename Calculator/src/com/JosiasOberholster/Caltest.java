package com.JosiasOberholster;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Caltest 
{
	public static void main(String[] args)
	{
		new Caltest().Calculate();
	}
	
	public void Calculate()
	{
		String userInput1 = null;
		String userInput2 = null;
		String calMethod = null;
		BufferedReader reader1, reader2, cal;
		
		reader1 = new BufferedReader(new InputStreamReader(System.in));
		reader2 = new BufferedReader(new InputStreamReader(System.in));
		cal = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please input first unit");
		
		try
		{
			userInput1 = reader1.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Please input second unit");
		
		try
		{
			userInput2 = reader2.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		int unit1 = Integer.parseInt(userInput1);
		int unit2 = Integer.parseInt(userInput2);
		
		System.out.println("Choose One");
		System.out.println("[Add / Substract/ Multiply / Devide]");
		
		try
		{
			calMethod = cal.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		if(calMethod.equalsIgnoreCase("Add"))
		{
			Add(unit1, unit2);
		}
		else if(calMethod.equalsIgnoreCase("Substract"))
		{
			Substract(unit1, unit2);
		}
		else if(calMethod.equalsIgnoreCase("Multiply"))
		{
			Multiply(unit1, unit2);
		}
		else if(calMethod.equalsIgnoreCase("Devide"))
		{
			Devide(unit1, unit2);
		}
		else
		{
			System.out.println("Invalid input");
			Calculate();
		}
	}
	
	public static void Add(int x, int y)
	{
		int a = x + y;
		System.out.println(a);
	}
	
	public static void Substract(int x, int y)
	{
		int a = x - y;
		System.out.println(a);
	}
	
	public static void Multiply(int x, int y)
	{
		int a = x * y;
		System.out.println(a);
	}
	
	public static void Devide(int x, int y)
	{
		int a = x / y;
		System.out.println(a);
	}
}
