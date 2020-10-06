/* Dallin Savage
 * 10/5/20
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Loan implements Serializable {
	private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /** Construct a loan with specified annual interest rate,
      number of years and loan amount 
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
  
  public static void outputData() throws IOException, ClassNotFoundException {
	  File file = new File("Exercise17_7.dat");
	  ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
	  double total = 0;
	  try {
		  while (true) {
		  Loan newLoan  = (Loan) input.readObject();
		  total = total + newLoan.getLoanAmount();
		  }
	  }
	  catch (EOFException ex) {
		  System.out.println(total);
		  input.close();
	  }
	  }
  
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	 File file = new File("Exercise17_7.dat");
	  Loan l1 = new Loan();
	  Loan l2 = new Loan(2.5, 1, 5000);
	  ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
	  output.writeObject(l1);
	  output.writeObject(l2);
	  output.close();
	  outputData();
  }
}

