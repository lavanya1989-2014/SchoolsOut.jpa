package be.jpaSchoolOut.Proj.data;

import be.jpaSchoolOut.Proj.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class PersonRepository {
    public void createPerson(Person person)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updatePerson(Person person)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(person);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    public Person getPersonbyId(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Person person = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            person = entityManager.find(Person.class,id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return person;
    }

    public void delPerson(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
       Person person = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            person = entityManager.find(person.getClass(),id);
            entityManager.remove(person);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public List<Person> getAllPersons()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Person> person = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            person = (List<Person>) entityManager.createQuery("SELECT * FROM USER");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return person;
    }


}
