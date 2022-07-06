/*
2. Create three classes:
- Class Vehicle:
Vehicle Class will contain a display() function, which will say "This is a Vehicle".
- Class Car:
Car Class will derive the Vehicle Class and overwrite its display() function. it will say "This is a Car".
- Class Bike:
Bike Class will derive the Vehicle Class and overwrite its display() function. it will say "This is a Bike".
Write an application that reads an Integer N, which will denote the number of tyres in the vehicle. You have to create an object of the 
appropriate class according to the value of N and use it display() function.
If N = 2, Create a Bike Object. If N = 4, Create a Car Object.
Create a Vehicle Object, otherwise.
Definition of Done:
DoD 1: Each class definition is stored in its own .java file.
DoD 2: Switch statement is used for identifying the appropriate class for which the object is to be invoked.
Name: Shivam
Roll no: 21CSU090
*/

import java.util.*;
public class Prac5Q2{
	public static void main(String args[]){
		int N;
		Scanner sc = new Scanner(System.in);
		Vehicle ob = new Vehicle();
		Bike ob1 = new Bike();
		Car ob2 = new Car();
		System.out.println("Enter the number of tyres in the Vehicle");
		N = sc.nextInt();
		switch (N) {
			case 1:
				ob.display();
				break;
			case 2:
				ob1.display();
				break;
			case 3:
				ob.display();
				break;
			case 4:
				ob2.display();
				break;
			default:
				break;
		}
	}
}

class Vehicle{
	void display(){
		System.out.println("This is Vehicle");
	}
}

class Car extends Vehicle{
	void display(){
		System.out.println("This is a Car");
	}
}

class Bike extends Vehicle{
	void display(){
		System.out.println("This is a Bike");
	}
}