/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tamagu.mineracaodados.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jedi
 */
@Entity
public class Cliente  implements Serializable{
    
    @Id
    private String idCliente;    
 
    private String nomeDaEmpresa;
    private String nomeDoContato;
    private String cargoDoContato;
    private String endereco;
    private String cidade;
    private String regiao;
    private String cep;
    private String pais;
    private String telefone;
    private String fax;    

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getNomeDoContato() {
        return nomeDoContato;
    }

    public void setNomeDoContato(String nomeDoContato) {
        this.nomeDoContato = nomeDoContato;
    }

    public String getCargoDoContato() {
        return cargoDoContato;
    }

    public void setCargoDoContato(String cargoDoContato) {
        this.cargoDoContato = cargoDoContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
        
}
