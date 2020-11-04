/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class AggOrden {
    
    
    Conectar conexion;

    public AggOrden() {
        conexion = new Conectar();

    }
    public int aggOrden1 (String NOMBRE, String precio){
        int respuesta =0;
        try {
          Connection BD = conexion.getConnection();  
          CallableStatement cs = BD.prepareCall("{call orden (?,?)}");
          cs.setString(1, NOMBRE);
            cs.setString(2,precio);
            respuesta= cs.executeUpdate();
            
             if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "El registro se ha guardado!");
            }
            else{
                System.err.println("Debe llenar todos los campos");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("No se pudo guardar el registro" + e.getMessage());
        }
        
     return respuesta;   
    }
    
    public int aggOrden2 (double total, int noDeMesa,String fecha ){
        int respuesta =0;
        try {
          Connection BD = conexion.getConnection();  
          CallableStatement cs = BD.prepareCall("{call orden2 (?,?,?)}");
          cs.setDouble(1, total);
            cs.setInt(2,noDeMesa);
            cs.setString(3,fecha);
            respuesta= cs.executeUpdate();
            
             if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "El registro se ha guardado!");
            }
            else{
                System.err.println("Debe llenar todos los campos");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("No se pudo guardar el registro" + e.getMessage());
        }
        
     return respuesta;   
    }
    
    
}
