package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class CourseRepository {

    public void createCouse(Course couse)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
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

    public void updateCouse(Course couse)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
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

   /* public Course getCousebyId(long id)
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Course couse = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            couse = entityManager.find(Course.class,id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return couse;
    }*/

    public void delCouse(long id)
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Course couse = null;
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

    /*public List<Course> getAllCouses()
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Course> couses = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            couses = (List<Course>) entityManager.createQuery("SELECT * FROM COURSE");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return couses;
    }*/




}
