package com.enh;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Calculator{
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double number1, number2;
		double result;
		char operator;
		while(true){
			System.out.println("Enter first number: ");
			try{
				number1 = Double.parseDouble(br.readLine());
				break;
			}catch(NumberFormatException nfe){
				System.out.println("Cannot convert string to numbers!");
			}catch(IOException ioe){
				System.out.println("Ioexception occurred!");
			}
		}
		while(true){
			System.out.println("Enter second number: ");
			try{
				number2 = Double.parseDouble(br.readLine());
				break;
			}catch(NumberFormatException nfe){
				System.out.println("Cannot convert string to numbers!");
			}catch(IOException ioe){
				System.out.println("Ioexception occurred!");
			}
		}
		while(true){
			try{
				System.out.print("Enter operator(+, -, *, /): ");
				String operation=br.readLine();
				if(operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/")){
					operator=operation.charAt(0);
					break;
				}
				System.out.println("Invalid operator!");
				System.out.println("Do you want to exit from program[Y/N]!: ");
				String exit=br.readLine();
				if(exit.equalsIgnoreCase("Y")){
					return;
				}
				else if(exit.equalsIgnoreCase("N")){
					continue;
				}
				else{
					System.out.println("Invalid Option!");
				}
			}catch(IOException ioe){
				System.out.println("Ioexception occurred!");
			}
		}
		switch(operator){
			case '+'-> {System.out.println("Addition of two numbers is: "+(number1+number2));
				break;
			}
			case '/'-> {
				try{
					System.out.println("Division of two numbers is: "+(number1/number2));
					break;
				}catch(ArithmeticException ae){
					System.out.println("Divide by zero exception!");
				}
			}
			default->System.out.println("Invalid operator!");
		}
 	}

}
