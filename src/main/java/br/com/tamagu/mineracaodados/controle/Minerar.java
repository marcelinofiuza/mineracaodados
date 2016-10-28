/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.controle;

import br.com.tamagu.mineracaodados.entidades.Categoria;
import br.com.tamagu.mineracaodados.entidades.Fornecedor;
import br.com.tamagu.mineracaodados.servico.ServicoCategoria;
import br.com.tamagu.mineracaodados.servico.ServicoFornecedor;
import br.com.tamagu.mineracaodados.util.ConectarAccess;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jedi
 */
public class Minerar {

    public static void main(String[] args) {

        //Variaveis
        String bancoDados = "ormMineracao";

        //Arraylist das Entidades
        Map<Integer, Categoria> listaCategoria = new HashMap<>();
        Map<Integer, Fornecedor> listaFornecedor = new HashMap<>();

        //Entidades
        Categoria categoria;
        Fornecedor fornecedor;

        //Servicos
        ServicoCategoria servicoCategoria;
        ServicoFornecedor servicoFornecedor;

        try {

//            Object[] opcoes = {"ormMineracao", "ormVendas"};
//            Object res = JOptionPane.showInputDialog(null, "Escolha um banco", "Selecao de itens",
//                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
//                                                   
//            bancoDados = res.toString();            
            //Carregar arquivo MDB
            Table tabelao = ConectarAccess.getDadosTabelao();

            //Varredura nos registros do tabelao
            for (Row row : tabelao) {

                //Dados da Categoria
                categoria = new Categoria();
                categoria.setIdCategoria(row.getInt("CATEGORIAS_CodigoDaCategoria"));
                categoria.setNome(row.getString("NomeDaCategoria"));
                categoria.setDescricao(row.getString("Descricao"));
                listaCategoria.put(categoria.getIdCategoria(), categoria);

                //Dados do Fornecedor
                fornecedor = new Fornecedor();
                fornecedor.setIdFornecedor(row.getInt("Fornecedores_CodigoDoFornecedor"));
                fornecedor.setNomeEmpresa(row.getString("Fornecedores_NomeDaEmpresa"));
                fornecedor.setNomeContato(row.getString("Fornecedores_NomeDoContato"));
                fornecedor.setCargoContato(row.getString("Fornecedores_CargoDoContato"));
                fornecedor.setEndereco(row.getString("Fornecedores_Endereco"));
                fornecedor.setCidade(row.getString("Fornecedores_Cidade"));
                fornecedor.setRegiao(row.getString("Fornecedores_Regiao"));
                fornecedor.setCep(row.getString("Fornecedores_CEP"));
                fornecedor.setPais(row.getString("Fornecedores_Pais"));
                fornecedor.setTelefone(row.getString("Fornecedores_Telefone"));
                fornecedor.setFax(row.getString("Fornecedores_Fax"));
                fornecedor.setHomepage(row.getString("HomePage"));
                listaFornecedor.put(fornecedor.getIdFornecedor(), fornecedor);
                
            }

            try {

                servicoCategoria = new ServicoCategoria(bancoDados);
                servicoCategoria.criarLista(listaCategoria.values());
                
                servicoFornecedor = new ServicoFornecedor(bancoDados);
                servicoFornecedor.criarLista(listaFornecedor.values());

            } catch (Exception ex) {
                Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setDadosCategoria() {

    }
}
