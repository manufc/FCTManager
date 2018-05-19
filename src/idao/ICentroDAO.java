/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.util.List;
import model.Centro;

/**
 *
 * @author manue
 */
public interface ICentroDAO {
    public boolean add(Centro centro);
    public boolean update(Centro centro);
    public boolean delete(Centro centro);
    
    public List<Centro> getCentros();
}
