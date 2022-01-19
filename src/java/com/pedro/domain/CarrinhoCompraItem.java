package com.pedro.domain;

import java.io.Serializable;

public class CarrinhoCompraItem implements Serializable {
    
    private Produto produto;
    private Integer Quantidade;

    public CarrinhoCompraItem() {
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer Quantidade) {
        this.Quantidade = Quantidade;
    }
}
