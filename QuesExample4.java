/* 
Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print avg.
*/

import java.util.*;

class QuesExample4{
	public static void main(String args[]){
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a, b, and c :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Average ob = new Average(a, b, c);
		System.out.println("Average of 3 numbers is : " + ob.returnAvg());
	}
}

class Average{
	int average = 0;
	Average(int a, int b, int c){
		average = (a+b+c)/3; 
	}
	int returnAvg(){
		return average;
	}
}