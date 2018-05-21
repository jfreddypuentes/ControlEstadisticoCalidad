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
public class Comando {
    
    private String parametros;
    private String rutaScript;
    private String comando;

    public Comando(String parametros, String rutaScript, String comando) {
        this.parametros = parametros;
        this.rutaScript = rutaScript;
        this.comando = comando;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getRutaScript() {
        return rutaScript;
    }

    public void setRutaScript(String rutaScript) {
        this.rutaScript = rutaScript;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
    
}
