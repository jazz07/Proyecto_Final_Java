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
 * @author Garex
 */
public class Clientes {
private final String SQL_Agre = "insert into finalproy.cliente; (ID_USUARIO,Correo,Pass) values (?,?,?)";
    private DefaultTableModel dt;
    private ResultSet rs;
    private final Conexión connect;
    
     public Clientes(){
        connect= new Conexión(); 
    }
       private DefaultTableModel setTitulos() {
        dt = new DefaultTableModel();
        dt.addColumn("ID_USUARIO");
        dt.addColumn("correo");
        dt.addColumn("pass");
           return dt;
    }
       public void SaveData(int ID_USUARIO,String Correo,String Pass){
       try {
         CallableStatement cs = connect.getConection().prepareCall("call finalproy.Ingresar_Cliente(?,?,?)");
          //sql a = new sql();
          cs.setInt(1, ID_USUARIO); // a.ID_INCREMENTABLE();
           cs.setString(2,Correo);
           cs.setString(3, Pass);
     if (cs.executeUpdate()==1) {
          
            }
  } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
           connect.CerrarConection();
        }
       }
}
      
