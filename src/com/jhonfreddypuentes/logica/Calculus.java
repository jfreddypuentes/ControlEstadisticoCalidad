/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.logica;

import java.util.Random;

/**
 *
 * @author Jhon
 */
public class Calculus {
 
    /**
     * Generar numeros aleatorios que estan dentro de un campana de gauus.
     * @param s
     * @param m
     * @return 
     */
    public static double generateRamdomNumber(int s, int m){
        return new Random().nextGaussian()*s+m;
    }
    
    /**
     * Calcular el ARL segun la cantidad de datos  segun los datos que salen de los limites.
     * @param cantidadDatos
     * @param cantidadSobrepasoLimite
     * @return 
     */
    public static double computeARL(int cantidadDatos,int cantidadSobrepasoLimite){
        if(cantidadDatos==0 || cantidadSobrepasoLimite==0){
            return 0;
        }else{
            return cantidadDatos/cantidadSobrepasoLimite;
        }
    }
    
}