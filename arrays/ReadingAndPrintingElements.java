package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndPrintingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to read elements and print them on console
		// With user input 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of the array: ");
				int n = sc.nextInt();
				int arr[] = new  int[n];
				System.out.print("Enter the elements of the array: ");
				for(int i=0;i<n;i++) {
					arr[i]= sc.nextInt();
				}
				
				System.out.println(Arrays.toString(arr));

	}

}
