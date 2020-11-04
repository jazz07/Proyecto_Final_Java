/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import com.mycompany.mavenproyecto1.Conexión;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * 
 */
public class Gerentes {
private final String SQL_Agre = "insert into finalproy.gerencia; (ID_GERENCIA,nombre,Pass) values (?,?,?)";
    private DefaultTableModel dt;
    private ResultSet rs;
    private final Conexión connect;
    
    public Gerentes(){
           connect= new Conexión(); 
    }
       private DefaultTableModel setTitulos() {
        dt = new DefaultTableModel();
        dt.addColumn("ID_GERENCIA");
        dt.addColumn("nombre");
        dt.addColumn("Pass");
           return dt;
    }
       public void SaveData(int ID_GERENCIA,String nombre,String Pass){
       try {
         CallableStatement cs = connect.getConection().prepareCall("call finalproy.Ingresar_Gerentes(?,?,?)");
          //sql a = new sql();
          cs.setInt(1, ID_GERENCIA); // a.ID_INCREMENTABLE();
           cs.setString(2,nombre);
           cs.setString(3, Pass);
     if (cs.executeUpdate()==1) {
          
            }
  } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
           connect.CerrarConection();
        }
       }
    }

