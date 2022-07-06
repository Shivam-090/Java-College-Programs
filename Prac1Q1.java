// Program 1 
// Question 1: Write a program that takes two integers (values to be given within the program) and displays the output of the following operators:
// addition, subtraction, multiplication, division and modulus.

// Definition of Done:
// DoD 1: Assign two numbers to two variables.
// DoD2: Use separate variables to store the results.

// Name: Shivam
// Roll No.: 21CSU090

import java.util.*;

public class Prac1Q1{
	public static void main(String args[]){
		float a = 4, b = 7;
		int c = 4, d = 7;
		int sum = c + d;
		int sub = c - d;
		int mul = c * d;
		float div = (a / b);
		float mod = a % b;
		System.out.println("Print Sum " + " " + sum);
		System.out.println("Print Sub " + " " + sub);
		System.out.println("Print Multipy " + " " + mul);
		System.out.println("Print division " + " " + div);
		System.out.println("Print Modulus " + " " + mod);
	}
}