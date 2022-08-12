package commercialDataProcessing;

public interface StockManage {
	double valueOf();
	void buy(int amount, String symbol);
	void sell(int amount, String symbol);
	void save(String fileName);
	void printReport();
}
