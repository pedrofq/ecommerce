package com.pedro.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable {
    
    private Integer id;
    private String descricao;
    private String foto;
    private Double preco;
    private Integer quantidade;
    
    private List<Categoria> categorias = new ArrayList<>();
    
    public Produto(){
    }
    
    public Produto(Integer id, String descricao, String foto, Double preco, Integer quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.foto = foto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getFoto() {
        return foto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", descricao=" + descricao + ", foto: " + foto + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
