// Practical 3

// 1. Write a Java program to find the maximum and minimum value of an array.
// Definition of Done:
// DoD 1: The program should ask the user to enter the elements of the array.
// DoD 2: The program should display the maximum and minimum elements of the array.
// Name: Shivam
//Roll No: 21csu090

import java.util.*;

class Prac3Q1{
	public static void main(String []args){
	int arr[] = new int[10];
	int min = 0, max=0;
	System.out.println("Enter the elements in the array");
	Scanner obj = new Scanner(System.in);
	for( int i = 0; i < 10; i ++){
		arr[i] = obj.nextInt();
	}
		min = arr[0];
	for( int i = 0; i < 10; i ++){
		if (arr[i] < min){
			min = arr[i];
		}
		else if(arr[i] > max){
			max = arr[i];
		}
		}
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}
}
 