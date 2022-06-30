package emailapp;

import java.util.Scanner;

public class Email {
	
	// class properties
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "flynnandco.com";
	
	// Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	
	// Ask for the department	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\nEnter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2 ) { return "dev";}
		else if (depChoice == 3) { return "acc";}
		else { return ""; }
	}
	
	// Generate a random password	
	private String randomPassword(int length) {
		String passwordSet = "ASBDEFGIKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length()); // generate a random number between 1 and 26
			password[i] = passwordSet.charAt(rand); // build up the random password using the character at the random location
		}
		
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	// Set the alternate email
	
	// Change the password 

}
