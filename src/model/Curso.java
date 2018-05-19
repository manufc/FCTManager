/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manue
 */
public class Curso {
    private int id;
    private String nombre;
    private int etapa;
    private int year;
    private List<Alumno> alumnos;

    public Curso(int id, String nombre, int etapa, int year, List<Alumno> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.year = year;
        this.alumnos = new ArrayList<Alumno>();
        this.alumnos.addAll(alumnos);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the etapa
     */
    public int getEtapa() {
        return etapa;
    }

    /**
     * @param etapa the etapa to set
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    public void addAlumno(Alumno a){
        this.getAlumnos().add(a);
    }
    
    public void removeAlumno(Alumno a){
        this.getAlumnos().remove(a);
    }

    /**
     * @return the alumnos
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
            
    
    
}
