package com.vishnu;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
     int marks;
          Scanner scanner = new Scanner(System.in);
          System.out.println("enter a number?");
          marks = scanner.nextInt();
      
//     if (num > 0) {
//     System.out.println(num+ "is a positive number");
//    		 
//	}else {
//		System.out.println(num+ "is a negative number");
//	}
          if (marks >= 90)
          System.out.println("grade A");
          
          else if (marks >= 80)
          System.out.println("grade B");
          
          else if (marks > 70)
          System.out.println("grade c");
           
          else if (marks > 60)
          System.out.println("grade D");
          
          else 
        	  System.out.println("grade E");
	}
}
