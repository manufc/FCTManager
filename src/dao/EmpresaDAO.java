/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.Empresa;
import idao.IEmpresaDAO;
import java.util.ArrayList;

/**
 *
 * @author manuel
 */
public class EmpresaDAO implements IEmpresaDAO{
    
    private Database db;
    private Statement stm;

    public EmpresaDAO(Database db) {
        this.db = db;
        this.stm = null;
    }
    
     
    @Override
    public boolean add(Empresa empresa) {
        String sql = "INSERT INTO APP.EMPRESA values ('"+empresa.getCif()+"'"+
                                                  "'"+empresa.getNombre()+"',"+
                                                  "'"+empresa.getDireccion()+"',"+
                                                  "'"+empresa.getProvincia()+"',"+
                                                  "'"+empresa.getLocalidad()+"',"+
                                                  "'"+empresa.getCp()+"',"+
                                                  "'"+empresa.getTelefono()+"',"+
                                                  "'"+empresa.getFax()+"',"+
                                                  "'"+empresa.getEmail()+"',"+
                                                  "'"+empresa.getResponsable()+"',"+
                                                  "'"+empresa.getTutor()+"',"+
                
                
                ")";
        
        try{
            stm = db.getCon().createStatement();
            stm.execute(sql);
            stm.close();
        }catch(SQLException e){
            System.out.println("Error al insertar Empresa: "+e.getMessage());
            return false;
        }
        
        return true;
    
    
    }

    @Override
    public List<Empresa> getEmpresas() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        ResultSet rs;
        String sql = "SELECT * FROM APP.EMPRESA";
        
        try{
            stm = db.getCon().createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                Empresa e = new Empresa(rs.getString("cif"), 
                                        rs.getString("nombre"), 
                                        rs.getString("direccion"), 
                                        rs.getString("localidad"),
                                        rs.getString("provincia"),
                                        rs.getString("cp"),
                                        rs.getString("telefono"),
                                        rs.getString("fax"),
                                        rs.getString("email"),
                                        rs.getString("responsable"),
                                        rs.getString("tutor"));
                empresas.add(e);
                                        
            }
            
            stm.close();
        }catch(SQLException e){
            System.out.println("Error al obtener lista de empresas: "+e.getMessage());
            return null;
        }
        
        
        return empresas;
    }

    @Override
    public boolean delete(Empresa empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Empresa empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
