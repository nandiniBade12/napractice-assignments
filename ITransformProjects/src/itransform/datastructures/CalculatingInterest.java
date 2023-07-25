package itransform.datastructures;

import java.util.Scanner;

//Formula for CI is A = P(1 + R/100)T CI = A – P

public class CalculatingInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		double p = sc.nextDouble();
		System.out.println("Enter time in years:  ");
		float t = sc.nextFloat();
		System.out.println("Enter annual rate of interest: ");
		float r = sc.nextFloat();
		double si,ci;
		
		if(p>0 && t>0 && r>0) {
			si = (p*t*r)/100;
			ci = p * Math.pow((1.0+r/100),t) - p;
			System.out.println("Simple Interest= " + si);
			System.out.println("Compound Interest= " + ci);
			
		}
		else {
			System.out.print("Enter correct values");
		}
		
		sc.close();
	}

}
