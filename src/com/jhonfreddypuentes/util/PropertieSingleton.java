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
public class PropertieSingleton {
    
    private static PropertieSingleton propertie;
    private static Properties properties;
    private static InputStream inputStream = null;
    
    private PropertieSingleton(){}
    
    public static PropertieSingleton getInstance(){
        if(propertie==null){
            propertie = new PropertieSingleton();
            try{
                inputStream = new FileInputStream(Util.getHome()+Constante.RUTA_CONFIG_CONFIG_PROPERTIES);
                properties = new Properties();
                properties.load(inputStream);
            }catch(Exception e){
                
            }
        }
        return propertie;
    }

    public Properties getProperties() {
        return properties;
    }
    
}
