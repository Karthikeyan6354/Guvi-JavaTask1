package task1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
		// To find a number whether even or odd
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int a= sc.nextInt();
		if (a%2==0)
			System.out.println("Given number is an Even Number");
		else
			System.out.println("Given number is an Odd number");
		
				
	}

}
