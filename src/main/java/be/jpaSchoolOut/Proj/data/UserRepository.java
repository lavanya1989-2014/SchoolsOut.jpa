package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Person;
import be.jpaSchoolOut.Proj.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class UserRepository {

    public void createUser(User user)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
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

    public void updateUser(User user)
    {

        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
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

   /* public User getUserbyloginname(String loginname)
    {
        EntityManagerFactory entityManagerFactory =EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        User user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            user = entityManager.find(User.class,loginname);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
         return user;
    }*/

    public void delUser(String loginname)
    {
        EntityManagerFactory entityManagerFactory =EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        User user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            user = entityManager.find(user.getClass(),loginname);
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
        EntityManagerFactory entityManagerFactory = EntityFactory.getConnection();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<User> user = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
           user = entityManager.createQuery("from User",User.class).getResultList();
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

