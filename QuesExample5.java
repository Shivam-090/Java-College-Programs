/*
Assign and print the roll number, phone number and address of 2 students having names "sam" and "john" respectively by creating two objects
of class 'Student'. 
*/

import java.util.*;
import java.lang.*;
class QuesExample5{
	public static void main(String args[]){
		Student sam = new Student();
		Student john = new Student();
		sam.name = "Sam";
		sam.roll_no=20;
		sam.phone_no=213552;
		sam.address="home";
		john.name = "John";
		john.roll_no=21;
		john.phone_no=32839293;
		john.address="ghar";
		System.out.println(sam.name+ " "+sam.roll_no+" "+sam.phone_no+" "+sam.address);
		System.out.println(john.name+ " "+john.roll_no+" "+john.phone_no+" "+john.address);
	}
}

class Student{
	int roll_no;
	int phone_no;
	String address, name;
}