package be.jpaSchoolOut.Proj.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Success");

    public static EntityManagerFactory getConnection() {
        return factory;
    }
}