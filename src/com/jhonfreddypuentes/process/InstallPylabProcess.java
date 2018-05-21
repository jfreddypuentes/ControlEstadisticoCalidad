/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.process;

import com.jhonfreddypuentes.cmd.Cmd;
import javax.swing.SwingWorker;

/**
 *
 * @author Jhon
 */
public class InstallPylabProcess extends  SwingWorker<Void, Void>{

    
    public InstallPylabProcess(){
    }
    
    @Override
    protected Void doInBackground() throws Exception {

        /** Ejecutar comando */
        Cmd.ejecutarComando("pip install numpy");

        return null;
    }

    @Override
    public void done(){
        System.out.println("Proceso terminado");
    }
    
}
