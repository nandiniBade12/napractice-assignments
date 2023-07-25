package itransform.datastructures;

import java.util.Scanner;

public class DeclaringResult {
	
	public static String findingResult(int m1,int m2, int m3) {
		if(m1>60 && m2>60 && m3>60) {
			return "Passed";
		}
		else if((m1>60 && m2>60) || (m2>60 && m3>60) || (m1>60 && m3>60)) {
			return "Promoted";
		}
		else {
			return "Failed";
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of mathematics " );
		int m1 = sc.nextInt();
		System.out.println("Enter marks of physics " );
		int m2 = sc.nextInt();
		System.out.println("Enter marks of chemistry " );
		int m3 = sc.nextInt();
		
		System.out.println("Result is " +findingResult(m1,m2,m3));
		

	}

}
