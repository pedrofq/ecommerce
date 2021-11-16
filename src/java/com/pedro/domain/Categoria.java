package com.pedro.domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private Integer id;
    private String descricao;
    
    private List<Produto> produtos = new ArrayList<>();
    
    public Categoria(){
    }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
