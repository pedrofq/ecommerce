package com.pedro.service;

import com.pedro.ConnectDB;
import com.pedro.ProdutoDTO;
import com.pedro.domain.Categoria;
import com.pedro.domain.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    public int registrarProduto(String descricao, String foto, Double preco, Integer quantidade){
        
        Integer idProduto = null;
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();

        ProdutoDTO prod = new ProdutoDTO(null, descricao, foto, preco, quantidade);

        String queryStr = "INSERT INTO public.produto (descricao, foto, preco, quantidade) VALUES(?, ?, ?, ?)";
        String queryStr2 = "SELECT * FROM public.produto WHERE descricao = ?";
        
        try{
        PreparedStatement pst = connection.prepareStatement(queryStr);
        pst.setString(1, prod.getDescricao()); 
        pst.setString(2, prod.getFoto());
        pst.setDouble(3, prod.getPreco());
        pst.setInt(4, prod.getQuantidade());
 
        pst.execute();
        pst.close();
        
        PreparedStatement pst2 = connection.prepareStatement(queryStr2);
        pst2.setString(1, prod.getDescricao());
        ResultSet rs = pst2.executeQuery();
        
        while(rs.next()){
            idProduto = rs.getInt("id_produto");
        }
        pst2.close();
        }catch(Exception e){
             System.out.println(e);
             return 0;
        }      
        return idProduto;
    }
    
    
    public int registrarProdutoProCategoria(Integer id_produto, Integer id_categoria){
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "INSERT INTO public.produto_categoria (id_produto, id_categoria) VALUES(?, ?)";
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);
            pst.setInt(1, id_produto);      
            pst.setInt(2, id_categoria);  
            pst.execute();
            pst.close();
            
        }catch(Exception e){
            System.out.print(e);
            return 0;
            
        }
        return id_produto;
    }
    
    public List<Produto> buscarProdutoPorCategoria(Integer id){
        Categoria cat = new Categoria();
        List<Produto> listaProdutos = new ArrayList<>();
        
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
                    Produto prod = new Produto();
                    
                    prod.setId(rs2.getInt("id_produto"));
                    prod.setDescricao(rs2.getString("descricao"));
                    prod.setFoto(rs2.getString("foto"));
                    prod.setPreco(rs2.getDouble("preco"));
                    prod.setQuantidade(rs2.getInt("quantidade"));
                    
                    listaProdutos.add(prod);
                }
 
            pst2.close();
            }catch(Exception e){
             System.out.println(e);
             return null;
            }
        }
        connection.close();
        pst.close();
        
        }catch(Exception e){
         System.out.println(e);  
         return null;
        }
        return listaProdutos;
    }
    
    public Produto buscarProdutoPorId(Integer id) throws SQLException{
        
        Produto prod = new Produto();
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "SELECT * FROM public.produto WHERE id_produto = ?";
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                prod.setId(rs.getInt("id_produto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setFoto(rs.getString("foto"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setQuantidade(rs.getInt("quantidade"));
            }
            pst.close();
            
            }catch(Exception e){
                prod = null;
            }
        
            connection.close();
        
        return prod;
    }
    
    
    public Produto obter(int id) throws Exception {
        Produto produto = null;
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, descricao, quantidade, preco, foto FROM produto WHERE id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            produto = new Produto();
            produto.setId(resultSet.getInt("id"));
            produto.setDescricao(resultSet.getString("descricao"));
            produto.setQuantidade(resultSet.getInt("quantidade"));
            produto.setPreco(resultSet.getDouble("preco"));
            produto.setFoto(resultSet.getString("foto"));
            if (resultSet.wasNull()) {
                produto.setFoto(null);
            }
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        if (produto == null) {
            throw new Exception("Produto nÃ£o encontrado");
        }
        return produto;
    }
    
    
    
    public List<Produto> buscarTodosProdutos() throws SQLException{
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "SELECT * FROM public.produto";
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);         
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Produto prod = new Produto();
                
                prod.setId(rs.getInt("id_produto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setFoto(rs.getString("foto"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setQuantidade(rs.getInt("quantidade"));
                
                listaProdutos.add(prod);
            }
            pst.close();
            
            }catch(Exception e){
            }
        
            connection.close();
        
        return listaProdutos;
    }
    
    public List<Produto> buscarTodosProdutosEmEstoque() throws SQLException{
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "SELECT * FROM public.produto WHERE quantidade > 0";
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);         
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Produto prod = new Produto();
                
                prod.setId(rs.getInt("id_produto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setFoto(rs.getString("foto"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setQuantidade(rs.getInt("quantidade"));
                
                listaProdutos.add(prod);
            }
            pst.close();
            
            }catch(Exception e){
            }
        
            connection.close();
        
        return listaProdutos;
    } 
  
    
    public void deletarProdutoPorId(Integer idProduto) throws SQLException{
       
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "DELETE * FROM public.produto WHERE id_produto = ?" ;
        
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);
            pst.setInt(1, idProduto);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            }
            pst.close();
            
            }catch(Exception e){
            
            }
        
            connection.close();  
    } 
    
}


    
  


