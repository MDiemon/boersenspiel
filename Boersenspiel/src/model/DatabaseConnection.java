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
	
	/*public void save(GuestbookEntry gbe){
		EntityManager em = emf.createEntityManager();
		gbe.setCreated(new Date());
		em.getTransaction().begin();
		em.persist(gbe);
		em.getTransaction().commit();
	}
	
		public List<GuestbookEntry> getAll(){
		String queryString = "SELECT gbe FROM GuestbookEntry gbe ORDER BY gbe.created DESC";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();
	}*/
	

	
	public List<User> getAllUser()
	{
		String queryString = "";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();
	}
}
