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
public class Horario {
    private String horas[][];

    public Horario() {
        this.horas = new String[5][6];
    }
    
    public void setMateria(int dia,int hora, String materia){
        this.horas[dia][hora] = materia;
    }
    
    public String getMateria(int dia, int hora){
        return this.horas[dia][hora];
    }
    
    
}
