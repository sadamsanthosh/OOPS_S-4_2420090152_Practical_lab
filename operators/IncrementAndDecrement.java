package operators;

import java.util.Scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println();
		

		System.out.println("Before PrefixIncrement : "+x);
		System.out.println("Prefix increment : "+(++x));
		System.out.println("The prefix increment of x is " +x);
		System.out.println();
		
		System.out.println("Before Increment : "+x);
		System.out.println("Postfix increment : "+(x++));
		System.out.println("The postfix increment of x is " +x);
		System.out.println();
		
		System.out.println("Before Prefix decrement : "+x);
		System.out.println("Prefix decrement : "+(--x));
		System.out.println("The prefix decrement of x is " +x);
		System.out.println();
		
		System.out.println("Before postfix decrement : "+x);
		System.out.println("Postfix decrement : "+(x--));
		System.out.println("The postfix decrement of x is " +x);
		
	}

}
