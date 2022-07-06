// Write a Java Program to count even and odd numbers in an array.
// Definition of Done
// DoD 1: The program should ask the user to enter the elements of the array.
// DoD 2: Even elements will be stored in EvenArray[] and odd elements will be stored in oddArray[].
// DoD 3: Display all three arrays along with their length.
// Name: Shivam
// Roll no. 21CSU090

import java.util.*;

class Prac3Q3{
	public static void main(String []args){
	int arr[] = new int[10];
	int evenarray[] = new int[10];
	int oddarray[] = new int[10];
	int evensum = 0, oddsum = 0;
	System.out.println("Enter the elements in the array");
	Scanner obj = new Scanner(System.in);
	for( int i = 0; i < 10; i ++){
		arr[i] = obj.nextInt();
	}
	for( int i = 0; i < 10; i ++){
		if ((arr[i] % 2) == 0){
			evensum += arr[i];
			evenarray[i] = arr[i];
			
		}
		else {
			oddsum += arr[i];
			oddarray[i] = arr[i];
		}

	}
	System.out.println("Length of the even array : " + evenarray.length);
	System.out.println("Even array : ");
	for( int i = 0; i < 10; i ++){
		System.out.print(evenarray[i]+ ", ");
	}
	System.out.println("Length of the odd array : " + oddarray.length);
	System.out.println("Odd array : ");
	for( int i = 0; i < 10; i ++){
		System.out.print(oddarray[i]+ ", ");
	}

	System.out.println("\nSum of even elements : " + evensum);
	System.out.println("Sum of odd elements : " + oddsum);

	}
}