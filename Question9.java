package task1;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) 
	{
		// To find Senior citizen or not as per age
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if (age>=60)
			System.out.println("You are a Senior Citizen");
		else
			System.out.println("Your are not a Senior Citizen");

	}

}
