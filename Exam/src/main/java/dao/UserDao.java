package dao;

import model.tbUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	EntityManager em = emf.createEntityManager();

	public String checkAuth (String username, String pass) {
		tbUser userCheck = new tbUser(username, pass);
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createQuery("select u from tbUser u where u.username = (:username) and u.password = (:pass)", tbUser.class);
			query.setParameter("username", username);
			query.setParameter("pass", pass);
			tbUser user = (tbUser) query.getSingleResult();
			em.getTransaction().commit();
			if(user != null){
				return user.getUsername();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return "";
	}
}
