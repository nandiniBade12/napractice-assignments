package itransform.datastructures;

import java.util.Scanner;

public class CredentialCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(count>0) {
		
			System.out.println("Enter Login name: ");
			String name = sc.next();
			System.out.println("Enter password: ");
			String password = sc.next();
//			if(!(name.isBlank() || password.isBlank()))
				
				if((name.matches("^[a-zA-Z]*$") && password.length()<=8)){
					System.out.println("Welcome " + name);
					System.exit(0);
				} else {
					System.out.println("Enter valid login details..");
				}
				
				if(count==3) {
					System.out.println("Contact Admin");
					System.exit(0);
				}
				count++;
		}
		
		sc.close();
	}

}
