/*
Write a program to print the volume and perimeter of a cuboid having sidesof 5,7 and 8 units by creating a class named 'Cuboid' without
any parameter in its constructor.
*/

import java.util.*;

class QuesExample2{
	public static void main(String args[]){
		Cuboid obj = new Cuboid();
		obj.l = 5;
		obj.b = 7;
		obj.h = 8;
		System.out.println("Volume of cuboid is equals to = " + obj.volCuboid());
		System.out.println("Perimeter of cuboid is equals to = " + obj.perCuboid());
	}
}

class Cuboid{
	double l, b, h;
	double volCuboid(){
		return (l*b*h);
	}

	double perCuboid(){
		return (4*(l+b+h));
	}
}