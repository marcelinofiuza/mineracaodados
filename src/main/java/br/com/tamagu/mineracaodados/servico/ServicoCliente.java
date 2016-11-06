/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.servico;

import br.com.tamagu.mineracaodados.util.PersistenciaTmg;

/**
 *
 * @author jedi
 */
public class ServicoCliente extends PersistenciaTmg{

    public ServicoCliente(String orm) throws Exception {
        super(orm);
    }
    
}
