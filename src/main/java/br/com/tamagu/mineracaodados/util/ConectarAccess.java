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

/**
 *
 * @author Jedi
 */
public class ConectarAccess {

    public static Tabelao getDadosTabelao() throws IOException {

        Table tb = DatabaseBuilder.open(new File("/TABELAO.mdb")).getTable("tabelao");

        for (Row row : tb) {
            System.out.println("Column 'a' has value: " + row.get("a"));
        }
                
        Tabelao tabelao = new Tabelao();
        return tabelao;

    }
}
