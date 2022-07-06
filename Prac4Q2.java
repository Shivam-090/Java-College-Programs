// 2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
// by creating a class named 'Triangle' without any parameter in its constructor.
// Name: Shivam
// Roll no: 21CSU090

import java.util.*;
import java.lang.Math;

class Triangle{
	double s = 0.0, p = 0.0, area = 0.0,a,b,c;
	double getArea(){
		s = (a+b+c)/2.0;
		area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
		return area;
	}

	double getPerimeter(){
		p = a+b+c;
		return p;
	}
}

public class Prac4Q2{
	public static void main(String[] args) {
		Triangle ob = new Triangle();
		ob.a = 3.0; ob.b = 4.0; ob.c = 5.0;
		System.out.println("Area is = " + ob.getArea());
		System.out.println("Perimeter is = " + ob.getPerimeter());
	}	
}