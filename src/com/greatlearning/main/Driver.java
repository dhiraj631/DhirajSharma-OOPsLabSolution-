package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.demo.*;
import com.greatlearning.service.CredentialService;

public class Driver {
	
	private static final Scanner sc = new Scanner(System.in);
	//using scanner get first name, last name and department for the employee
	public static void main(String args[])
	{
		
		System.out.println("Enter your first name:");
		String firstname = sc.nextLine();
		System.out.println("Enter your last name:");
		String lastname = sc.nextLine();
		System.out.println("Please enter the department from the folloiwng \n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal ");
		int choice = sc.nextInt();
		
		Employee emp;
		
		switch( choice ) {
			case 1:
				emp = new Employee( firstname, lastname, "tech" );
				break;
			case 2:
				emp = new Employee( firstname, lastname, "adm" );
				break;
			case 3:
				emp = new Employee( firstname, lastname, "hr" );
				break;
			case 4:
				emp = new Employee( firstname, lastname, "lg" );
				break;
			default:
				System.out.println( "Incorrect choice" );
				return;
		}

			//generate email
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress( emp );
		String password = cs.GeneratePassword();
		cs.showCredentials(emp, email, password);


		}
		
		
		
	}
	