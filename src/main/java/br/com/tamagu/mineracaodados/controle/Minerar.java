/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.controle;

import br.com.tamagu.mineracaodados.entidades.Categoria;
import br.com.tamagu.mineracaodados.entidades.Cliente;
import br.com.tamagu.mineracaodados.entidades.DetalhesPedido;
import br.com.tamagu.mineracaodados.entidades.Empregado;
import br.com.tamagu.mineracaodados.entidades.Fornecedor;
import br.com.tamagu.mineracaodados.entidades.Pedido;
import br.com.tamagu.mineracaodados.entidades.Produto;
import br.com.tamagu.mineracaodados.entidades.Transportadora;
import br.com.tamagu.mineracaodados.servico.ServicoCategoria;
import br.com.tamagu.mineracaodados.servico.ServicoCliente;
import br.com.tamagu.mineracaodados.servico.ServicoDetalhesPedido;
import br.com.tamagu.mineracaodados.servico.ServicoEmpregado;
import br.com.tamagu.mineracaodados.servico.ServicoFornecedor;
import br.com.tamagu.mineracaodados.servico.ServicoPedido;
import br.com.tamagu.mineracaodados.servico.ServicoProduto;
import br.com.tamagu.mineracaodados.servico.ServicoTransportadora;
import br.com.tamagu.mineracaodados.util.ConectarAccess;
import br.com.tamagu.mineracaodados.util.PersistenciaTmg;
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
        Map<Integer, Produto> listaProduto = new HashMap<>();
        Map<Integer, Pedido> listaPedido = new HashMap<>();
        Map<Integer, DetalhesPedido> listaDetalhesPedido = new HashMap<>();

        //Entidades
        Categoria categoria;
        Fornecedor fornecedor;
        Cliente cliente;
        Transportadora transportadora;
        Empregado empregado;
        Empregado supervisor;
        Produto produto;
        Pedido pedido;
        DetalhesPedido detalhesPedido;

        //Servicos
        ServicoCategoria servicoCategoria;
        ServicoFornecedor servicoFornecedor;
        ServicoCliente servicoCliente;
        ServicoTransportadora servicoTransportadora;
        ServicoEmpregado servicoEmpregado;
        ServicoProduto servicoProduto;
        ServicoPedido servicoPedido;
        ServicoDetalhesPedido servicoDetalhesPedido;

        try {

//            Object[] opcoes = {"ormMineracao", "ormVendas"};
//            Object res = JOptionPane.showInputDialog(null, "Escolha um banco", "Selecao de itens",
//                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "");                                                   
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

                //Dados do Produto
                produto = new Produto();
                produto.setIdProduto(row.getInt("Produtos_CodigoDoProduto"));
                produto.setNomeDoProduto(row.getString("NomeDoProduto"));
                produto.setFornecedor(fornecedor); //Fornecedor já extraido a cima
                produto.setCategoria(categoria); //Categoria já extraido a cima
                produto.setQuantidadePorUnidade(row.getString("QuantidadePorUnidade"));
                produto.setPrecoUnitario(row.getBigDecimal("Produtos_PrecoUnitario"));
                produto.setUnidadesEmEstoque(row.getShort("UnidadesEmEstoque"));
                produto.setUnidadesPedidas(row.getShort("UnidadesPedidas"));
                produto.setNivelDeReposicao(row.getShort("NivelDeReposicao"));
                produto.setDescontinuado(row.getBoolean("Descontinuado"));
                listaProduto.put(produto.getIdProduto(), produto);

                //Dados do pedido
                pedido = new Pedido();
                pedido.setNumeroDoPedido(row.getInt("Pedidos_NumeroDoPedido"));
                pedido.setCliente(cliente);
                pedido.setEmpregado(empregado);
                pedido.setDataDoPedido(row.getDate("DataDoPedido"));
                pedido.setDataDeEntrega(row.getDate("DataDeEntrega"));
                pedido.setDataDeEnvio(row.getDate("DataDeEnvio"));
                pedido.setTransportadora(transportadora);
                pedido.setFrete(row.getBigDecimal("Frete"));
                pedido.setNomeDoDestinatario(row.getString("NomeDoDestinatario"));
                pedido.setEnderecoDoDestinatario(row.getString("EnderecoDoDestinatario"));
                pedido.setCidadeDeDestino(row.getString("CidadeDeDestino"));
                pedido.setRegiaoDeDestino(row.getString("RegiaoDeDestino"));
                pedido.setCepDeDestino(row.getString("CEPdeDestino"));
                pedido.setPaisDeDestino(row.getString("PaisDeDestino"));
                listaPedido.put(pedido.getNumeroDoPedido(), pedido);
                
                detalhesPedido = new DetalhesPedido();
                detalhesPedido.setPedido(pedido);
                detalhesPedido.setProduto(produto);
                detalhesPedido.setPrecoUnitario(row.getBigDecimal("Detalhes_Pedido_PrecoUnitario"));
                detalhesPedido.setQuantidade(row.getShort("Quantidade"));
                detalhesPedido.setDesconto(row.getFloat("Desconto"));
                int keyDetalhePedido = Integer.parseInt(
                        String.valueOf(pedido.getNumeroDoPedido())+
                        String.valueOf(produto.getIdProduto()));                
                listaDetalhesPedido.put(keyDetalhePedido, detalhesPedido);
                detalhesPedido.setIdDetalhe(keyDetalhePedido);
            }

            try {
                
                //Grava dos dados no banco
                //Categoria
                servicoCategoria = new ServicoCategoria(bancoDados);
                servicoCategoria.criarLista(listaCategoria.values());

                //Fornecedor
                servicoFornecedor = new ServicoFornecedor(bancoDados);
                servicoFornecedor.criarLista(listaFornecedor.values());

                //Cliente
                servicoCliente = new ServicoCliente(bancoDados);
                servicoCliente.criarLista(listaCliente.values());

                //Transportadora
                servicoTransportadora = new ServicoTransportadora(bancoDados);
                servicoTransportadora.criarLista(listaTransportadora.values());

                //Empregado
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
                                

//                //Atribui detalhes_do_pedido no pedido e no produto.                
//                for (Map.Entry<Integer, DetalhesPedido> entrySet : listaDetalhesPedido.entrySet()) {
//                    //Detralhes do pedido
//                    Integer key = entrySet.getKey();
//                    DetalhesPedido value = entrySet.getValue();
//
//                    //Adiciona lista de detalhes no produto
//                    produto = listaProduto.get(value.getProduto().getIdProduto());
//                    produto.addDetalhesPedido(value);
//                    listaProduto.put(produto.getIdProduto(), produto);
//                    
//                    //Adiciona lista de detralhes no pedido
//                    pedido = listaPedido.get(value.getPedido().getNumeroDoPedido());
//                    pedido.addDetalhesPedido(value);
//                    listaPedido.put(pedido.getNumeroDoPedido(), pedido);                    
//                }
                
                //Produto
                servicoProduto = new ServicoProduto(bancoDados);
                servicoProduto.criarLista(listaProduto.values());
                
                //Pedidos
                servicoPedido = new ServicoPedido(bancoDados);
                servicoPedido.criarLista(listaPedido.values());
                
                //Detalhes do Pedido
                servicoDetalhesPedido = new ServicoDetalhesPedido(bancoDados);
                servicoDetalhesPedido.criarLista(listaDetalhesPedido.values());
                
                
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Minerar.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Processo finalizado!");

    }
}
