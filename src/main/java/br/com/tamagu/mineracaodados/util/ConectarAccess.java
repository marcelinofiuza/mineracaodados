/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.util;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jedi
 */
public class ConectarAccess {

    public static Table getDadosTabelao() throws IOException {
                
        Table tb = DatabaseBuilder.open(new File(System.getProperty("user.dir")+"/src/main/resources/TABELAO.MDB")).getTable("tabelao");
        return tb;
        
    }
}
