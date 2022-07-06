/*create a class shape with parameters x,y,z create construtors for the class shape. the member functions of the 
class are cal area rectangle , cal area triangle , cal area circle, also create a demo calss in main function. */

import java.util.*;
import java.lang.*;

class Demo{
	public static void main(String []args){
		double x, y, z;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		x = obj.nextDouble();
		Shape cr = new Shape(x); 
		System.out.println("Enter the length and breadth of the rectangle : ");
		x = obj.nextDouble();
		y = obj.nextDouble();
		Shape rec = new Shape(x, y);
		System.out.println("Enter the Sides of the triangle : ");
		x = obj.nextDouble();
		y = obj.nextDouble();
		z = obj.nextDouble();
		Shape tri = new Shape(x, y, z);
		System.out.println("Area of the Circle : " + String.format("%.2f",cr.calareacricle()));
		System.out.println("Area of the Rectangle : " + String.format("%.2f",rec.calarearect()));
		System.out.println("Area of the Triangle : " + String.format("%.2f",tri.calareatri()));
	}
}

class Shape{
	double radius, length, breadth, side1, side2, side3;
	Shape(double x){
		radius = x;
	}
	Shape(double x, double y){
		length = x;
		breadth = y;
	}
	Shape(double x, double y, double z){
		side1 = x;
		side2 = y;
		side3 = z;
	}
	double calarearect(){
		return length*breadth;
	}
	double calareatri(){
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	double calareacricle(){
		return 3.14*radius*radius;
	}
}