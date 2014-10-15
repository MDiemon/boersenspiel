package controller;

import java.util.ArrayList;

public class DataAccess {

	public static ArrayList<String> getStocks() //TODO - ArrayList<Stock>
	{
		//TODO
		//return model.getStocks();
		
		ArrayList<String> ret = new ArrayList<String>();
		ret.add("Test");
		return ret;
	}
	
	public static int getKontostand()
	{
		return 100;
	}
}
