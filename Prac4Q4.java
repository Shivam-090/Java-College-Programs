// 4. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for
// each operation whose real and imaginary parts are entered by the user.
// Name: Shivam
// Roll No: 21CSU090

import java.util.*;

class Complex{
	double sum = 0.0, diff = 0.0, prod = 0.0;
	double real1,real2, imaginary1, imaginary2;
	Complex(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter R1 & I1");
		real1 = sc.nextDouble();
		imaginary1 = sc.nextDouble();
		System.out.println("Enter R2 & I2");
		real2 = sc.nextDouble();
		imaginary2 = sc.nextDouble();
		System.out.println("First Equation is = " + real1 + " + " + imaginary1+ "i");
		System.out.println("Second Equation is = " + real2 + " + " + imaginary2+ "i");
	}
	void getSum(){
		double sumreal = real1 + real2;
		double sumimg = imaginary1 + imaginary2;
		System.out.println("Sum of Complex Number = " + sumreal + " + " + sumimg + "i");
	}

	void getDiff(){
		double diffreal = real1 - real2;
		double diffimg = imaginary1 - imaginary2;
		if (diffimg < 0) {
			System.out.println("Difference of Complex Number = " + diffreal + "" + diffimg + "i");	
		}
		else{
			System.out.println("Difference of Complex Number = " + diffreal + " + " + diffimg + "i");
		}
	}

	void getProd(){
		double prodreal = (real1 * real2 - imaginary1*imaginary2);
		double prodimg = (real1*imaginary2 + imaginary1*real2);
		System.out.println("Product of Complex Number = " + prodreal + " + " + prodimg+"i");
	}
}

public class Prac4Q4{
	public static void main(String[] args) {
		Complex ob = new Complex();
		ob.getSum();
		ob.getDiff();
		ob.getProd();

	}
}