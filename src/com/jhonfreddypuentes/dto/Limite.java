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
public class Limite {
    
    private Double limiteInferior;
    private Double limiteSuperior;
    private Double lineaCentral;

    public Limite(Double limiteInferior, Double limiteSuperior, Double lineaCentral) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.lineaCentral = lineaCentral;
    }

    public Double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(Double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(Double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public Double getLineaCentral() {
        return lineaCentral;
    }

    public void setLineaCentral(Double lineaCentral) {
        this.lineaCentral = lineaCentral;
    }

}
