package accountWithdrawl;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Account Withdrawl");
		chooseOption();
		
	}
	public static void chooseOption() {
		Account acc = new Account();

		Scanner sc = new Scanner(System.in);
		System.out.println("PRESS 1. ACCOUNT BALANCE 2.DEBIT AMOUNT");
		int option = sc.nextInt();
		switch(option) {
		
			case 1 :
				System.out.println("Account Balance : Rs."+acc.getAmount());
				chooseOption();
				break;
				
			case 2:
				for (int i=0;i<10;i++) {
					if(acc.getAmount() == 0) {
						
					}
					else
					acc.Debit();
				}
				if(acc.getAmount() != 0) {
					chooseOption();
				}
		}
	}

}
