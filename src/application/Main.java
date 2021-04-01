package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Lorran", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Iasmin", 0.0, 400.00);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Gael", 0.0, 600.00);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loanLimit(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loanLimit(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
