package com.pedro.service;

import com.pedro.ConnectDB;
import com.pedro.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoService {
    public int registrarProduto(String descricao, String foto, Double preco, Integer quantidade){
        ProdutoDTO prod = new ProdutoDTO(null, descricao, foto, preco, quantidade);
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "INSERT INTO public.produto (descricao, foto, preco, quantidade) VALUES(?, ?, ?, ?)";
        
        try{
        PreparedStatement pst = connection.prepareStatement(queryStr);
        pst.setString(1, prod.getDescricao()); 
        pst.setString(2, prod.getFoto());
        pst.setDouble(3, prod.getPreco());
        pst.setInt(4, prod.getQuantidade());
 
        pst.execute();
        
        
        }catch(Exception e){
             System.out.println(e);
             return 0;
        }
        return 1;
    }
    
    public int buscarProdutoPorCategoria(Integer id){
        ProdutoDTO prod = new ProdutoDTO();
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
       
        
        String queryStr = "SELECT * FROM public.produto_categoria WHERE id_categoria = ?";
        
        try{
        PreparedStatement pst = connection.prepareStatement(queryStr);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
       
        while(rs.next()){
            String queryStr2 = "SELECT * FROM public.produto WHERE id_produto = ?";
            try{
             PreparedStatement pst2 = connection.prepareStatement(queryStr2);
             pst2.setInt(1, rs.getInt("id_produto"));
             ResultSet rs2 = pst2.executeQuery();
             
             while(rs2.next()){
                
                prod.setId(rs2.getInt("id_produto"));
                prod.setDescricao(rs2.getString("descricao"));
                prod.setFoto(rs2.getString("foto"));
                prod.setPreco(rs2.getDouble("preco"));
                prod.setQuantidade(rs2.getInt("quantidade"));
             }
             
             
            }catch(Exception e){
             System.out.println(e);
             return 0;
            }
        }
        }catch(Exception e){
         System.out.println(e);
         return 0;    
        
        }
        return 1;
    }
  
}
