/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manue
 */
public class Centro {
    private String cif;
    private String nombre;
    private String direccion;
    private String localidad;
    private String cp;
    private String provincia;
    private String telefono;
    private String fax;
    private String responsable;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Centro(String cif, String nombre, String direccion, String localidad, String cp, String provincia, String telefono, String fax, String responsable, List<Profesor> profesores, List<Curso> cursos) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.cp = cp;
        this.provincia = provincia;
        this.telefono = telefono;
        this.fax = fax;
        this.responsable = responsable;
        this.profesores = new ArrayList<Profesor>();
        this.profesores.addAll(profesores);
        this.cursos = new ArrayList<Curso>();
        this.cursos.addAll(cursos);
    }

    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the responsable
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    public void addProfesor(Profesor p){
        this.profesores.add(p);
    }
    
    public void removeProfesor(Profesor p){
        this.profesores.remove(p);
    }
    
    public void addCurso(Curso c){
        this.cursos.add(c);
    }
    
    public void removeCurso(Curso c){
        this.cursos.remove(c);
    }
    
}
