/*
Define the class hierarchy as detailed in the following class diagram:
Write an application TestCylinder that uses the above class definitions 
to maintain and display: 
a) Radius
b) Height
c) base area and 
d) volume of a cylinder.
Definition of Done:
a) The class definitions are defined as per the class diagram.
b) Each class definition is stored in its own .java file.
c) Base class constructors are invoked using super keyword
d) Use  getArea  ()  function  of  the  base  class  in  the  definition  of getVolume()
Name: Shivam
Roll no: 21CSU090
*/

import java.util.*;

public class CircleInheritance{
	public static void main(String args[]){
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is " + cy1.getRadius() + ", Height is " + cy1.getHeight() + ", Color is " + cy1.getColor() 
			+ ", Base area is " + cy1.getArea() + ", Volume is " + cy1.getVolume());
		Cylinder cy2 = new Cylinder(5.0,2.0);
		System.out.println("Radius is " + cy2.getRadius() + ", Height is " + cy2.getHeight() + ", Color is " + cy2.getColor()
		 + ", Base area is " + cy2.getArea() + ", Volume is " + cy2.getVolume());
	}
}

class Circle{
	double radius;
	String color;
	Circle(){
		this.radius = 1.0;
		this.color = "red";
		System.out.println("Construced a Circle with Circle()");
	}
	Circle(double radius){
		this.radius = radius;
		this.color = "red";
		System.out.println("Construced a Circle with Circle(double radius)");
	}
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	   	System.out.println("Construced a Circle with Circle(radius, color)");
	}
	double getRadius(){
		return this.radius;
	}
	void setRadius(double radius){
		this.radius= radius;
	}
	String getColor(){
		return this.color;
	}
	void setColor(String color){
		this.color = color;
	}
	double getArea(){
		return radius*radius*3.14;
	}
}
class Cylinder extends Circle{
	double height;
	Cylinder(){
		super();
		this.height = 1.0;
		System.out.println("Constructed a Cylinder with Cylinder()");
	}
	Cylinder(double radius){
		super(radius);
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(radius)");
	}
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
	}
	Cylinder(double radius, double height, String color){
		super(radius, color);
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
	}
	double getHeight(){
		return this.height;
	}
	void setHeight(double height){
		this.height = height;
	}
	double getVolume(){
		return getArea()*height;
	}
}