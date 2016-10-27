/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jedi
 */
public class Tabelao implements Serializable {
    
    private int categorias_codigodacategoria;
    private String nomedacategoria;
    private String descricao;

    private String clientes_codigodocliente;
    private String clientes_nomedaempresa;
    private String clientes_nomedocontato;
    private String clientes_cargodocontato;
    private String clientes_endereco;
    private String clientes_cidade;
    private String clientes_regiao;
    private String clientes_cep;
    private String clientes_pais;
    private String clientes_telefone;
    private String clientes_fax;

    private int detalhes_pedido_numerodopedido;
    private int detalhes_pedido_codigodoproduto;
    private int detalhes_pedido_precounitario;
    private Double quantidade;
    private Double desconto;

    private int codigodofuncionario;
    private String sobrenome;
    private String nome;
    private String cargo;
    private String tratamento;
    private Date datadenascimento;
    private Date datadecontratacao;
    private String empregados_endereco;
    private String empregados_cidade;
    private String empregados_regiao;
    private String empregados_cep;
    private String empregados_pais;
    private String telefoneresidencial;
    private String ramal;
    private String observacoes;
    private int supervisor;

    private String fornecedores_codigodoforneced;
    private String fornecedores_nomedaempresa;
    private String fornecedores_nomedocontato;
    private String fornecedores_cargodocontato;
    private String fornecedores_endereco;
    private String fornecedores_cidade;
    private String fornecedores_regiao;
    private String fornecedores_cep;
    private String fornecedores_pais;
    private String fornecedores_telefone;
    private String fornecedores_fax;
    private String homepage;

    private int pedidos_numerodopedido;
    private String pedidos_codigodocliente;
    private int codigodofuncionário;
    private Date datadopedido;
    private Date datadeentrega;
    private Date datadeenvio;
    private int via;
    private Double frete;
    private String nomedodestinatario;
    private String enderecododestinatario;
    private String cidadededestino;
    private String regiaodedestino;
    private String cepdedestino;
    private String paisdedestino;

    private int produtos_codigodoproduto;
    private String nomedoproduto;
    private int produtos_codigodofornecedor;
    private int produtos_codigodacategoria;
    private String quantidadeporunidade;
    private Double produtos_precounitario;
    private Double unidadesemestoque;
    private Double unidadespedidas;
    private Double niveldereposicao;
    private String descontinuado;

    private int codigodatransportadora;
    private String transportadoras_nomedaempresa;
    private String transportadoras_telefone;

    
    public Tabelao() {
    }
    
    public int getCategorias_codigodacategoria() {
        return categorias_codigodacategoria;
    }

    public void setCategorias_codigodacategoria(int categorias_codigodacategoria) {
        this.categorias_codigodacategoria = categorias_codigodacategoria;
    }

    public String getNomedacategoria() {
        return nomedacategoria;
    }

