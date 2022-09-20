package org.greatlearning.service;

import java.util.Scanner;

import org.greatlearning.model.Emp;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp("krishna","roy");
		CredentialService credentialService=new CredentialService();
		int ch;
			System.out.println("Please enter the department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.HumanResource");
			System.out.println("4.Legal");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				String email=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"tech");
				char[] password=credentialService.generatePassword();
				credentialService.showCredentials(e, email, password);
				break;
			case 2:
				String email1=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"admin");
				char[] password1=credentialService.generatePassword();
				credentialService.showCredentials(e, email1, password1);
				break;
			case 3:
				String email2=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"hr");
				char[] password2=credentialService.generatePassword();
				credentialService.showCredentials(e, email2, password2);
				break;
			case 4:
				String email3=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"legal");
				char[] password3=credentialService.generatePassword();
				credentialService.showCredentials(e, email3, password3);
				break;
				default:
					System.out.println("Please Input Your Correct Department In 1/2/3/4");
			}
		

	}

}
