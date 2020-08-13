  
/* Dallin Savage
 * 8/13/20
 */

import java.util.Date;
import java.util.Scanner;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	Account() {
	}
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	public double withdraw(double withdraw) {
		return balance - withdraw;
	}
	public double deposit(double deposit) {
		return balance + deposit;
	}
}

class testAccount {
	public static void main(String[] args) {
		Account[] accountArray = new Account[10];
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Account(i, 100);
		}
		Scanner input = new Scanner(System.in);
		boolean run = true;
		while (run = true) {
			System.out.println("Enter an id");
			int idSelect = input.nextInt();
			if (idSelect > 9) {
				System.out.println("Enter a valid id"); }
				else {
					int select = 0;
					while (select != 4) {
					System.out.println("Main menue");
					System.out.println("Enter a choice");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					select = input.nextInt();
					if (select == 1) {
						System.out.println("Balance: $" + accountArray[idSelect].getBalance());
					}
					else if (select == 2) {
						System.out.println("Enter withdraw amount");
						double withdraw = input.nextDouble();
						accountArray[idSelect].setBalance(accountArray[idSelect].withdraw(withdraw));
						System.out.println("New balance: $" + accountArray[idSelect].getBalance());
					}
					else if (select == 3) {
						System.out.println("Enter deposite amount");
						double deposit = input.nextDouble();
						accountArray[idSelect].setBalance(accountArray[idSelect].deposit(deposit));
						System.out.println("New Balance: $" + accountArray[idSelect].getBalance());
					}
					else if (select == 4) {
						break;
					}
					}
				}
			}
		}
	}
