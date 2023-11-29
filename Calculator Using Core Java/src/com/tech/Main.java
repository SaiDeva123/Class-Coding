package com.tech;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Operation op=new Operation();
		System.out.println("Select the Options from bellow");
		
		System.out.println("1. For Addition \n 2. For Substraction \n 3. For Division \n 4. For Multiplication");
		
		Scanner sc=new Scanner(System.in);
		
		   int a= sc.nextInt();
		   
		   switch(a)
		   {
		   case 1:
			    System.out.println("Enter the first X Integer value");
			          int x=  sc.nextInt();
			          System.out.println("Enter the Second Y Integer value");
			            int y= sc.nextInt();
			      op.add(x, y);
			   
		   }
		
	}

}
