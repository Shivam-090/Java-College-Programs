// 4. Write a Java program to read numbers in an integer array of size 5 and display the
// following (using functions for each functionality):
// i) Sum of all the elements
// ii) Sum of alternate elements in the array.
// Definition of Done
// DoD 1: The program should ask the user to enter the elements of the array.
// DoD 2: The program should display a menu with the above choices and ask the user to
// choose one of the choices.
// Shivam 
// 21CSU090

import java.util.*;

class Prac3Q4 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int a, sum = 0, alsum1 = 0, alsum2 = 0;
        System.out.println("Enter the elements in the array : ");
        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        System.out.println(
                "Press 1 for Sum of all the elements\nPress 2 for Sum of alternate elements in the array\nPress 0 to exit");

        do {
            a = obj.nextInt();
            if (a == 1) {
                System.out.println("Total sum of the elements =" + sum_all(arr));
            } else if (a == 2) {
                alt_sum(arr);
            } else if (a >= 3) {
                System.out.println(
                        "Enter the number between 0 and 2\nPress 1 for Sum of all the elements\nPress 2 for Sum of alternate elements in the array\nPress 0 to exit");
            }
        } while (a != 0);
    }

    static int sum_all(int arr[]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];

        }
        return sum;
    }

    static void alt_sum(int arr[]) {
        int alsum1 = 0, alsum2 = 0;
        for (int i = 0; i < 5; i++) {
            if ((i % 2) == 0 || i == 0) {
                alsum1 += arr[i];
            } else if ((i % 2) != 0 || i != 0) {
                alsum2 += arr[i];
            }
        }
        System.out.println("Alternate sum : " + alsum1 + " and " + alsum2);
    }
}
