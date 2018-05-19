/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public class Database {
    private String host;
    private String port;
    private String user;
    private String password;
    private String server;
    private static Connection con;
    private String schema;

    public Database(String host, String port, String user, String password, String schema) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;        
        this.schema = schema;
    }
    
    public Connection connect(){
        
        this.server = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.schema+"?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Madrid";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Error al registrar el driver: "+e.getLocalizedMessage());
            return null;
        }
        
        try{
            this.con = DriverManager.getConnection(this.server,this.user,this.password);
        }catch(SQLException e){
            System.out.println("Error al conectar a "+server+": "+e.getLocalizedMessage());
            return null;
        }
        
        return this.con;
        
    }

    public Connection getCon() {
        return con;
    }
    
    public int disconnect(){
        try{
            con.close();
        }catch(SQLException e){
            System.out.println("Error al desconectar: "+e.getLocalizedMessage());
            return -1;
        }
        return 0;
    }
    
}
