package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmpCredentialsImpl;

 class DriverApp {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Freddy");
			String f=sc.next();
			System.out.println("Waghale");
			String l=sc.next();
			
			Employee emp1=new Employee(f,l);
//		Employee emp2=new Employee();
//		emp2.setFname("Anubhav");public
//		emp2.setLname("Gupta");
			
			EmpCredentialsImpl cred=new EmpCredentialsImpl();
			
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. HR");
			System.out.println("4. Legal");
			
			System.out.println("Tech");
			int choice=sc.nextInt();
			String genEmail="";
			String genPassword="";
			switch(choice)
			{
			case 1:
						genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "tech");
						break;
			case 2:
						genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "admin");
						break;
			case 3:
						genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "hr");
						break;
			case 4:
						genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "legal");
						break;
			default : 	System.out.println("Please enter valid Input");
			}
			
			genPassword=cred.generatePassword();
			emp1.setEmailid(genEmail); //freddy.waghale@tech.gl.com
			emp1.setPassword(genPassword); //A34$yz12
			
			cred.showDetails(emp1);//fname,lname,id & pw
		}
	}

		
		
}


