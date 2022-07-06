import java.util.*;

public class Prac2Q2{
	public static void main(String[] args){
		System.out.println("Enter Alphabet :");
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase();
        boolean vowels = word.equals("a") || word.equals("e") || word.equals("i") || word.equals("o") || word.equals("u");

		if (word.length() > 1) {
			System.out.println("Error!");
		}

		else if (vowels) {
			System.out.println("Is Vowel");
		}

		else{
			System.out.println("Is Consonant");
		}
	}
}