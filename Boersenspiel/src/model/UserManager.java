package model;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class UserManager 
{
	
	private static UserManager instance = null;
	
	public static UserManager getInstance(){
		if(null == instance)
		{
			instance = new UserManager();
		}
		return instance;
	}
	
	private EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("h2");
	
	public UserManager() {}
	
	public void save(User usr)
	{
		EntityManager em = emf.createEntityManager();
		usr.setCreated(new Date());
		em.getTransaction().begin();
		em.persist(usr);
		em.getTransaction().commit();
	}
	
	public List<User> getAll()
	{
		String queryString = "SELECT * FROM User";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(queryString);
		return query.getResultList();		
	}
	
	public User getUserByID(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
		EntityManager em = emf.createEntityManager();
		Query query  = em.createQuery("SELECT usr FROM User usr WHERE usr.id = :id");
		query.setParameter("id", id);
		List<User> list = query.getResultList();
		return list.isEmpty() ? null : list.get(0);
	}
}
