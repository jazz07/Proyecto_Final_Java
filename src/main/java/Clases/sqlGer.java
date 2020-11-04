/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import com.mycompany.mavenproyecto1.Conexión;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * 
 */
public class sqlGer {
public int  ID_INCREMENTABLE(){
        int ID = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexión db = new Conexión();
        try{
            ps = db.getConection().prepareStatement("SELECT MAX(ID_GERENCIA) FROM gerencia");
            rs = ps.executeQuery();
            while(rs.next()){
                ID = rs.getInt(1)+ 1;
            }
        }catch(Exception ex){
            System.out.println("ERROR"+ex.getMessage());
            
        }
        finally{
            try{
                ps.close();
                rs.close();
                db.CerrarConection();
            }catch(Exception ex){
                
            }
        }
        return ID;
        
    }
}
