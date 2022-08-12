package stockAccountManagemnt;

public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		StockPortfolio sp = new StockPortfolio();
		sp.addStock();
		
	}
	static void welcome() {
		System.out.println("Welcome to Stock Account Management Program");
		System.out.println("===========================================");

	}

}
