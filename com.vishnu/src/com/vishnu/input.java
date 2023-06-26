package com.vishnu;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("what is your name?");
	String name = scanner.nextLine();
	System.out.println("whatis your age?");
	int age = scanner.nextInt();
	scanner.nextLine();
	System.out.println("enter your E-mail?");
	String Email = scanner.nextLine();
	System.out.println("hello" + name);
	System.out.println("age is:" + age );
	System.out.println("email is:" + Email);
	
    
	}

}
