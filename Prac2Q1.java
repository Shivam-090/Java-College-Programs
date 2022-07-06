// Practical 2

// Question 1: Write a Java program to solve quadratic equations (use if, else if and else).
// Definition of Done:
// DoD 1: The program asks the values of coefficients of a quadratic equation. DoD 2: The program should display the roots or an appropriate message.

// Name: Shivam
// Roll No.: 21CSU090

import java.util.*;
import java.lang.Math;

public class Prac2Q1{
	public static void main(String[] args){
		System.out.println("Write a program to print roots of a quadratic equation.");
		double a, b, c, discriminant, root1, root2, realr, imgr;
		System.out.println("Enter values of a, b and c of your equation.");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		discriminant = b * b - 4 * a * c;

		if (discriminant > 0)
		{
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Root 1 = " + root1 + "and Root 2 = " + root2);
    	} 

    	else if (discriminant == 0)
    	{
		root1 = root2 = -b / (2 * a);
        System.out.println("Both roots are = "+ root1);
    	}
    
    	else
    	{
        realr = -b / (2 * a);
        imgr = Math.sqrt(-discriminant) / (2 * a);
        System.out.println("Root 1 = " + realr +" + " + imgr +"i" + " and Root 2 = " + realr + " - " + imgr+"i");
    	}
	}
}