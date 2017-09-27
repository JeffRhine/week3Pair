package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface BankTeller {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<BankCustomer> accounts = new ArrayList<>();//has to be created outside of the while
		
		while(true) {
			BankCustomer bc= new BankCustomer();
			BankAccount bA=new BankAccount();
			DollarAmount money = new DollarAmount(0, 0);
			String accountNumber = new String();
	System.out.println("Welcome to Fly By Night Bank!");
	System.out.println("");
	System.out.println("Please select an option");
	System.out.println("[1] >> Add a customer");
	System.out.println("[2] >> View a customer");
	
	String userChoice = scan.nextLine();
	
	System.out.println();
	
	if(userChoice.equals("1")) {
		
		System.out.print("Enter customer Name >>> ");
		String name= scan.nextLine();
		 bc.setName(name);
		System.out.print("Enter customer Address >>> ");
		String address= scan.nextLine();
		bc.setAddress(address);
		System.out.print("Enter customer Phone Number >>> ");
		String phoneNumber= scan.nextLine();
		bc.setPhoneNumber(phoneNumber);
		accounts.add(bc);
		
	} else if(userChoice.equals("2")&& (accounts.size()==0)) {  
			 System.out.println("No customer exists yet. Please create one.");
			 System.out.println(" ");
				System.out.print("Enter customer Name >>> ");
				String name= scan.nextLine();
				 bc.setName(name);
				System.out.print("Enter customer Address >>> ");
				String address= scan.nextLine();
				bc.setAddress(address);
				System.out.print("Enter customer Phone Number >>> ");
				String phoneNumber= scan.nextLine();
				bc.setPhoneNumber(phoneNumber);
				accounts.add(bc);
			 
	}
	else if(userChoice.equals("2")){
		for(BankCustomer account:accounts){
		System.out.println(account.getName());		
		System.out.println(account.getAddress());		
		System.out.println(account.getPhoneNumber());
		System.out.println("");
		System.out.println("Do you want to:");
		System.out.println("[1] >> Add an Account");
		System.out.println("[2] >>  Deposit or Withdraw");
		System.out.println("[3] >> View Existing Accounts");

		String userChoice2 = scan.nextLine();
		
		System.out.println();
		
		if(userChoice2.equals("1")) {
			System.out.println("[1] >> Add an Account");
			System.out.println("");
			System.out.println("(C)hecking or (S)avings:");
			String userChoice3 = scan.nextLine();
			if(userChoice3.equalsIgnoreCase("c")){
				CheckingAccount ck = new CheckingAccount();
				bc.addAccount(ck);
			}else if(userChoice3.equalsIgnoreCase("s")){
				SavingsAccount sk = new SavingsAccount();
				bc.addAccount(sk);
			}
			System.out.println("Enter Account Number:");
			 accountNumber= scan.nextLine();
			
			bA.setAccountNumber(accountNumber);
			continue;
		}else
		if(userChoice2.equals("2")){
			System.out.println("[2] >> Deposit or Withdraw");
			System.out.println("");
			System.out.println("Enter Acct #:");
			String userChoice4 = scan.nextLine();
			if(!userChoice4.equalsIgnoreCase(bA.getAccountNumber())){
				System.out.println("no such account");
			}else {
				System.out.println("(D)eposit or (W)ithdraw");
				if(userChoice4.equalsIgnoreCase("d")){
					System.out.println("Amount($)___");
					 money= (new DollarAmount(0, 0));
					bA.deposit(money);
					System.out.println("");
					System.out.println("Deposited  $"+money+" to "+ accountNumber +". Final balance is: $" + bA.getBalance());
				}else if(userChoice4.equalsIgnoreCase("w")){
					System.out.println("Amount($)___");
					 money= (new DollarAmount(0, 0));
					bA.withdraw(money);
					System.out.println("");
					System.out.println("Withdrew  $"+money+" from "+ accountNumber +". Final balance is: $" + bA.getBalance());
				}
				 if(userChoice.equals("3")&& (accounts.size()==0)) {  
					 System.out.println("No accounts excist yet. Please create one.");
					 System.out.println(" ");
						System.out.println("(C)hecking or (S)avings:");
						String userChoice3 = scan.nextLine();
						if(userChoice3.equalsIgnoreCase("c")){
							CheckingAccount ck = new CheckingAccount();
							bc.addAccount(ck);
						}else if(userChoice3.equalsIgnoreCase("s")){
							SavingsAccount sk = new SavingsAccount();
							bc.addAccount(sk);
						}
						System.out.println("Enter Account Number:");
						 accountNumber= scan.nextLine();
						
						bA.setAccountNumber(accountNumber);
				}else if(userChoice.equals("3")){
					System.out.println("[3] >> View Existing Accounts");
					System.out.println(" ");
					System.out.println("Account #     Type      Balance ");
					for(BankCustomer acct:accounts){
					System.out.println( bA.getAccountNumber()+ bA+bA.getBalance());
					}
				}
			}
			
		}
	}
	
		   
	}   //System.exit(0);
}
		
	
		}
}

