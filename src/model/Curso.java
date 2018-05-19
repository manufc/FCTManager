/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author manue
 */
public class Curso {
    private int id;
    private String nombre;
    private int etapa;
    private int year;

    public Curso(int id, String nombre, int etapa, int year) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.year = year;
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
    
    
}
