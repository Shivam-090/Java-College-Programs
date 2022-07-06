/*
Create a class car with string variable name and integer variable rc_number. Assign the value of rc_number 
as 7777 and that of name as BMW by creating an object of that class car.
*/

class QuesExample1{
	public static void main(String args[]){
		Car obj = new Car();
		obj.name = "BMW";
		obj.rc_number = 7777;
		System.out.println("Name = " + obj.name);
		System.out.println("rc_number = " + obj.rc_number);
	}
}

class Car{
	String name;
	int rc_number;
}