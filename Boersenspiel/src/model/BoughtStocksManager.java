package model;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class BoughtStocksManager 
{
	
	private static BoughtStocksManager instance = null;
	
	public static BoughtStocksManager getInstance(){
		if(null == instance)
		{
			instance = new BoughtStocksManager();
		}
		return instance;
	}
	
	private EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("h2");
	
	public BoughtStocksManager() {}
	
	public void save(BoughtStocks bsm)
	{
		EntityManager em = emf.createEntityManager();
		bsm.setCreated(new Date());
		em.getTransaction().begin();
		em.persist(bsm);
		em.getTransaction().commit();
	}
	
	public void remove(BoughtStocks bsm)
	{
		EntityManager em = emf.createEntityManager();
		bsm.setCreated(new Date());
		em.getTransaction().begin();
		em.remove(bsm);
		em.getTransaction().commit();
	}
	
	public List<BoughtStocks> getAll()
	{
		String queryString = "SELECT * FROM BoughtStocks";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();		
	}
}
