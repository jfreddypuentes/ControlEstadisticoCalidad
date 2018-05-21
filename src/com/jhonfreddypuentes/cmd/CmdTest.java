/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.cmd;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon
 */
public class CmdTest {
    
    public static void main(String args[]){
        
        try {
//            if(Cmd.ejecutarComando("ping google.com")){
//                System.out.println("OK");
//            }
            
            String instalarPython = "msiexec /a \""+System.getProperty("user.dir")+"\\instaladores\\pyhon-2.7.13.msi\""; 
            
            Cmd.ejecutarComando(instalarPython);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
