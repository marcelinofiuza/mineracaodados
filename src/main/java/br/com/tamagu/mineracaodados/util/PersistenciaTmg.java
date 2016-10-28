/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.util;

import java.io.Serializable;
import java.util.Collection;


/**
 *
 * @author Jedi
 */
public class PersistenciaTmg implements Serializable {

    public static final long serialVersionUID = 1L;

    private ConectarDB conexao;

    public PersistenciaTmg(String orm) {
        if (orm == null || orm.isEmpty()) {
            conexao = new ConectarDB();
        } else {
            conexao = new ConectarDB(orm);
        }
    }

    public void criar(Object entidade) throws Exception {
        try {
            conexao.beginTransaction();
            conexao.getManager().merge(entidade);

        } catch (Exception e) {
            conexao.rollBackTransaction();
            throw new Exception(e.getMessage());

        } finally {
            conexao.endTransaction();
            
        }
    }

    public void criar(Collection<Object> entidade) throws Exception {
        try {
            conexao.beginTransaction();

            for (Object registro : entidade) {
                conexao.getManager().merge(registro);
            }

        } catch (Exception e) {

            conexao.rollBackTransaction();
            throw new Exception(e.getMessage());

        } finally {
            conexao.endTransaction();
            
        }
    }    

}
