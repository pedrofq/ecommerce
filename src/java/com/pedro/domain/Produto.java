package com.pedro.domain;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private Integer id;
    private String descricao;
    private Double preco;
    private String foto;
    private Integer quantidade;
    
    private List<Categoria> categorias = new ArrayList<>();
    
    public Produto(){
    }

    public Produto(Integer id, String descricao, Double preco, String foto, Integer quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.foto = foto;
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
}
