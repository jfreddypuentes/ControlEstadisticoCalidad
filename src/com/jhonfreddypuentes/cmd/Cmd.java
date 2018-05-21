/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.cmd;

import com.jhonfreddypuentes.constante.Constante;
import com.jhonfreddypuentes.util.Util;
import java.io.IOException;

/**
 *
 * @author Jhon
 */
public class Cmd {
    
    //TODO: USAR ESTE METODO PARA INSTALAS MODULES A TARVES DE PIP
    public static void ejecutarComando(String comando) throws Exception{
        Util.print("INI - ejecutarComando");
        if(comando!=null){
            Util.print("COMANDO : "+comando);
            try{
                Util.print("Ejecutando comando...");
                Runtime runTime = Runtime.getRuntime();
                /** Ejecutar como administrador */
                runTime.exec("cmd /c SetSuspendState");
                Process p = runTime.exec(comando);
                p.waitFor();
                
            }catch(IOException ioException){
                throw ioException;
            }catch(InterruptedException interruptedException){
                throw interruptedException;
            }
        }else{
            throw new Exception(Constante.ERROR_COMANDO_NULL);
        }
        Util.print("FIN - ejecutarComando");
    }
   
    public void ejecutarComandoSinEspera(String comando) throws Exception{
        Util.print("INI - ejecutarComando");
        if(comando!=null){
            Util.print("COMANDO : "+comando);
            try{
                Util.print("Ejecutando comando... \n");
                Util.print(comando);
                Util.print("\n");
                Runtime runTime = Runtime.getRuntime();
                /** Ejecutar como administrador */
                runTime.exec("cmd /c SetSuspendState");
                Process p = runTime.exec(comando);
                                
            }catch(IOException ioException){
                throw ioException;
            }
        }else{
            throw new Exception(Constante.ERROR_COMANDO_NULL);
        }
        Util.print("FIN - ejecutarComando");
    }
    
}
