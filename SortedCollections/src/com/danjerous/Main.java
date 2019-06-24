package com.danjerous;

import java.util.Map;

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

	    temp = new StockItem("Cup", 50.10, 30);
	    stockList.addStock(temp);


	    temp = new StockItem("Door", 19.10, 10);
	    stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
			System.out.println(s);
		}

        Basket dansBasket = new Basket("Dan");
        sellItem(dansBasket, "Bread", 2);

		System.out.println(dansBasket);

		sellItem(dansBasket, "Door", 10);
		System.out.println(dansBasket);

		System.out.println(stockList);

		temp = new StockItem("Pen", 1.12);
		//stockList.Items().put(temp.getName(), temp);
		stockList.Items().get("Car").adjustStock(2000);
		stockList.get("Car").adjustStock(-1000);
		System.out.println(stockList);

		for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
			System.out.println(price.getKey() + " costs " + price.getValue());
		}



    }

    public static int sellItem (Basket basket, String item, int quantity) {
    	// retrieve the item from stock list
		StockItem stockItem = stockList.get(item);
		if (stockItem == null) {
			System.out.println("We don't sell " + item);
			return 0;
		}

		if (stockList.sellStock(item, quantity) != 0) {
			basket.addToBasket(stockItem, quantity);
		}
		return 0;
	}
}
