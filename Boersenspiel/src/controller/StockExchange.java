package controller;

import model.*;

public class StockExchange {

	public static void sellStock(int id)//(Stock stock, Cost cst) oder ID
	{
		Stock stc = StockManager.getInstance().getStockByID(id);
		User usr = UserManager.getInstance().getUserByID(0);

		BoughtStocks bsm = new BoughtStocks();
		bsm.setStock(stc);
		bsm.setUser(usr);
		
		BoughtStocksManager.getInstance().remove(bsm);

		usr.setBalance(usr.getBalance() + stc.getPrice());
	}
	
	public static void buyStock(int id)//(Stock stock, Cost cst) oder ID
	{
		Stock stc = StockManager.getInstance().getStockByID(id);
		User usr = UserManager.getInstance().getUserByID(0);
		
		BoughtStocks bsm = new BoughtStocks();
		bsm.setStock(stc);
		bsm.setUser(usr);
		
		BoughtStocksManager.getInstance().save(bsm);

		usr.setBalance(usr.getBalance() - stc.getPrice());
	}
}