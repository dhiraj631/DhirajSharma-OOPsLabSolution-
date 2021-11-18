package com.greatlearning.service;
import com.greatlearning.demo.Employee;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress( Employee emp ) {
		// generate email address and return it (use the emp getters to get the first name, last name and dept)
		// firstNamelastName@dept.abc.com
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment()+ ".abc.com";
	}


	public String GeneratePassword(){
		Random random = new Random();
		String AllowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$*()?.=+^&*<>\r\n";
		char[] password = new char[8];
	
		for( int i = 0; i < 8; i++ ) {
		int idx = random.nextInt(AllowedChars.length()); // generates an integer between 0 - length of allowedChars string
		password[i] = AllowedChars.charAt( idx );
	}
	
		return new String( password );
	}

	public void showCredentials(Employee emp,String email, String Password) {
		System.out.println( "Dear " + emp.getFirstName() + " - here are your credentials" );
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + Password );
	}

	
}