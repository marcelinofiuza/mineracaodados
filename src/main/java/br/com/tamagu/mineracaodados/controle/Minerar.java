/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.controle;

import br.com.tamagu.mineracaodados.entidades.Categoria;
import br.com.tamagu.mineracaodados.entidades.Cliente;
import br.com.tamagu.mineracaodados.entidades.Empregado;
import br.com.tamagu.mineracaodados.entidades.Fornecedor;
import br.com.tamagu.mineracaodados.entidades.Transportadora;
import br.com.tamagu.mineracaodados.servico.ServicoCategoria;
import br.com.tamagu.mineracaodados.servico.ServicoCliente;
import br.com.tamagu.mineracaodados.servico.ServicoEmpregado;
import br.com.tamagu.mineracaodados.servico.ServicoFornecedor;
import br.com.tamagu.mineracaodados.servico.ServicoTransportadora;
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
        Map<String, Cliente> listaCliente = new HashMap<>();
        Map<Integer, Transportadora> listaTransportadora = new HashMap<>();
        Map<Integer, Empregado> listaEmpregado = new HashMap<>();

        //Entidades
        Categoria categoria;
        Fornecedor fornecedor;
        Cliente cliente;
        Transportadora transportadora;
        Empregado empregado;
        Empregado supervisor;

        //Servicos
        ServicoCategoria servicoCategoria;
        ServicoFornecedor servicoFornecedor;
        ServicoCliente servicoCliente;
        ServicoTransportadora servicoTransportadora;
        ServicoEmpregado servicoEmpregado;

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

                //Dados do Cliente
                cliente = new Cliente();
                cliente.setIdCliente(row.getString("Clientes_CodigoDoCliente"));
                cliente.setNomeDaEmpresa(row.getString("Clientes_NomeDaEmpresa"));
                cliente.setNomeDoContato(row.getString("Clientes_NomeDoContato"));
                cliente.setCargoDoContato(row.getString("Clientes_CargoDoContato"));
                cliente.setEndereco(row.getString("Clientes_Endereco"));
                cliente.setCidade(row.getString("Clientes_Cidade"));
                cliente.setRegiao(row.getString("Clientes_Regiao"));
                cliente.setCep(row.getString("Clientes_CEP"));
                cliente.setPais(row.getString("Clientes_Pais"));
                cliente.setTelefone(row.getString("Clientes_Telefone"));
                cliente.setFax(row.getString("Clientes_Fax"));
                listaCliente.put(cliente.getIdCliente(), cliente);

                //Dados da Transportadora
                transportadora = new Transportadora();
                transportadora.setIdTransportadora(row.getInt("CodigoDaTransportadora"));
                transportadora.setNomeDaEmpresa(row.getString("Transportadoras_NomeDaEmpresa"));
                transportadora.setTelefone(row.getString("Transportadoras_Telefone"));
                listaTransportadora.put(transportadora.getIdTransportadora(), transportadora);

                //Dados do Empregado
                empregado = new Empregado();
                empregado.setIdFuncionario(row.getInt("CodigoDoFuncionario"));
                empregado.setSobrenome(row.getString("Sobrenome"));
                empregado.setNome(row.getString("Nome"));
                empregado.setCargo(row.getString("Cargo"));
                empregado.setTratamento(row.getString("Tratamento"));
                empregado.setDataDeNascimento(row.getDate("DataDeNascimento"));
                empregado.setDataDeContratacao(row.getDate("DataDeContratacao"));
                empregado.setEndereco(row.getString("Empregados_Endereco"));
                empregado.setCidade(row.getString("Empregados_Cidade"));
                empregado.setRegiao(row.getString("Empregados_Regiao"));
                empregado.setCep(row.getString("Empregados_CEP"));
                empregado.setPais(row.getString("Empregados_Pais"));
                empregado.setTelefoneResidencial(row.getString("TelefoneResidencial"));
                empregado.setRamal(row.getString("Ramal"));
                empregado.setObservacoes(row.getString("Observacoes"));
                if (row.getInt("Supervisor") != null) {
                    empregado.setIdSupervisor(row.getInt("Supervisor"));
                }
                listaEmpregado.put(empregado.getIdFuncionario(), empregado);

            }

            try {

                //Grava dos dados no banco
                servicoCategoria = new ServicoCategoria(bancoDados);
                servicoCategoria.criarLista(listaCategoria.values());

                servicoFornecedor = new ServicoFornecedor(bancoDados);
                servicoFornecedor.criarLista(listaFornecedor.values());

                servicoCliente = new ServicoCliente(bancoDados);
                servicoCliente.criarLista(listaCliente.values());

                servicoTransportadora = new ServicoTransportadora(bancoDados);
                servicoTransportadora.criarLista(listaTransportadora.values());

                servicoEmpregado = new ServicoEmpregado(bancoDados);
                servicoEmpregado.criarLista(listaEmpregado.values());

                
                //Atribuir os supervisores aos empregados
                for (Map.Entry<Integer, Empregado> entrySet : listaEmpregado.entrySet()) {

                    //Registro de Empregado corrente
                    Empregado value = entrySet.getValue();
                    //Busca o supervisor do registro corrente na lista de empregados
                    supervisor = listaEmpregado.get(value.getIdSupervisor());
                    if (supervisor != null) {
                        value.setSupervisor(supervisor);
                        listaEmpregado.put(value.getIdFuncionario(), value);
                    }
                }
                //Grava os empregados com os supervisores
                servicoEmpregado = new ServicoEmpregado(bancoDados);
                servicoEmpregado.criarLista(listaEmpregado.values());                

                
                
            } catch (Exception ex) {
                Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Processo finalizado!");

    }
}
