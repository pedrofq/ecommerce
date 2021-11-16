package com.pedro;

import com.pedro.domain.Venda;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO {
    private String nome;
    private String endereco;
    private String email;
    private String login;
    private String senha;
    private Boolean administrador;
    private String adm;
    private List<Venda> Vendas = new ArrayList<>(); 
    
    public UsuarioDTO(){
    }
    
    public static UsuarioDTO RegistrarDTO(String nome, String endereco, String email, String login, String senha, Boolean administrador) {
        
        UsuarioDTO userdto = new UsuarioDTO();
        
        userdto.nome = nome;
        userdto.endereco = endereco;
        userdto.email = email;
        userdto.login = login;
        userdto.senha = senha;
        userdto.administrador = administrador;
        
        return userdto;
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

    public String getAdm() {
        return adm;
    }

    public List<Venda> getVendas() {
        return Vendas;
    }
    
}
