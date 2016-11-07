/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jedi
 */
@Entity
//@AssociationOverrides({
//    @AssociationOverride(name ="pedido", joinColumns = @JoinColumn(name ="idPedido")),
//    @AssociationOverride(name ="produto", joinColumns = @JoinColumn(name ="idProduto"))   
//})
public class DetalhesPedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDetalhe;
    
    @ManyToOne
    @JoinColumn(name="id_pedido")
    private Pedido pedido;
    
    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;
    
    private BigDecimal precoUnitario;
    private int quantidade;
    private Float desconto;

    public int getIdDetalhe() {
        return idDetalhe;
    }

    public void setIdDetalhe(int idDetalhe) {
        this.idDetalhe = idDetalhe;
    }        
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }
        
}
