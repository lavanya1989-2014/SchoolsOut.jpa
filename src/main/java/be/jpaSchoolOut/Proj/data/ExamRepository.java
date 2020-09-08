package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Exam;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ExamRepository {

    public void createExam(Exam exam)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(exam);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updateExam(Exam exam)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(exam);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    /*public Exam getExambyId(long id)
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Exam exam = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            exam = entityManager.find(Exam.class,id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return exam;
    }*/

    public void delExam(long id)
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Exam exam = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            exam = entityManager.find(exam.getClass(),id);
            entityManager.remove(exam);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    /*public List<Exam> getAllExams()
    {
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Exam> exams = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            exams = (List<Exam>) entityManager.createQuery("SELECT * FROM EXAM");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return exams;
    }*/

    public List<Exam> getSubExams (long id) {
        EntityManagerFactory entityManagerFactory =EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Exam> exams = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            exams = (List<Exam>) entityManager.createQuery("Select e from e WHERE id =" + id,Exam.class).getResultList();
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return exams;

        }

}
