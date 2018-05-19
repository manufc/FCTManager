/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.Empresa;
import idao.IEmpresaDAO;

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
        String sql = "INSERT INTO Empresa values ('"+empresa.getCif()+"'"+
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
