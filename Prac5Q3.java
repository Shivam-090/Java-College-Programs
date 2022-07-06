/*
Define a class Box with the following instance variables: width, height and depth, all of type float. Create a new class BoxWeigth that extends 
Box to include weight as an instance variable. Write an application that tests the functionalities of both these classes.
Definition of Done:
DoD 1: Three java files to be defined. One for each class definition: Box, BoxWeight and BoxWeightDemo.
DoD 2: Box and BoxWeight should have three types of constructors defined: clone of an object, all dimensions specified as arguments, no argument.
DoD 3: Super is used to call base class constructors in derived class
DoD 4: Get and set functions defined as applicable in Box and BoxWeight classes.
DoD 5: Function to display volume in Box class and weight in BoxWeigth class
Name: Shivam
Roll No: 21CSU090
*/

import java.util.*;


class Boxx{
	double height;
	double length;
	double width;

	Boxx(Boxx b){
		this.height=b.height;
		this.length=b.length;
		this.width=b.width;
	}

	Boxx(double height,double length,double width){
		this.height=height;
		this.length=length;
		this.width=width;
	}

	Boxx(){
		height=55.5;
		length=70.0;
		width=30.5;
	}

	void get(){
		System.out.println("Length,Width,Height:"+length+width+height);
	}

	void set(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		length=s.nextDouble();
		System.out.println("Enter width:");
		width=s.nextDouble();
		System.out.println("Enter height:");
		height=s.nextDouble();
	}

	void vol(){
		System.out.println("Volume:"+(length*width*height));
	}

}

class Boxweight extends Boxx{
	double weight;

	Boxweight(Boxweight bw){
		this.weight=bw.weight;
	}

	Boxweight(double weight){
		this.weight=weight;
	}

	Boxweight(){
		super();
		weight=30.0;
	}

	void getw(){
		System.out.println("Weight:"+weight);
	}

	void setw(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter weight:");
		weight=s.nextDouble();
	}

	void disweight(){
		System.out.println("Weight:"+weight);
	}
}

class Prac5Q3{
	public static void main(String args[]){
		Boxweight bw=new Boxweight();
		bw.vol();
		bw.disweight();
	}
	
}	