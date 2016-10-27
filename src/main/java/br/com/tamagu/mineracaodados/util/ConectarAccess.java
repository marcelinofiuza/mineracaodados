/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.util;

import br.com.tamagu.mineracaodados.entidades.Tabelao;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jedi
 */
public class ConectarAccess {

    public static Iterator<Tabelao> getDadosTabelao() throws IOException {
                
        Table tb = DatabaseBuilder.open(new File(System.getProperty("user.dir")+"/src/main/resources/TABELAO.MDB")).getTable("tabelao");

        
        List<Tabelao> listaTabelao = new ArrayList();
        
        for (Row row : tb) {
            Tabelao tabelao = new Tabelao();
            
            tabelao.setCategorias_codigodacategoria(row.getInt("CATEGORIAS_CodigoDaCategoria"));            
            tabelao.setNomedacategoria(row.getString("NomeDaCategoria"));
            tabelao.setDescricao(row.getString("Descricao"));
                                 
            listaTabelao.add(tabelao);            
        }
                
        return listaTabelao.iterator();

    }
}
