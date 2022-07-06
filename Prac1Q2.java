// Practical 1

// Question 2: Write a Java program to convert minutes into the number of years, months and days. Definition Of Done :
// DoD 1: Ask the user to input the minutes
// DoD 2: Display years and months and days in the sequence yy-mm-dd.

// Name: Shivam
// Roll No.: 21CSU090

import java.util.*;

public class Prac1Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minutes");
		int min = sc.nextInt();
		int days = min / 1440; // 60 * 24
		int months = min / 43200; // 24 * 60 * 30
		int years = min / 525600; // 
		System.out.println(" " + years + " - " + months +" - " + days);
	}
}