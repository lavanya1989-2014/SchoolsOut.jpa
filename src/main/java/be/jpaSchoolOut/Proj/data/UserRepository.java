package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class UserRepository {

    public void createUser(User user)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updateUser(User user)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    public User getUserbyId(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        User user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            user = entityManager.find(user.getClass(),id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
         return user;
    }

    public void delUser(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        User user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            user = entityManager.find(user.getClass(),id);
            entityManager.remove(user);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public List<User> getAllUsers()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<User> user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            user = (List<User>) entityManager.createQuery("SELECT * FROM USER");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return user;
    }


}

