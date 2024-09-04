package task1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		// Swapping the value of 2 integers
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of a: ");
		int a =sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		int c=0;
		System.out.println("a and b value, before Swapping: "+a+" "+b);
		c=a;
		a=b;
		b=c;		
		System.out.println("a and b value, after Swapping: "+a+" "+b);
		
		
		
		
		

	}

}
