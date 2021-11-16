package com.pedro.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nome;
    private String endereco;
    private String email;
    private String login;
    private String senha;
    private Boolean administrador;
    private List<Venda> Vendas = new ArrayList<>();
    
    public Usuario(){
    }

    public Usuario(Integer id, String nome, String endereco, String email, String login, String senha, Boolean administrador) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.administrador = administrador;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public List<Venda> getVendas() {
        return Vendas;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }    
    
    public void setVendas(List<Venda> Vendas) {
        this.Vendas = Vendas;
    }
}
