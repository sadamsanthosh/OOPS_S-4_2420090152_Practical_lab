package controlstatements;

import java.util.Scanner;

public class Numberpositiveornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//Check if a number is positive
				System.out.print("Enter any number:");
				Scanner sc = new Scanner(System.in);
				int x = sc.nextInt();
				if (x>0) System.out.println("The given number "+x+" is positive");
				else System.out.println("The given number "+x+" is negative");
	}

}
