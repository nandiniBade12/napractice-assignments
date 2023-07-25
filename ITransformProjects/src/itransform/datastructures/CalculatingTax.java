package itransform.datastructures;

import java.util.Scanner;

public class CalculatingTax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ctc of employee: ");
		double income = sc.nextDouble();
		double tax_amount=0;
		
		if(income>0) {
			if(income<=180000) {
				tax_amount=0;
			} else if(income>180000 && income<=300000) {
				tax_amount = 0.1 * income ;
			} else if(income>300000 && income<=500000) {
				tax_amount = 0.2 * income;
			} else if(income>500000 && income<=1000000) {
				tax_amount = 0.3 * income;
			}
			System.out.println("Tax to be paid: "+ tax_amount);
			
		} else {
			System.out.println("Enter valid ctc of employee");
		}
		sc.close();

	}

}
