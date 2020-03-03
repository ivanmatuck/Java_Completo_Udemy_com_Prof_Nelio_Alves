package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ContaProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is ther na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response =='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(conta, nome, initialDeposit);
		}
		else {
			account = new Account(conta, nome);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);		
		System.out.println("Updated account data: \n" + account);
		
		System.out.print("\nEnter a withdraw value: ");
		double whithdrawValue = sc.nextDouble();
		account.whithdraw(whithdrawValue);
		System.out.println("Updated account data: \n" + account);


		

		
		sc.close();
	}

}
