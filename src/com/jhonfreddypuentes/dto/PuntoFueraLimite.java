/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.dto;

/**
 *
 * @author Jhon
 */
public class PuntoFueraLimite {
        
    private int muestra;
    private Double dato;
    private String tipoGrafico;
    
    public PuntoFueraLimite(int muestra, Double dato,String tipoGrafico) {
        this.muestra = muestra;
        this.dato = dato;
        this.tipoGrafico=tipoGrafico;
    }

    public int getMuestra() {
        return muestra;
    }

    public void setMuestra(int muestra) {
        this.muestra = muestra;
    }

    public Double getDato() {
        return dato;
    }

    public void setDato(Double dato) {
        this.dato = dato;
    }

    public String getTipoGrafico() {
        return tipoGrafico;
    }

    public void setTipoGrafico(String tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }

    @Override
    public String toString() {
        return "PuntoFueraLimite : {" + "muestra:" + muestra + ", dato:" + dato +"}";
    }
    
}
