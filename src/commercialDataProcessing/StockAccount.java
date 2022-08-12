package commercialDataProcessing;

import java.util.Scanner;

public class StockAccount implements StockManage {
	StockAccount(String fileName){
		System.out.println("Please Enter the Person Name");
		Scanner sc = new Scanner(System.in);

		fileName = sc.next();
	}
	
	public double valueOf() {
		return 0;
		
	}
	public void buy(int amount, String symbol) {
		
	}
	public void sell(int amount, String symbol) {
		
	}
	public void save(String fileName) {
		
	}
	public void printReport() {
		
	}



}
