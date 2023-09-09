package com.uptc.fwr.parcial;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersisitenceUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;
    static {
        ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("feria");
    }

    public static EntityManager getEntityManager(){
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

}
