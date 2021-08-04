package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			System.out.println();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter ammount for withdraw: ");
			Double withdraw = sc.nextDouble();
			System.out.println();
			acc.withdraw(withdraw);
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
