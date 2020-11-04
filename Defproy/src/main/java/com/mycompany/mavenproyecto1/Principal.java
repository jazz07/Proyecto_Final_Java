/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproyecto1;


import Forms.Bienvenida;
import java.sql.SQLException;

/**
 *
 * @author 1
 */
public class Principal {
     public static void main(String[] args) throws SQLException {
        Conexión conect = new Conexión();
        conect.getConnection();
        
        Bienvenida Welcome = new Bienvenida();
        Welcome.setVisible(true);
    }
    
}
