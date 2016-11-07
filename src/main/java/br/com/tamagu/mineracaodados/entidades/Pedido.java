/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jedi
 */
@Entity
public class Pedido implements Serializable {
    
    @Id
    private int numeroDoPedido;
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="id_empregado")
    private Empregado empregado;
    @Temporal(value=TemporalType.DATE)
    private Date dataDoPedido;
    @Temporal(value=TemporalType.DATE)
    private Date dataDeEntrega;
    @Temporal(value=TemporalType.DATE)
    private Date dataDeEnvio;
    @ManyToOne
    @JoinColumn(name="id_transportadora")    
    private Transportadora transportadora;
    private BigDecimal frete;
    private String nomeDoDestinatario;
    private String enderecoDoDestinatario;
    private String cidadeDeDestino;
    private String regiaoDeDestino;
    private String cepDeDestino;
    private String paisDeDestino;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy ="pedido")
//    private List<DetalhesPedido> detalhesPedido;
    
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Date getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(Date dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public Date getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(Date dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public Date getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(Date dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

    public String getNomeDoDestinatario() {
        return nomeDoDestinatario;
    }

    public void setNomeDoDestinatario(String nomeDoDestinatario) {
        this.nomeDoDestinatario = nomeDoDestinatario;
    }

    public String getEnderecoDoDestinatario() {
        return enderecoDoDestinatario;
    }

    public void setEnderecoDoDestinatario(String enderecoDoDestinatario) {
        this.enderecoDoDestinatario = enderecoDoDestinatario;
    }

    public String getCidadeDeDestino() {
        return cidadeDeDestino;
    }

    public void setCidadeDeDestino(String cidadeDeDestino) {
        this.cidadeDeDestino = cidadeDeDestino;
    }

    public String getRegiaoDeDestino() {
        return regiaoDeDestino;
    }

    public void setRegiaoDeDestino(String regiaoDeDestino) {
        this.regiaoDeDestino = regiaoDeDestino;
    }

    public String getCepDeDestino() {
        return cepDeDestino;
    }

    public void setCepDeDestino(String cepDeDestino) {
        this.cepDeDestino = cepDeDestino;
    }

    public String getPaisDeDestino() {
        return paisDeDestino;
    }

    public void setPaisDeDestino(String paisDeDestino) {
        this.paisDeDestino = paisDeDestino;
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
