package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = (a>b)? "First number is greater then second number":"Second number is greater than First number";
		System.out.println("The result is : "+result);
	}

}
