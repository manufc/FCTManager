/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manuel
 */
public final class Database {
    private static String host;
    private static String port;
    private static String user;
    private static String password;
    private static String server;
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
        
        this.server = "jdbc:derby:./derby/FCT_APP";
        try{
           Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        }catch(ClassNotFoundException e){
            System.out.println("Error al registrar el driver: "+e.getLocalizedMessage());
            return null;
        } catch (InstantiationException e) {
            System.out.println("Error al registrar el driver: "+e.getLocalizedMessage());
            return null;
        } catch (IllegalAccessException e) {
            System.out.println("Error al registrar el driver: "+e.getLocalizedMessage());
            return null;
        }
        
        try{
            this.con = DriverManager.getConnection(this.server,this.user,this.password);
        }catch(SQLException e){
            System.out.println("Error al conectar a "+server+": "+e.getLocalizedMessage());
            e.printStackTrace();
            return null;
        }
        
        return this.con;
        
    }

    public static Connection getCon() {
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
