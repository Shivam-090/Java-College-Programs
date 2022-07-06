// 5. Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double.
// Definition of Done:
// DoD 1: Two java files to be defined. One for class definitions and another for the application
// DoD 2: A class point is defined with two float variables for x1 and x2 and the following functionality:
// i.	Non-parametrized and parameterized constructors are defined.
// ii.	Get and set methods are defined for all the instance variables.
// iii.	Distance function is defined to calculate the distance between two points.
// iv.	Display function is defined with width of 7 and precision of 2.
// Write this program with a static method definition for calculating the distance between two points.

// Name: Shivam
// Roll No. : 21CSU090

import java.util.*;
import java.lang.*;

public class Prac4Q5{
	public static void main(String[] args){
		float x1, x2, y1, y2;
		TwoPoint p = new TwoPoint();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the points of 1st coordinate (x1, y1) :");
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		System.out.println("Enter the points of 2nd coordinate (x2, y2) :");
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		TwoPoint p1 = new TwoPoint(x1,y1,x2,y2);
		p1.getDist();
		p1.display();
	}
}