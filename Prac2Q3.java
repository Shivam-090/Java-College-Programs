// Practical 2

// 3.	Write a Java program to print following structure:
// *
// **
// ***
// ****
// *****
// ******

// Name: Shivam
// Roll


import java.util.*;

public class Prac2Q3{
	public static void main(String[] args){
		System.out.println("Enter Number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}
	}
}