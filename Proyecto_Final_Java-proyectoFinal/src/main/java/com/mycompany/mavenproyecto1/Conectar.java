/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproyecto1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class Conectar {
    
    Connection conn  = null;//que sea variable global para usarla en otros metodos.
    String hostname = null; //Inicializando las variables, mismas que estan en el archivo. 
    String port = null;
    String database = null;
    String driver = null;
    String username = null;
    String password = null;
    String jndi = null;
    
    static Properties props = new Properties(); //Se esta instanciando un objeto de la clase propiedades.
    
    public Conectar (){
        InputStream in = null;
        try {
            
            in = Files.newInputStream(FileSystems.getDefault().getPath("c:\\facturacion\\db_props.properties"));//abriendo el archivo que contiene informacion para conectar.
            props.load(in);//la variable esta leyendo lo que contiene el archivo db_props.
            
            in.close();//importante cerrar despues de este proceso.
            
        } 
        catch (IOException e) {
            e.printStackTrace();//si hay algun error, nos va a decir cual.
        }
        
        // Cargando un metodo para cargar la informacion en memoria.
        
        loadProperties ();
    }
    public void loadProperties(){
        this.hostname = props.getProperty("hostname");//extrayendo info, trayendo la propiedad.
        this.port = props.getProperty("port");
        this.database = props.getProperty("database");
        this.driver = props.getProperty("driver");
        this.username = props.getProperty("username");
        this.password = props.getProperty("password");
        this.jndi = props.getProperty("jndi");
    }
    
    public Connection getConnection() throws SQLException{ //funcion para poder cargar todo mas facilmente al tener clases hijas
        //entonces se podria en vez de usar CassNotFoundException, usar el try y catch. 
        try {
            
            Class.forName(driver);
        
        String jdbcUrl = "jdbc:mysql://"+hostname+":"+port+"/"+database;
        conn = DriverManager.getConnection(jdbcUrl, username, password);//conecta 
        System.out.println("Conexion Establecida");
        
        } catch (Exception e) {
            System.out.println("Error en la conexion a la base de datos");
            
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return conn;//por lo general se debe retornar un valor en esta funcion, no olvidar!!!
    }
    public void closeConnection(){
        try {
            conn.close();
        System.out.println("La sesion se cerro exitosamente");//Cerrando...
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion");
        }
    }
    
}
