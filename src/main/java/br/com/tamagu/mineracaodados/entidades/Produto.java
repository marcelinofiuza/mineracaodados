/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
        
}
