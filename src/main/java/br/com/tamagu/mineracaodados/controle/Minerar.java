/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.controle;

import br.com.tamagu.mineracaodados.entidades.Categoria;
import br.com.tamagu.mineracaodados.entidades.Tabelao;
import br.com.tamagu.mineracaodados.util.ConectarAccess;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jedi
 */
public class Minerar {

    public static void main(String[] args) {

        //Arraylist das Entidades
        Map<Integer,Categoria> listaCategoria = new HashMap<>();

        //Entidades
        Categoria categoria;

        
        try {

            //Carregar arquivo MDB
            Table tabelao = ConectarAccess.getDadosTabelao();

            //Varredura nos registros do tabelao
            for (Row row : tabelao) {
                
                //Dados da Categoria
                categoria = new Categoria();
                categoria.setCodigo(row.getInt("CATEGORIAS_CodigoDaCategoria"));
                categoria.setNome(row.getString("NomeDaCategoria"));
                categoria.setDescricao(row.getString("Descricao"));                                
                listaCategoria.put(categoria.getCodigo(), categoria);
                                
            }
            
            

            System.out.println("teste");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
