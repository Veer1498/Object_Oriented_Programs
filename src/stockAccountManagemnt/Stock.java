package stockAccountManagemnt;

public class Stock {
	private String stockName;
	private int numOfShares;
	private int sharePrice;
	private  int TotalValue;
	public Stock(String stockName, int numOfShares, int sharePrice) {
		super();
		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.sharePrice = sharePrice;
	}
	
	public Stock() {
		
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getTotalValue() {
		return TotalValue;
	}
	
	public void setTotalValue(int totalValue) {
		TotalValue = totalValue;
	}

	@Override
	public String toString() {
		return   "\nStock Name    = " + stockName 
				+"\nNum Of Shares = " + numOfShares 
				+"\nSharePrice    = " + sharePrice
				+"\nTotalValue    = " + TotalValue+"\n";
	}

}
