/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Jedi
 */
public class ConectarDB {

    private EntityManagerFactory factory;
    private EntityManager manager;
    private EntityTransaction transaction;

    public ConectarDB() {
        factory = Persistence.createEntityManagerFactory("ormMineracao");
    }

    public ConectarDB(String nomeBanco) {
        factory = Persistence.createEntityManagerFactory(nomeBanco);
    }

    public void beginTransaction() {
        manager = factory.createEntityManager();
        transaction = manager.getTransaction();
        transaction.begin();
    }
        
    public EntityManagerFactory getFactory(){
        return factory;
    }
    
    public EntityManager getManager() {
        return manager;
    }

    public EntityTransaction getTransaction() {
        return transaction;
    }

    public void rollBackTransaction(){
        transaction.rollback();
        manager.close();
//        factory.close();
    }
    
    public void endTransaction() {
        transaction.commit();
        manager.close();
//        factory.close();
    }

}
