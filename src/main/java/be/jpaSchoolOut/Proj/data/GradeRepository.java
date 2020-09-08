package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Grade;
import be.jpaSchoolOut.Proj.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class GradeRepository {

    public void createGrade(Grade grade)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(grade);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updateGrade(Grade grade)
    {

        EntityManagerFactory entityManagerFactory =EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(grade);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    /*public Grade getGradebyId(long id)
    {
        EntityManagerFactory entityManagerFactory =EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Grade grade = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            grade = entityManager.find(Grade.class,id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return grade;
    }*/

    public void delGrade(long id)
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Grade grade = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            grade = entityManager.find(grade.getClass(),id);
            entityManager.remove(grade);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    /*public List<Grade> getAllGrades()
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Grade> grades= null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            grades = (List<Grade>) entityManager.createQuery("SELECT * FROM GRADE");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return grades;
    }*/

}
