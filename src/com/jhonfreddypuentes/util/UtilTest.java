/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class UtilTest {
    
    public static void main(String args[]){
        
        List<Double> data = new ArrayList<>();
        data.add((double)2);
        data.add((double)3);
        data.add((double)4);
        data.add((double)6);
        data.add((double)7);
        
        List<Double> mediasPorFila = Util.calcularRangosMoviles(data);
        
        for(Double d:mediasPorFila){
            System.out.println("a"+d);
        }
        
        Double media = Util.calcularMedia(mediasPorFila);
        System.out.println("MEdia de MR : "+media);
        
    }
    
}
