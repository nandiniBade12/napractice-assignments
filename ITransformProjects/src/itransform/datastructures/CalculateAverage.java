package itransform.datastructures;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] s1=new int[3];
		int[] s2=new int[3];
		int[] s3=new int[3];
		
		int totalA=0, totalB=0, totalC=0;
		int total1=0, total2=0, total3=0;
//		float averageA=0, averageB=0, averageC=0;
		
		System.out.println("Enter marks of student 1 for subjects A,B,C:");
		for(int i=0;i<3;i++) {
			s1[i] = sc.nextInt();
		}
		
		System.out.println("Enter marks of student 2 for subjects A,B,C:");
		for(int i=0;i<3;i++) {
			s2[i] = sc.nextInt();
		}
		
		System.out.println("Enter marks of student 3 for subjects A,B,C:");
		for(int i=0;i<3;i++) {
			s3[i] = sc.nextInt();
		}	
			
		for(int i=0;i<3;i++) {
			total1 += s1[i];
		}
		System.out.println("Total of student 1 = " + total1);
		
		for(int i=0;i<3;i++) {
			total2 += s2[i];
		}
		System.out.println("Total of student 2 = " + total2);
		
		for(int i=0;i<3;i++) {
			total3 += s3[i];
		}
		System.out.println("Total of student 3 = " + total3);
		
		System.out.println("Average of student 1 = " + (total1/3));
		System.out.println("Average of student 2 = " + (total2/3));
		System.out.println("Average of student 3 = " + (total3/3));
		
		totalA=(s1[0]+s2[0]+s3[0]);
		System.out.println("Total score in subject A = " + totalA);
		totalB=(s1[1]+s2[1]+s3[1]);
		System.out.println("Total score in subject B = " + totalB);
		totalC=(s1[2]+s2[2]+s3[2]);
		System.out.println("Total score in subject C = " + totalC);
		
		System.out.println("Average score in subject A = " + totalA/3);
		System.out.println("Average score in subject B = " + totalB/3);
		System.out.println("Average score in subject C = " + totalC/3);
		
	}

}
