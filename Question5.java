package task1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) 
	{
		// TO find the prime number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
	    boolean value = false;
        	  
	    if (num==0 || num==1) 
	    {
	        value=true;	        
	    }

	    for (int i=2; i<=num/2; ++i) 
	    {           
	      if (num%i==0) 
	      {
	        value=true;
	        break;
	      }
	    }

	    if (!value)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}



