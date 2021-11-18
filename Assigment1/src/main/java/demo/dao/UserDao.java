package demo.dao;

import demo.entity.AttributeEntity;
import demo.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertUser(UserEntity user){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public UserEntity getEditUser(int id) {
        UserEntity editUser = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            editUser = em.find(UserEntity.class, id);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return editUser;
    }

    public void deleteUser(int id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        UserEntity p = em.find(UserEntity.class, id);
        if (p != null) {
            em.remove(p);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void updateUser(UserEntity user){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        UserEntity pUpdate = em.find(UserEntity.class, user.getId());
        pUpdate.setName(user.getName());
        pUpdate.setAddress(user.getAddress());
        pUpdate.setAge(user.getAge());
        pUpdate.setCompanyid(user.getCompanyid());
        em.getTransaction().commit();
        em.close();
    }

    public List<UserEntity> getAllUser(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<UserEntity> listUser = em.createQuery("select p from UserEntity p").getResultList();
        em.getTransaction().commit();
        em.close();
        return listUser;
    }

    public UserEntity findUserDao(int id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        UserEntity user = em.find(UserEntity.class, id);
        Query query = em.createQuery("select p.attributes from UserEntity p where p.id = (:id)");
        query.setParameter("id", id);
        List<AttributeEntity> atts = query.getResultList();
        user.setAttributes(atts);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    public  UserEntity getUser(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        UserEntity pUpdate = em.find(UserEntity.class, id);
        em.getTransaction().commit();

        return pUpdate;
    }

}
