/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eduardocamargo.dal;


import java.sql.*;

/**
 *
 * @author Eduardo
 */
public class ModuloConexao {
    // Método responsável por fazer conexaõ com o DB
    
    // Método com Retorno
    public static Connection conector(){
        
        //Crio Uma variavel e atribuo valor Nulo INICIALMENTE
        java.sql.Connection conexao = null;
        
        // Chama p Driver MYSQL
        String driver = "com.mysql.jdbc.Driver";
        //Armanezando Dados do DB
        String url ="jdbc:mysql://localhost:3306/dbinfox";
        String user="root";
        String password ="";
                // Estabelecendp a Conexao

           // Caso de : Ok
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }
            // Caso de : ERRO
            catch (Exception e) {
                // Mensagem que diz o ERRO da Conexao
                System.out.println(e);
               return null;
            
            
        }
    
    }
    
}
