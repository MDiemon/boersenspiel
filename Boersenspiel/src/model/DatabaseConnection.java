package model;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConnection {
	
	private EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("h2");

	private static DatabaseConnection instance = null;
	
	public static DatabaseConnection getInstance(){
		if(null == instance){
			instance = new DatabaseConnection();
		}
		return instance;
	}
		
	public List<User> getAllUser()
	{
		String queryString = "SELECT * FROM User";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();
	}
	
	public List<Stock> getAllStocks() {
		String queryString = "SELECT * FROM Stock";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();		
	}
	
	public void	buyStock(int userID, int stockID) {
		String queryString = "INSERT INTO BoughtStocks VALUES ('" + userID + "','" + stockID + "')";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
	}
	
	public void	sellStock(int userID, int stockID) {
		String queryString = "DELETE FROM BoughtStocks WHERE UserID ='" + userID + "' AND StockID = '" + stockID + "')";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
	}
	
	// für neuen Aktientag
	public void updateStock(int price, int priceChange)
	{
		String queryString = "UPDATE Stock SET Price = " + price + ", PriceChange = "+ priceChange;
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
	}
}
