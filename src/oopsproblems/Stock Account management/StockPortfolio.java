package oopsproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	ArrayList<Stock> list = new ArrayList<>();
	static int numOfStocks = 0;
	static Scanner sc = new Scanner(System.in);
	
	static int totalValue = 0;
	static int StockValue = 0;
	public void addStock() {

		System.out.println("Please Enter How Many Stocks You Want to Buy");
		numOfStocks = sc.nextInt();
		
		for(int i = 1;i <= numOfStocks;i++) {
			Stock st = new Stock();
			System.out.println("Stock Details - "+i);
			System.out.println("*************");
			System.out.println("Plase Enter Stock Name");
			st.setStockName(sc.next());
			System.out.println("Plase Enter Number of Shares ");
			st.setNumOfShares(sc.nextInt());
			System.out.println("Plase Enter Share Price");
			st.setSharePrice(sc.nextInt());
			System.out.println(" ");
			
			totalValue = st.getNumOfShares()*st.getSharePrice();
			st.setTotalValue(totalValue);	
			list.add(st);
			StockValue = StockValue + totalValue;
		}
		System.out.println(list);
		System.out.println("The value of Whole Stocks : Rs. "+StockValue);
	}
}
