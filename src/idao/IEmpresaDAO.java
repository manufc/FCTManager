/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.util.List;
import model.Empresa;

/**
 *
 * @author manuel
 */
public interface IEmpresaDAO {
    public boolean add(Empresa empresa);
    public boolean update(Empresa empresa);
    public boolean delete(Empresa empresa);
    
    public List<Empresa> getEmpresas();
}
