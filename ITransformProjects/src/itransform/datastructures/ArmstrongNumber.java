package itransform.datastructures;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static int isArmstrong(int n) {
		
		int sum=0;
		int digits=0;
		int rem=0;
		int temp =n;
		int fact=0;
		
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		
		while(temp!=0) {
			rem=temp%10;
			sum += Math.pow(rem, digits);
			temp=temp/10;
		}
		
		
		if(n==sum)
			fact=1;
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number " );
		int N = sc.nextInt();
	
		if(isArmstrong(N)==1)
			System.out.println(N + " is a armstrong number");
		else
			System.out.println(N + " is not a armstrong number");
		sc.close();

	}

}
