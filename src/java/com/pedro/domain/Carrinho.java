package com.pedro.domain;

import com.pedro.service.ProdutoService;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Carrinho implements Serializable {
    
    public static final String SEPARADOR_PRODUTO = "&";
    public static final String SEPARADOR_CAMPO = "@";
    
    //Método estático utilizado para obter um objeto do tipo Cookie a partir da requisição 
    //e do identificador cookie do carrinho de compras
    public static final Cookie obterCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        
        for(int i = 0; cookies != null && i < cookies.length; i++){
            if(cookies[i].getName().equals("pedro.carrinho")){
                cookie = cookies[i];
                break;
            }
        }
        return cookie;
    }
    
    public static final List<CarrinhoCompraItem> obterCarrinhoCompra(String valor) throws SQLException{
        List<CarrinhoCompraItem> carrinhoCompraItens = new ArrayList<>();
        if(valor == null || valor.trim().length() == 0 || !valor.contains(SEPARADOR_CAMPO)){
            return carrinhoCompraItens;
        }
        ProdutoService ps = new ProdutoService();
        
        if(valor.contains(SEPARADOR_PRODUTO)){
            String[] produtos = valor.split(SEPARADOR_PRODUTO);
            for(int i=0; produtos != null && i<produtos.length; i++){
                String[] item = produtos[i].split(SEPARADOR_CAMPO);
                CarrinhoCompraItem carrinhoCompraItem = new CarrinhoCompraItem();
                
                Produto produto = ps.buscarProdutoPorId(Integer.parseInt(item[0]));
                
                carrinhoCompraItem.setProduto(produto);
                carrinhoCompraItem.setQuantidade(Integer.parseInt(item[1]));
                carrinhoCompraItens.add(carrinhoCompraItem);
            }
        } else{
            String[] item = valor.split(SEPARADOR_CAMPO);
            CarrinhoCompraItem carrinhoCompraItem = new CarrinhoCompraItem();
                
            Produto produto = ps.buscarProdutoPorId(Integer.parseInt(item[0]));
                
            carrinhoCompraItem.setProduto(produto);
            carrinhoCompraItem.setQuantidade(Integer.parseInt(item[1]));
            carrinhoCompraItens.add(carrinhoCompraItem);
        }
        return carrinhoCompraItens;
        
    }
}
