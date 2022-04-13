package com.wipro.calculator;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter number1 : ");
		num1=scan.nextInt();
		System.out.println("Enter number2 : ");
		num2=scan.nextInt();
		
		result=num1 + num2;
		System.out.println("Addition of two numbers :"+result );
        System.out.println("Welcome to stack route program");	}

}
