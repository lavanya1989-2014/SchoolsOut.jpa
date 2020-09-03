package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Couse;
import be.jpaSchoolOut.Proj.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class CouseRepository {

    public void createCouse(Couse couse)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(couse);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updateCouse(Couse couse)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(couse);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    public Couse getCousebyId(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Couse couse = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            couse = entityManager.find(Couse.class,id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return couse;
    }

    public void delCouse(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Couse couse = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            couse = entityManager.find(couse.getClass(),id);
            entityManager.remove(couse);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public List<Couse> getAllCouses()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Couse> couses = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            couses = (List<Couse>) entityManager.createQuery("SELECT * FROM USER");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return couses;
    }




}
