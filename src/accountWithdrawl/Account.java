package accountWithdrawl;

import java.util.Scanner;

public class Account {
	
	private int amount = 10000;
	private int debitAmount;
	public Account(int debitAmount) {
		super();
		this.debitAmount = debitAmount;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(int debitAmount) {
		this.debitAmount = debitAmount;
	}
	public int getAmount() {
		return amount;
	}
	public void Debit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Withdrawl Amount");
		debitAmount = sc.nextInt();
		if (amount > debitAmount) {
			amount = amount - debitAmount;
			System.out.println("Money has Withdrawn , Remaining Money : Rs."+amount);
			System.out.println(" ");
			
		}
		else if(amount == debitAmount) {
			amount = 0;
			System.out.println("No Money Left !!! "+ amount);
		}
		else {
			amount = getAmount();
			System.out.println("Debit Amount Exceeded the Account Balance !!!");
			System.out.println("=============================================");
		}
	}
}
