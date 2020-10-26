/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproyecto1;

import java.sql.SQLException;

/**
 *
 * @author 1
 */
public class Principal {
     public static void main(String[] args) throws SQLException {
        Conectar conect = new Conectar();
        conect.getConnection();
        
        Prueba02 menuPrin = new Prueba02();
        menuPrin.setVisible(true);
    }
    
}
