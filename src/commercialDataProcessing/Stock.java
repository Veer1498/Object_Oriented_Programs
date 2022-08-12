package commercialDataProcessing;


	//Stock Details
	public class Stock {
			
		private String stockName;
		private int numOfShare;
		private int sharePrice;
		private int totalValue;
		
		public Stock(String stockName, int numOfShare, int sharePrice) {
			super();
			this.stockName = stockName;
			this.numOfShare = numOfShare;
			this.sharePrice = sharePrice;
			this.totalValue = totalValue;
		}


		public Stock() {
			// TODO Auto-generated constructor stub
		}


		public String getStockName() {
			return stockName;
		}


		public void setStockName(String stockName) {
			this.stockName = stockName;
		}


		public int getNumOfShare() {
			return numOfShare;
		}


		public void setNumOfShare(int numOfShare) {
			this.numOfShare = numOfShare;
		}


		public int getSharePrice() {
			return sharePrice;
		}


		public void setSharePrice(int sharePrice) {
			this.sharePrice = sharePrice;
		}
		


		public int getTotalValue() {
			return totalValue;
		}


		public void setTotalValue(int totalValue) {
			this.totalValue = totalValue;
		}


		@Override
		public String toString() {
			return "\n STOCK DETAILS \n 1.StockName  = " + stockName + "\n 2.NumOfShare = " + numOfShare + "\n 3.SharePrice = " + sharePrice +
					"\n 4.Each Stock Value = "+totalValue;
		}
}
