package controller;

import java.util.ArrayList;

import model.Stock;

public class DataAccess {

	public static ArrayList<Stock> getStocks() //TODO - ArrayList<Stock>
	{
		//TODO
		//return model.getStocks();
		
		ArrayList<Stock> stocks = new ArrayList<Stock>();
		stocks.add(new Stock());
		return stocks;
	}
	
	public static int getBalance()
	{
		return 100;
	}
}
