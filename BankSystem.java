package Myprojects;

import java.util.Scanner;

public class BankSystem {
	double balance=0;
	public void Deposit(double amount) {
	if(balance>0) {
			balance=balance+amount;
			System.out.println("Deposited:Your Balance is:"+balance);
		}
		else {
			System.out.println("invalid deposit");
		}
	}
		public void withdraw(double amount) {
			if(amount>0&&amount<=balance) {
				balance=balance-amount;
				System.out.println("succefully withdraw: "+balance);
			}
			else {
				System.out.println("insufficientbalance");
			}
		}
			public void currentbalance() {
				System.out.println("current balance:"+balance);
			}
			
			public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankSystem account=new BankSystem();
		System.out.println("please enter your amount:");
		double d=sc.nextDouble();
		account.Deposit(d);
		System.out.println("enter your withdrwal amount:");
		double d1=sc.nextDouble();
		account.withdraw(d1);
		account.currentbalance();
sc.close();
	}

}
