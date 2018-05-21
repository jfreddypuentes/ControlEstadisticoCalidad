/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.dto;

import com.jhonfreddypuentes.constante.TipoGraficaEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class Grafico {
    
    protected List<Double> datos;
    protected Double[][] data;
    protected Limite limite;
    protected TipoGraficaEnum tipoGrafico;
    protected Comando comando;
    protected int tamanioMuestra;
    protected List<Double> rangosPorFila;
    protected List<Double> desviacionPorFila;
    protected List<Double> rangosMoviles;
    
    public TipoGraficaEnum getTipoGrafico() {
        return tipoGrafico;
    }

    public void setTipoGrafico(TipoGraficaEnum tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }

    public Comando getComando() {
        return comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public List<Double> getDatos() {
        return datos;
    }

    public void setDatos(List<Double> datos) {
        this.datos = datos;
    }

    public Limite getLimite() {
        return limite;
    }

    public void setLimite(Limite limite) {
        this.limite = limite;
    }
        
    public List<PuntoFueraLimite> getPuntosFueraLimite(){
        List<PuntoFueraLimite> puntosFuera = new ArrayList<>();
        int contadorMuestra = 1;
        
        if(datos!=null && !datos.isEmpty()){
            if(this.limite!=null && this.limite.getLimiteInferior()!=null && this.limite.getLimiteInferior()!=null){
                for (Double dato : datos) {
                  System.out.println(dato+">="+this.limite.getLimiteSuperior()+" || "+dato+" <= "+this.limite.getLimiteInferior()+" : "+(dato >= this.limite.getLimiteSuperior() || dato <= this.limite.getLimiteInferior()));
                    if (dato >= this.limite.getLimiteSuperior() || dato <= this.limite.getLimiteInferior()) {
                        puntosFuera.add(new PuntoFueraLimite(contadorMuestra, dato,null));
                    }
                    contadorMuestra++;
                }
            }
        }
        return puntosFuera; 
    }

    public int getTamanioMuestra() {
        return tamanioMuestra;
    }

    public void setTamanioMuestra(int tamanioMuestra) {
        this.tamanioMuestra = tamanioMuestra;
    }

    public Double[][] getData() {
        return data;
    }

    public void setData(Double[][] data) {
        this.data = data;
    }

    public List<Double> getRangosPorFila() {
        return rangosPorFila;
    }

    public void setRangosPorFila(List<Double> rangosPorFila) {
        this.rangosPorFila = rangosPorFila;
    }

    public List<Double> getDesviacionPorFila() {
        return desviacionPorFila;
    }

    public void setDesviacionPorFila(List<Double> desviacionPorFila) {
        this.desviacionPorFila = desviacionPorFila;
    }

    public List<Double> getRangosMoviles() {
        return rangosMoviles;
    }

    public void setRangosMoviles(List<Double> rangosMoviles) {
        this.rangosMoviles = rangosMoviles;
    }
    
}
