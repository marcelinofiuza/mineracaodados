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
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @see http://stackoverflow.com/questions/15279184/why-different-persistence-units-with-separated-data-sources-query-the-same-data
 * @author Jedi
 */
public class ConectarDB {

//    @PersistenceContext(unitName="ormMineracao", type=PersistenceContextType.TRANSACTION)
//    private EntityManagerFactory factory;    
    private EntityManagerFactory factory;
    private EntityManager manager;
    private EntityTransaction transaction;
    
    
    public ConectarDB(String nomeBanco) throws Exception{
        try {
            factory = Persistence.createEntityManagerFactory(nomeBanco);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao selecionar banco de dados! " + nomeBanco);
        }

    }

    public void beginTransaction() {
        manager = factory.createEntityManager();
        transaction = manager.getTransaction();
        transaction.begin();
        
    }

    public EntityManagerFactory getFactory() {
        return factory;
    }

    public EntityManager getManager() {
        return manager;
    }

    public EntityTransaction getTransaction() {
        return transaction;
    }

    public void rollBackTransaction() {
        transaction.rollback();
        manager.clear();
        manager.flush();        
        manager.close();
//        factory.close();
    }

    public void endTransaction() {
        transaction.commit();
        manager.clear();     
        manager.close();
//        factory.close();
    }

}
