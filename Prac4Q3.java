// 3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
// constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
// Name: Shivam
// Roll No: 21CSU090

import java.util.*;

class Area{
	double area = 0.0;
	Area(double length, double breadth){
	 area = length*breadth;
	}

	double returnArea(){
		return area;
	}
}

public class Prac4Q3{
	public static void main(String[] args) {
		double length, breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :");
		length = sc.nextDouble();
		System.out.println("Enter Breadth :");
		breadth = sc.nextDouble();
		Area ob = new Area(length, breadth);

		System.out.println("Area of rectangle is: " + ob.returnArea());
	}
}