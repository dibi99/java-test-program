package com.vishnu;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
         int a, b;
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter a first number");
         a = scanner.nextInt();
         System.out.println("enter a second number");
         b = scanner.nextInt();
      char vp;
      System.out.println("enter a vp from the given below: +, -, *, /, %: ");
       vp = scanner.next().charAt(0);
       
       switch (vp) {
       case'+':
    	   System.out.println(a + "+" + b + "=" + ( a + b ));
    	   break;
    	   
       case '-':
    	   System.out.println(a + "-" + b + "=" + ( a - b ));
    	   break;
    	   
       case '*':
           System.out.println(a + "*" + b + "=" + ( a * b ));
           break;
           
       case'/':
    	   System.out.println(a + "/" + b + "=" + ( a / b ));
    	   break;
    	   
       case'%':
    	   System.out.println(a + "%" + b + "=" + ( a % b ));
    	   break;
    	   
    	default:
    		System.out.println("you have entered a wrong number");
       
       
       
       
       
       
       }
      
      
	} 
	
	

}
