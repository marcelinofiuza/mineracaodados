/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jedi
 */
@Entity
public class Produto implements Serializable {
    
    @Id
    private int idProduto;
    private String nomeDoProduto;
    @ManyToOne
    @JoinColumn(name="id_fornecedor")
    private Fornecedor fornecedor;
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    private String quantidadePorUnidade;
    private BigDecimal precoUnitario;
    private int unidadesEmEstoque;
    private int unidadesPedidas;
    private int nivelDeReposicao;
    private Boolean descontinuado;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
//    private List<DetalhesPedido> detalhesPedido;
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getQuantidadePorUnidade() {
        return quantidadePorUnidade;
    }

    public void setQuantidadePorUnidade(String quantidadePorUnidade) {
        this.quantidadePorUnidade = quantidadePorUnidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getUnidadesEmEstoque() {
        return unidadesEmEstoque;
    }

    public void setUnidadesEmEstoque(int unidadesEmEstoque) {
        this.unidadesEmEstoque = unidadesEmEstoque;
    }

    public int getUnidadesPedidas() {
        return unidadesPedidas;
    }

    public void setUnidadesPedidas(int unidadesPedidas) {
        this.unidadesPedidas = unidadesPedidas;
    }

    public int getNivelDeReposicao() {
        return nivelDeReposicao;
    }

    public void setNivelDeReposicao(int nivelDeReposicao) {
        this.nivelDeReposicao = nivelDeReposicao;
    }

    public Boolean getDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(Boolean descontinuado) {
        this.descontinuado = descontinuado;
    }
        
//    public List<DetalhesPedido> getDetalhesPedido() {
//        return detalhesPedido;
//    }
//
//    public void setDetalhesPedido(List<DetalhesPedido> detalhesPedido) {
//        this.detalhesPedido = detalhesPedido;
//    }
//    
//    public void addDetalhesPedido(DetalhesPedido detalhesPedido){
//        if(this.detalhesPedido == null){
//            this.detalhesPedido = new LinkedList<>();
//        }
//        this.detalhesPedido.add(detalhesPedido);
//    }    
}
