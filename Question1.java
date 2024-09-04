package task1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
		{
		// Whether, Sum of A & B is greater than sum of C & D
		int a, b, c, d;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		c=sc.nextInt();
		System.out.println("Enter the value of d: ");
		d=sc.nextInt();
		
		if ((a+b)>(c+d))
			System.out.println("Sum of a and b is greater than b and c");
		else
			System.out.println("Sum of a and b is not greater than b and c");		

	}

}