    public void setNomedacategoria(String nomedacategoria) {
        this.nomedacategoria = nomedacategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClientes_codigodocliente() {
        return clientes_codigodocliente;
    }

    public void setClientes_codigodocliente(String clientes_codigodocliente) {
        this.clientes_codigodocliente = clientes_codigodocliente;
    }

    public String getClientes_nomedaempresa() {
        return clientes_nomedaempresa;
    }

    public void setClientes_nomedaempresa(String clientes_nomedaempresa) {
        this.clientes_nomedaempresa = clientes_nomedaempresa;
    }

    public String getClientes_nomedocontato() {
        return clientes_nomedocontato;
    }

    public void setClientes_nomedocontato(String clientes_nomedocontato) {
        this.clientes_nomedocontato = clientes_nomedocontato;
    }

    public String getClientes_cargodocontato() {
        return clientes_cargodocontato;
    }

    public void setClientes_cargodocontato(String clientes_cargodocontato) {
        this.clientes_cargodocontato = clientes_cargodocontato;
    }

    public String getClientes_endereco() {
        return clientes_endereco;
    }

    public void setClientes_endereco(String clientes_endereco) {
        this.clientes_endereco = clientes_endereco;
    }

    public String getClientes_cidade() {
        return clientes_cidade;
    }

    public void setClientes_cidade(String clientes_cidade) {
        this.clientes_cidade = clientes_cidade;
    }

    public String getClientes_regiao() {
        return clientes_regiao;
    }

    public void setClientes_regiao(String clientes_regiao) {
        this.clientes_regiao = clientes_regiao;
    }

    public String getClientes_cep() {
        return clientes_cep;
    }

    public void setClientes_cep(String clientes_cep) {
        this.clientes_cep = clientes_cep;
    }

    public String getClientes_pais() {
        return clientes_pais;
    }

    public void setClientes_pais(String clientes_pais) {
        this.clientes_pais = clientes_pais;
    }

    public String getClientes_telefone() {
        return clientes_telefone;
    }

    public void setClientes_telefone(String clientes_telefone) {
        this.clientes_telefone = clientes_telefone;
    }

    public String getClientes_fax() {
        return clientes_fax;
    }

    public void setClientes_fax(String clientes_fax) {
        this.clientes_fax = clientes_fax;
    }

    public int getDetalhes_pedido_numerodopedido() {
        return detalhes_pedido_numerodopedido;
    }

    public void setDetalhes_pedido_numerodopedido(int detalhes_pedido_numerodopedido) {
        this.detalhes_pedido_numerodopedido = detalhes_pedido_numerodopedido;
    }

    public int getDetalhes_pedido_codigodoproduto() {
        return detalhes_pedido_codigodoproduto;
    }

    public void setDetalhes_pedido_codigodoproduto(int detalhes_pedido_codigodoproduto) {
        this.detalhes_pedido_codigodoproduto = detalhes_pedido_codigodoproduto;
    }

    public int getDetalhes_pedido_precounitario() {
        return detalhes_pedido_precounitario;
    }

    public void setDetalhes_pedido_precounitario(int detalhes_pedido_precounitario) {
        this.detalhes_pedido_precounitario = detalhes_pedido_precounitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public int getCodigodofuncionario() {
        return codigodofuncionario;
    }

    public void setCodigodofuncionario(int codigodofuncionario) {
        this.codigodofuncionario = codigodofuncionario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Date getDatadecontratacao() {
        return datadecontratacao;
    }

    public void setDatadecontratacao(Date datadecontratacao) {
        this.datadecontratacao = datadecontratacao;
    }

    public String getEmpregados_endereco() {
        return empregados_endereco;
    }

    public void setEmpregados_endereco(String empregados_endereco) {
        this.empregados_endereco = empregados_endereco;
    }

    public String getEmpregados_cidade() {
        return empregados_cidade;
    }

    public void setEmpregados_cidade(String empregados_cidade) {
        this.empregados_cidade = empregados_cidade;
    }

    public String getEmpregados_regiao() {
        return empregados_regiao;
    }

    public void setEmpregados_regiao(String empregados_regiao) {
        this.empregados_regiao = empregados_regiao;
    }

    public String getEmpregados_cep() {
        return empregados_cep;
    }

    public void setEmpregados_cep(String empregados_cep) {
        this.empregados_cep = empregados_cep;
    }

    public String getEmpregados_pais() {
        return empregados_pais;
    }

    public void setEmpregados_pais(String empregados_pais) {
        this.empregados_pais = empregados_pais;
    }

    public String getTelefoneresidencial() {
        return telefoneresidencial;
    }

    public void setTelefoneresidencial(String telefoneresidencial) {
        this.telefoneresidencial = telefoneresidencial;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(int supervisor) {
        this.supervisor = supervisor;
    }

    public String getFornecedores_codigodoforneced() {
        return fornecedores_codigodoforneced;
    }

    public void setFornecedores_codigodoforneced(String fornecedores_codigodoforneced) {
        this.fornecedores_codigodoforneced = fornecedores_codigodoforneced;
    }

    public String getFornecedores_nomedaempresa() {
        return fornecedores_nomedaempresa;
    }

    public void setFornecedores_nomedaempresa(String fornecedores_nomedaempresa) {
        this.fornecedores_nomedaempresa = fornecedores_nomedaempresa;
    }

    public String getFornecedores_nomedocontato() {
        return fornecedores_nomedocontato;
    }

    public void setFornecedores_nomedocontato(String fornecedores_nomedocontato) {
        this.fornecedores_nomedocontato = fornecedores_nomedocontato;
    }

    public String getFornecedores_cargodocontato() {
        return fornecedores_cargodocontato;
    }

    public void setFornecedores_cargodocontato(String fornecedores_cargodocontato) {
        this.fornecedores_cargodocontato = fornecedores_cargodocontato;
    }

    public String getFornecedores_endereco() {
        return fornecedores_endereco;
    }

    public void setFornecedores_endereco(String fornecedores_endereco) {
        this.fornecedores_endereco = fornecedores_endereco;
    }

    public String getFornecedores_cidade() {
        return fornecedores_cidade;
    }

    public void setFornecedores_cidade(String fornecedores_cidade) {
        this.fornecedores_cidade = fornecedores_cidade;
    }

    public String getFornecedores_regiao() {
        return fornecedores_regiao;
    }

    public void setFornecedores_regiao(String fornecedores_regiao) {
        this.fornecedores_regiao = fornecedores_regiao;
    }

    public String getFornecedores_cep() {
        return fornecedores_cep;
    }

    public void setFornecedores_cep(String fornecedores_cep) {
        this.fornecedores_cep = fornecedores_cep;
    }

    public String getFornecedores_pais() {
        return fornecedores_pais;
    }

    public void setFornecedores_pais(String fornecedores_pais) {
        this.fornecedores_pais = fornecedores_pais;
    }

    public String getFornecedores_telefone() {
        return fornecedores_telefone;
    }

    public void setFornecedores_telefone(String fornecedores_telefone) {
        this.fornecedores_telefone = fornecedores_telefone;
    }

    public String getFornecedores_fax() {
        return fornecedores_fax;
    }

    public void setFornecedores_fax(String fornecedores_fax) {
        this.fornecedores_fax = fornecedores_fax;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getPedidos_numerodopedido() {
        return pedidos_numerodopedido;
    }

    public void setPedidos_numerodopedido(int pedidos_numerodopedido) {
        this.pedidos_numerodopedido = pedidos_numerodopedido;
    }

    public String getPedidos_codigodocliente() {
        return pedidos_codigodocliente;
    }

    public void setPedidos_codigodocliente(String pedidos_codigodocliente) {
        this.pedidos_codigodocliente = pedidos_codigodocliente;
    }

    public int getCodigodofuncionário() {
        return codigodofuncionário;
    }

    public void setCodigodofuncionário(int codigodofuncionário) {
        this.codigodofuncionário = codigodofuncionário;
    }

    public Date getDatadopedido() {
        return datadopedido;
    }

    public void setDatadopedido(Date datadopedido) {
        this.datadopedido = datadopedido;
    }

    public Date getDatadeentrega() {
        return datadeentrega;
    }

    public void setDatadeentrega(Date datadeentrega) {
        this.datadeentrega = datadeentrega;
    }

    public Date getDatadeenvio() {
        return datadeenvio;
    }

    public void setDatadeenvio(Date datadeenvio) {
        this.datadeenvio = datadeenvio;
    }

    public int getVia() {
        return via;
    }

    public void setVia(int via) {
        this.via = via;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public String getNomedodestinatario() {
        return nomedodestinatario;
    }

    public void setNomedodestinatario(String nomedodestinatario) {
        this.nomedodestinatario = nomedodestinatario;
    }

    public String getEnderecododestinatario() {
        return enderecododestinatario;
    }

    public void setEnderecododestinatario(String enderecododestinatario) {
        this.enderecododestinatario = enderecododestinatario;
    }

    public String getCidadededestino() {
        return cidadededestino;
    }

    public void setCidadededestino(String cidadededestino) {
        this.cidadededestino = cidadededestino;
    }

    public String getRegiaodedestino() {
        return regiaodedestino;
    }

    public void setRegiaodedestino(String regiaodedestino) {
        this.regiaodedestino = regiaodedestino;
    }

    public String getCepdedestino() {
        return cepdedestino;
    }

    public void setCepdedestino(String cepdedestino) {
        this.cepdedestino = cepdedestino;
    }

    public String getPaisdedestino() {
        return paisdedestino;
    }

    public void setPaisdedestino(String paisdedestino) {
        this.paisdedestino = paisdedestino;
    }

    public int getProdutos_codigodoproduto() {
        return produtos_codigodoproduto;
    }

    public void setProdutos_codigodoproduto(int produtos_codigodoproduto) {
        this.produtos_codigodoproduto = produtos_codigodoproduto;
    }

    public String getNomedoproduto() {
        return nomedoproduto;
    }

    public void setNomedoproduto(String nomedoproduto) {
        this.nomedoproduto = nomedoproduto;
    }

    public int getProdutos_codigodofornecedor() {
        return produtos_codigodofornecedor;
    }

    public void setProdutos_codigodofornecedor(int produtos_codigodofornecedor) {
        this.produtos_codigodofornecedor = produtos_codigodofornecedor;
    }

    public int getProdutos_codigodacategoria() {
        return produtos_codigodacategoria;
    }

    public void setProdutos_codigodacategoria(int produtos_codigodacategoria) {
        this.produtos_codigodacategoria = produtos_codigodacategoria;
    }

    public String getQuantidadeporunidade() {
        return quantidadeporunidade;
    }

    public void setQuantidadeporunidade(String quantidadeporunidade) {
        this.quantidadeporunidade = quantidadeporunidade;
    }

    public Double getProdutos_precounitario() {
        return produtos_precounitario;
    }

    public void setProdutos_precounitario(Double produtos_precounitario) {
        this.produtos_precounitario = produtos_precounitario;
    }

    public Double getUnidadesemestoque() {
        return unidadesemestoque;
    }

    public void setUnidadesemestoque(Double unidadesemestoque) {
        this.unidadesemestoque = unidadesemestoque;
    }

    public Double getUnidadespedidas() {
        return unidadespedidas;
    }

    public void setUnidadespedidas(Double unidadespedidas) {
        this.unidadespedidas = unidadespedidas;
    }

    public Double getNiveldereposicao() {
        return niveldereposicao;
    }

    public void setNiveldereposicao(Double niveldereposicao) {
        this.niveldereposicao = niveldereposicao;
    }

    public String getDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(String descontinuado) {
        this.descontinuado = descontinuado;
    }

    public int getCodigodatransportadora() {
        return codigodatransportadora;
    }

    public void setCodigodatransportadora(int codigodatransportadora) {
        this.codigodatransportadora = codigodatransportadora;
    }

    public String getTransportadoras_nomedaempresa() {
        return transportadoras_nomedaempresa;
    }

    public void setTransportadoras_nomedaempresa(String transportadoras_nomedaempresa) {
        this.transportadoras_nomedaempresa = transportadoras_nomedaempresa;
    }

    public String getTransportadoras_telefone() {
        return transportadoras_telefone;
    }

    public void setTransportadoras_telefone(String transportadoras_telefone) {
        this.transportadoras_telefone = transportadoras_telefone;
    }
        
}
