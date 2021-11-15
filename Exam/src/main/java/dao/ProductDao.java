package dao;

import model.tbProducts;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	EntityManager em = emf.createEntityManager();

	public List<tbProducts> getAllProduct(){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		List<tbProducts> listCategory = em.createQuery("select p from tbProducts p").getResultList();
		em.getTransaction().commit();
		em.close();
		return listCategory;
	}
}
