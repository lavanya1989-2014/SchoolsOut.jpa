package be.jpaSchoolOut.Proj.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {

    public static EntityManagerFactory getConnection() {
        return Persistence.createEntityManagerFactory("Success");
    }
}
