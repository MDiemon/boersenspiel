package model;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class StockManager 
{
	
	private static StockManager instance = null;
	
	public static StockManager getInstance(){
		if(null == instance)
		{
			instance = new StockManager();
		}
		return instance;
	}
	
	private EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("h2");
	
	public StockManager() {}
	
	public void save(Stock stc)
	{
		EntityManager em = emf.createEntityManager();
		stc.setCreated(new Date());
		em.getTransaction().begin();
		em.persist(stc);
		em.getTransaction().commit();
	}
	
	public List<Stock> getAll()
	{
		String queryString = "SELECT * FROM Stock";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();		
	}
	
	public Stock getStockByID(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
		EntityManager em = emf.createEntityManager();
		Query query  = em.createQuery("SELECT stk FROM Stock stk WHERE stk.id = :id");
		query.setParameter("id", id);
		List<Stock> list = query.getResultList();
		return list.isEmpty() ? null : list.get(0);
	}
}
