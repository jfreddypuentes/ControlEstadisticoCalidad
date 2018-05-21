/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.dto;

import java.util.List;


/**
 *
 * @author Jhon
 */
public class GraficoPorAtributo extends Grafico{
    //Toda la implementacion se hereda.
    private List<Double> datosEntrada;

    public List<Double> getDatosEntrada() {
        return datosEntrada;
    }

    public void setDatosEntrada(List<Double> datosEntrada) {
        this.datosEntrada = datosEntrada;
    }
}
