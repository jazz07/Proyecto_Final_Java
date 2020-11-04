/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
//db. closeConnection();
//Connection().prepareStatement("SELECT MAX(ID_USUARIO) FROM cliente;");
import com.mycompany.mavenproyecto1.Conexión;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class sql {

    public int  ID_INCREMENTABLE(){
        int ID = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexión db = new Conexión();
        try{
            ps = db.getConection().prepareStatement("SELECT MAX(ID_USUARIO) FROM cliente");
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
