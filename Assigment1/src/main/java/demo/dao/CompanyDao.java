package demo.dao;

import demo.entity.CompanyEntity;
import demo.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class CompanyDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<CompanyEntity> getAllCompany(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<CompanyEntity> listCompany = em.createQuery("select p from CompanyEntity p").getResultList();
        em.getTransaction().commit();
        em.close();
        return listCompany;
    }

    public int countTotalRecords() {
        int totalRecords = 0;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Query query = em.createQuery("select count(p.id) as total from CompanyEntity p");
            Long total = (Long) query.getSingleResult();
            em.getTransaction().commit();

            if (total != null) {
                totalRecords = total.intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return totalRecords;
    }

    public CompanyEntity getCom(int id) {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            CompanyEntity companyEntity = em.find(CompanyEntity.class, id);
            em.getTransaction().commit();
            return companyEntity;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }

    public CompanyEntity getCompany(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        CompanyEntity cUpdate = em.find(CompanyEntity.class, id);
        em.getTransaction().commit();

        return cUpdate;
    }

    public void insertCompany(CompanyEntity companyEntity){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(companyEntity);
        em.getTransaction().commit();
        em.close();
    }

    public  void deleteCompany(int id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        CompanyEntity p = em.find(CompanyEntity.class, id);
        if (p != null) {
            em.remove(p);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void updateCompany(CompanyEntity companyEntity){
        em = emf.createEntityManager();
        em.getTransaction().begin();
      /*  CategoryEntity cUpdate = em.find(CategoryEntity.class, categoryEntity.getId());
        cUpdate.setName(categoryEntity.getName());*/
        em.merge(companyEntity);
        em.getTransaction().commit();
        em.close();
    }
}
