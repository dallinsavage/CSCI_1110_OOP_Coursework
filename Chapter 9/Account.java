/* Dallin Savage
 * 8/5/20
 */

import java.util.Date;

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
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(.045);
		account1.setBalance(account1.withdraw(2500));
		account1.setBalance(account1.deposit(3000));
		System.out.println("Balance: " + account1.getBalance());
		System.out.println("Monthly interest: " + account1.getMonthlyInterest());
		System.out.println("Date created: " + account1.getDateCreated());
	}
}