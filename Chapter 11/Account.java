/* Dallin Savage
 * 8/5/20
 */

import java.util.Date;

public class Account {
	protected int id = 0;
	protected double balance = 0;
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

class SavingsAccount extends Account {
	SavingsAccount() {
	}
	SavingsAccount(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	public String toString() {
		return "Account Id: " + id + " Balance = " + balance;
	}
}

class CheckingAccount extends Account {
	private double overdraftLimit = 500;
	CheckingAccount() {
	}
	CheckingAccount(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public String toString() {
		return "Account Id: " + id + " Balance = " + balance + " Overdraft Limit = " + overdraftLimit;
	}
}

class testAccount {
	public static void main(String[] args) {
		SavingsAccount savings1 = new SavingsAccount(1212, 1000);
		CheckingAccount checking1 = new CheckingAccount(1213, 2000);
		System.out.println(savings1.toString());
		System.out.println(checking1.toString());
	}
}