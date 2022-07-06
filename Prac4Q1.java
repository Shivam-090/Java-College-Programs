// 1.	Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
// Name: Shivam
// Roll No: 21CSU090

import java.util.*;

class Student{
	String name;
	int roll_no;
}

class Prac4Q1 {
	public static void main(String args[]){
		Student obj = new Student();
		obj.name = "John";
		obj.roll_no = 2;

		System.out.println("Name = " + obj.name);
		System.out.println("Roll_no = " + obj.roll_no);
	}
}