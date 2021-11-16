package com.pedro.service;

import com.pedro.ConnectDB;
import com.pedro.UsuarioDTO;
import com.pedro.domain.Usuario;
import com.pedro.domain.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioService{
    
    private Integer id;
    private String nome;
    private String endereco;
    private String email;
    private String login;
    private String senha;
    private Boolean administrador;
    private List<Venda> Vendas = new ArrayList<>();
    
    
    public int registrar(String nome, String endereco, String email, String login, String senha){
        
        UsuarioDTO user = new UsuarioDTO();
        user = UsuarioDTO.RegistrarDTO(nome, endereco, email, login, senha, false);
        
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
        /*
        while(rs.next()) {
            System.out.println(rs.getWarnings());
        }
        } catch (Exception e){
            System.out.println(e);
        }
        */
    }
    
    
   
}
