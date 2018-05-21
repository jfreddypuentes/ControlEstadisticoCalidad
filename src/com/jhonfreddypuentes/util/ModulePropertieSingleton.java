/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.util;

import com.jhonfreddypuentes.constante.Constante;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Jhon
 */
public class ModulePropertieSingleton {
    private static ModulePropertieSingleton propertie;
    private static Properties modules;
    private static InputStream inputStream = null;
    
    private ModulePropertieSingleton(){}
    
    public static ModulePropertieSingleton getInstance(){
        if(propertie==null){
            propertie = new ModulePropertieSingleton();
            try{
                inputStream = new FileInputStream(Util.getHome()+Constante.RUTA_CONFIG_MODULES_PROPERTIES);
                modules = new Properties();
                modules.load(inputStream);
            }catch(Exception e){
            }
        }
        return propertie;
    }

    public Properties getProperties() {
        return modules;
    }
}
