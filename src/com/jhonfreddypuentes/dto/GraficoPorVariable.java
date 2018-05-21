/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class GraficoPorVariable extends Grafico{
    
    private List<Double> datosSegundoGrafico;
    private Limite limiteSegundoGrafico;    
   
    public List<Double> getDatosSegundoGrafico() {
        return datosSegundoGrafico;
    }

    public void setDatosSegundoGrafico(List<Double> datosSegundoGrafico) {
        this.datosSegundoGrafico = datosSegundoGrafico;
    }

    public Limite getLimiteSegundoGrafico() {
        return limiteSegundoGrafico;
    }

    public void setLimiteSegundoGrafico(Limite limiteSegundoGrafico) {
        this.limiteSegundoGrafico = limiteSegundoGrafico;
    }
    
    public List<PuntoFueraLimite> getPuntosFueraLimiteSegundoGrafico(){
        List<PuntoFueraLimite> puntosFuera = new ArrayList<>();
        int contadorMuestra = 1;
        
        if(datosSegundoGrafico!=null && !datosSegundoGrafico.isEmpty()){
            if(this.limiteSegundoGrafico!=null && this.limiteSegundoGrafico.getLimiteInferior()!=null && this.limiteSegundoGrafico.getLimiteInferior()!=null){
                for (Double dato : datosSegundoGrafico) {
                    if (dato >= this.limiteSegundoGrafico.getLimiteSuperior() || dato <= this.limiteSegundoGrafico.getLimiteInferior()) {
                        puntosFuera.add(new PuntoFueraLimite(contadorMuestra, dato,null));
                    }
                    contadorMuestra++;
                }
            }
        }
        return puntosFuera; 
    }
    
}
