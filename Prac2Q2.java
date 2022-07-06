// Practical 2

// Question 2: Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
// Definition of Done:
// DoD 1: The program asks an input from the user.
// DoD 2: A single character input is taken from the user or an error message is generated.
// DoD 3: The program should print "Vowel" if the entered character is a vowel and "Consonant" if the entered character is a consonant.

// Name: Shivam
// Roll No.: 21CSU090

import java.util.*;

public class Prac2Q2{
	public static void main(String[] args){
		System.out.println("Enter Alphabet :");
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase();

		boolean uppercase = word.charAt(0) >= 65 && word.charAt(0) <= 90;
        boolean lowercase = word.charAt(0) >= 97 && word.charAt(0) <= 122;

        boolean vowels = word.equals("a") || word.equals("e") || word.equals("i") || word.equals("o") || word.equals("u");

		if (word.length() > 1) {
			System.out.println("Error!");
		}

		else if (!(uppercase || lowercase)) {
			System.out.println("Error! Not a Alphabet");
		}

		else if (vowels) {
			System.out.println("Is Vowel");
		}

		else{
			System.out.println("Is Consonant");
		}
	}
}