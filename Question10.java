package task1;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) 
	{
		// To find number of digits in integer
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value: ");
		int a=sc.nextInt();
		int count=0; 
	    while (a!=0)
	    {
	    	a/=10;
	    	count++;
	    }
		System.out.println("number of digits in an integer is " + count);
		

	}

}
