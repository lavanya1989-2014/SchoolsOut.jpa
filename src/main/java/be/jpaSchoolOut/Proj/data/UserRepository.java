package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRepository {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");

    public class createUser(User user)
    {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction  = entityManager.getTransaction();
        User user = new User();
        u
         entityTransaction.begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

    }
}

