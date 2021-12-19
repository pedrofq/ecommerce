package com.pedro.service;

import com.pedro.ConnectDB;
import com.pedro.domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioService{
    
    public static int registrar(String nome, String endereco, String email, String login, String senha){   
        Usuario user = new Usuario(null, nome, endereco, email, login, senha, false);
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        String queryStr = "INSERT INTO public.usuario (nome, endereco, email, login, senha, administrador) VALUES(?, ?, ?, ?, ?, ?)";
        
        try{
        PreparedStatement pst = connection.prepareStatement(queryStr);
        pst.setString(1, user.getNome()); 
        pst.setString(2, user.getEndereco());
        pst.setString(3, user.getEmail()); 
        pst.setString(4, user.getLogin()); 
        pst.setString(5, user.getSenha()); 
        pst.setString(6, "false"); 
 
        pst.execute();
        
        
        }catch(Exception e){
             System.out.println(e);
             return 0;
        }
        return 1;
    }
    
    public static Usuario buscarUsuarioLogin(String login){
   
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        Usuario user = null;
        
        String queryStr =  "SELECT * FROM usuario " + "WHERE login = ?";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(queryStr);
            pstmt.setString(1, login);

            ResultSet rs = pstmt.executeQuery();
     
        while (rs.next()) {
            user = new Usuario();
            user.setId(rs.getInt("id_user"));
            user.setEmail(rs.getString("email"));
            user.setEndereco(rs.getString("endereco"));
            user.setNome(rs.getString("nome"));
            user.setLogin(rs.getString("login"));
            if(rs.getString("administrador") == "false"){
                user.setAdministrador(false);
            }else{
                user.setAdministrador(true);
            }      
            user.setSenha(rs.getString("senha")); 
        }
        rs.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return user;
    }
    
    public static void alterarUsuario(String nome, String endereco, String email, Usuario user){
        
        String nomeInserir;
        String enderecoInserir;
        String emailInserir;
        
        ConnectDB con = new ConnectDB();
        Connection connection = con.conectar();
        
        if(nome == null || "".equals(nome)){
            nomeInserir = user.getNome();
        }else{
            nomeInserir = nome;
        }
        if(endereco == null || "".equals(endereco)){
            enderecoInserir = user.getEndereco();
        }else{
            enderecoInserir = endereco;
        }
        if(email == null || "".equals(email)){
            emailInserir = user.getEmail();
        }else{
            emailInserir = email;
        }
        
        String login = user.getLogin();
        
        String queryStr = "UPDATE public.usuario SET nome=?, endereco=?, email=? WHERE login=?";
        
        try{
            PreparedStatement pst = connection.prepareStatement(queryStr);
            pst.setString(1, nomeInserir);
            pst.setString(2, enderecoInserir);
            pst.setString(3, emailInserir);
            pst.setString(4, login);
            
            pst.execute();
            pst.close();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

   
}
