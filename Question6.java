package task1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		// To find the factorial value of given number
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value: ");
		int val=sc.nextInt();
		int n=1;
		for (int i=1;i<=val;i++)
			n*=i;
		System.out.println("Factorial number of "+val+ " is "+ n);
			

	}

}
