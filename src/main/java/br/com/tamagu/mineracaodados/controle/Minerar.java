/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.controle;

import br.com.tamagu.mineracaodados.entidades.Tabelao;
import br.com.tamagu.mineracaodados.util.ConectarAccess;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jedi
 */
public class Minerar {

    public static void main(String[] args) {

        try {
            
            Tabelao tabelao = (Tabelao) ConectarAccess.getDadosTabelao();


        } catch (IOException ex) {
            Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
