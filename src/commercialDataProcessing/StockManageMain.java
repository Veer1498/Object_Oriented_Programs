package commercialDataProcessing;

public class StockManageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Stock Account Management");
		System.out.println("===================================");
		System.out.println("");

		StockAccountManagement stockList = new StockAccountManagement();
		stockList.addStock();
		StockAccount sa = new StockAccount("Veer");
		sa.buy(20, "veer");
		

	}

}
