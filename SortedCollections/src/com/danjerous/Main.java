package com.danjerous;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("Bread", 0.85, 100);

	    stockList.addStock(temp);

	    temp = new StockItem("Cake", 1.10, 7);
	    stockList.addStock(temp);

	    temp = new StockItem("Car", 189.10, 65);
	    stockList.addStock(temp);

	    temp = new StockItem("Cheese", 10.10, 71);
	    stockList.addStock(temp);

	    temp = new StockItem("Beer", 65.10, 17);
	    stockList.addStock(temp);

	    temp = new StockItem("Cup", 19.10, 25);
	    stockList.addStock(temp);


	    temp = new StockItem("Door", 19.10, 10);
	    stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
			System.out.println(s);
		}

    }
}
