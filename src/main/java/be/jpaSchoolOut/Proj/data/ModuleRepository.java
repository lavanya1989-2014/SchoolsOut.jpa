package be.jpaSchoolOut.Proj.data;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ModuleRepository {

    public void createModule(Module module)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(module);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public void updateModule(Module module)
    {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(module);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }


    }

    public Module getModulebyId(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Module module = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            module = entityManager.find(module.getClass(),id);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return module;
    }

    public void delModule(long id)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        Module module = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            module= entityManager.find(module.getClass(),id);
            entityManager.remove(module);
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }

    public List<Module> getAllModules()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Success");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        List<Module> modules = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            modules = (List<Module>) entityManager.createQuery("SELECT * FROM USER");
            entityManager.getTransaction().commit();
        }
        catch (RuntimeException e) {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }
        return modules;
    }


}
