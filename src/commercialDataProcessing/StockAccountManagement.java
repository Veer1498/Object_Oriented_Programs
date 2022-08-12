package commercialDataProcessing;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class StockAccountManagement {
		static Scanner sc = new Scanner(System.in);
		static ArrayList<Stock> stockList = new ArrayList<Stock>();
		
		// ADD NEW STOCK DETAILS
		public void addStock() {
			System.out.println("Please Enter Number of Stocks want to Add");
			int N = sc.nextInt();
			int totalValue=0,stockValue=0;
			
			for (int i=0;i<N;i++) {
				Stock stock1 = new Stock();
				
				System.out.println("Plase Enter Stock Details");
				System.out.println("=========================");
				
				System.out.println("Plase Enter Stock Name");
				stock1.setStockName(sc.next());
				System.out.println("Plase Enter Number of Shares ");
				stock1.setNumOfShare(sc.nextInt());
				System.out.println("Plase Enter Share Price");
				stock1.setSharePrice(sc.nextInt());
				
				totalValue= stock1.getNumOfShare()*stock1.getSharePrice();
				stock1.setTotalValue(totalValue);
				stockList.add(stock1);
				stockValue = stockValue+totalValue;
			}
			System.out.println(stockList);
			System.out.println(" The value of Whole Stock : "+stockValue);
		}
}
