package itransform.datastructures;

public class FindingArmstrongNumbers {
	
	public static int isArmstrong(int n) {
		
		int sum=0;
		int rem=0;
		int temp =n;
		int fact=0;
		
		while(temp!=0) {
			rem=temp%10;
			sum += Math.pow(rem, 3);
			temp=temp/10;
		}
		
		
		if(n==sum)
			fact=1;
		return fact;
	}

	public static void main(String[] args) {
	
		System.out.println("Armstrong numbers between 100 and 999 are ");
		for(int i=100;i<=999;i++) {
			if(isArmstrong(i)==1)
				System.out.println(i);
		}

	}

}
