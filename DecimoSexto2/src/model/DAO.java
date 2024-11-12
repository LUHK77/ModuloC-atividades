/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class DAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/exemplo_crud";
    private static final String USER = "root";
    private static final String pswd = "root123";
    
    public static Connection getConnection(){
      Connection connection = null;
      try{
        connection = DriverManager.getConnection(URL, USER,pswd);
      } catch(SQLException erro) {
            System.err.println("Erro ao conectar ao banco" + erro.getMessage());
        }
      return connection;
    }
}
