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

    protected ConectarDB conexao;

    public PersistenciaTmg(String orm) throws Exception {
        if (orm == null || orm.isEmpty()) {
            throw new Exception("Banco de dados não informado");
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

    public void criarLista(Collection entidade) throws Exception {
        try {
            conexao.beginTransaction();

            for (Object registro : entidade) {
                conexao.getManager().merge(registro);
            }

        } catch (Exception e) {
            
            e.printStackTrace();
            conexao.rollBackTransaction();
            throw new Exception(e.getMessage());

        } finally {
            conexao.endTransaction();            
        }
    }    

}
