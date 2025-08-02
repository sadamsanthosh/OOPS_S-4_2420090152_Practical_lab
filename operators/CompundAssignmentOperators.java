package operators;

import java.util.Scanner;

public class CompundAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y=1;
		
		System.out.println("Compound Assignment Operators:");
	    System.out.println("Perfomed operator is += and the value is "+(x+=y));
	    System.out.println("Perfomed operator is -= and the value is "+(x-=y));
	    System.out.println("Perfomed operator is *= and the value is "+(x&=y));
	    System.out.println("Perfomed operator is /= and the value is "+(x/=y));
	    System.out.println("Perfomed operator is %= and the value is "+(x%=y));
	    System.out.println();

	    System.out.println("Bitwise Compound Assignment Operators:");
	    System.out.println("Perfomed operator is &= and the value is "+(x&=y));
	    System.out.println("Perfomed operator is |= and the value is "+(x|=y));
	    System.out.println("Perfomed operator is ^= and the value is "+(x^=y));
	    System.out.println("Perfomed operator is <<= and the value is "+(x<<=y));
	    System.out.println("Perfomed operator is >>= and the value is "+(x>>=y));
	    System.out.println("Perfomed operator is >>>= and the value is "+(x>>>=y));
	}

}
