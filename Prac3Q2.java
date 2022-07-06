// 2. Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions.
// Definition of Done:
// DoD 1: The program should ask the user to enter the elements of the array.
// DoD 2: The program should ask the user to enter a number to search.
// DoD 3: The program should display the elements of the array entered.
// DoD 4: The program should display the index of the number if the item is present or display -1 of the elements is not present.

// Name: Shivam
// Roll no: 21CSU090

import java.util.*;

class Prac3Q2{
	public static void main(String []args){
	int arr[] = new int[10];
	int temp = -1;
	System.out.println("Enter the elements in the array");
	Scanner obj = new Scanner(System.in);
	for( int i = 0; i < 10; i ++){
		arr[i] = obj.nextInt();
	}
	System.out.println("Array : ");
	for( int i = 0; i < 10; i ++){
		System.out.print(arr[i] + ", ");
	}
	System.out.println("\nEnter the number you want to find in the array : ");
	int find = obj.nextInt();
	for( int i = 0; i < 10; i ++){
		if(arr[i] == find){
			temp = i;
		}
	}
	if ( temp == -1){
		System.out.println("The entered element is not in the array and index number = " + temp);
	}
	else{
	System.out.println("Index number of the given number is " +temp);
    }
	}
}
