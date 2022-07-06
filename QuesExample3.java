/*
Write a program to print the area of a cone by creating a class named 'Cone' taking the values of its radius and height as parameters of its
constructor and having a method named 'returnVolume' which returns the volume of the cone. Radius and height of the rectangle are entered
through the keyboard.
*/

import java.util.*;
import java.lang.*;

class Cone{
	double area = 0.0, volume = 0.0;
	Cone(double radius, double height){
	 area = (3.14 * radius * ( radius + (Math.sqrt((height*height)+(radius*radius)))));
	 volume = (3.14 * (radius*radius) * height) / 3;
	}
	double returnVolume(){
		return volume;
	}
	double returnArea(){
		return area;
	}
}

public class QuesExample3{
	public static void main(String[] args) {
		double radius, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		radius = sc.nextDouble();
		System.out.println("Enter Height :");
		height = sc.nextDouble();
		Cone ob = new Cone(radius, height);
		System.out.println("Area of Cone is: " + ob.returnArea());
		System.out.println("volume of Cone is: " + ob.returnVolume());
	}
}

