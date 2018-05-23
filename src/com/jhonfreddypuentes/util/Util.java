/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.util;

import com.jhonfreddypuentes.constante.Constante;
import com.jhonfreddypuentes.dto.PuntoFueraLimite;
import com.jhonfreddypuentes.vista.VentanaPrincipal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jhon
 */
public class Util {
    
    /**
     * Verificar si un dato tipo String es nulo o vacio.
     * @param dato
     * @return boolean.
     */
    public static boolean esNuloOVacio(String dato){
        if(dato==null){
            return true;
        }else {
            return dato.isEmpty();
        }
    }
    
    /**
     * Retorna la ruta principal o raiz donde se esta ejecutando la aplicacion.
     * @return 
     */
    public static String getHome(){
        URL location = VentanaPrincipal.class.getProtectionDomain().getCodeSource().getLocation();
        String rutaCompleta = location.getFile();
        return rutaCompleta.replace(Constante.PROJECT_JAR_NAME, Constante.STR_EMPTY).substring(1)+Constante.HOME_NAME;
    }
    
    private static StringBuilder getProgramaSumaDosNumerosPython(boolean importPip){
        StringBuilder programa = new StringBuilder();
        programa.append(Constante.COMANDO_IMPORT_SYS);
        if(importPip){
            programa.append(Constante.COMANDO_IMPORT_PIP);
        }
        programa.append(Constante.COMANDO_PRINT_INT);
        return programa;
    }
    
    public static List<Double> calcularMediasAritmeticasPorFila(Double[][] data){
        Util.print("[INI] - calcularMediasAritmeticasPorFila");
        List<Double> listaDeMedias = new ArrayList<>();
        double sumatoria = 0;
        
        for (Double[] fila : data) {
            for (Double dato : fila) {
                sumatoria = sumatoria + dato;
            }
            listaDeMedias.add(sumatoria/fila.length);
            sumatoria=0;
        }
        Util.print("[FIN] - calcularMediasAritmeticasPorFila");
        return listaDeMedias;
    }
    
    public static List<Double> calcularMediasAritmeticasPorFila(Double[][] data,boolean restarMenosUno){
        Util.print("[INI] - calcularMediasAritmeticasPorFila");
        List<Double> listaDeMedias = new ArrayList<>();
        double sumatoria = 0;
        int contador = 0;
        
        for (Double[] fila : data) {
            for(int i=0;i<fila.length;i++){
                System.out.println("fila["+i+"]:"+fila[i]);
                sumatoria = sumatoria + fila[i];
                System.out.println("sumatoria:"+sumatoria);
                contador++;
            }
            /*
            for (Double dato : fila) {
                sumatoria = sumatoria + dato;
            }*/
            //listaDeMedias.add(sumatoria/fila.length);
            System.out.println("sumatoria/contador : "+sumatoria/contador);
            listaDeMedias.add(sumatoria/contador);
            sumatoria=0;
        }
        Util.print("[FIN] - calcularMediasAritmeticasPorFila");
        return listaDeMedias;
    }
    
    public static List<Double> calcularRangosPorFila(Double[][] data){
        Util.print("[INI] - calcularRangosPorFila");
        List<Double> listaDeRangos = new ArrayList<>();
        double rango = 0;
        
        for (Double[] fila : data) {
            rango = obtenerRango(fila);
            listaDeRangos.add(rango);
        }
        Util.print("[FIN] - calcularRangosPorFila");
        return listaDeRangos;
    }
    
    public static List<Double> calcularDesviacionEstandarPorFila(Double[][] data,List<Double> mediasPorFila){
        Util.print("[INI] - calcularDesviacionEstandarPorFila");
        
        List<Double> listaDeDesviacion = new ArrayList<>();
        double desviacion   = 0;
        int contadorMuestra = 0;
        
        for (Double[] muestra : data) {
            desviacion = obtenerDesviacion(muestra,mediasPorFila.get(contadorMuestra));
            listaDeDesviacion.add(desviacion);
            contadorMuestra++;
        }
        
        Util.print("[FIN] - calcularDesviacionEstandarPorFila");
        return listaDeDesviacion;        
    }
    
    public static Double obtenerDesviacion(Double[] fila,Double media){
        Util.print("[INI] - obtenerDesviacion");
        
        int n = fila.length-1;
        Double desviacion = 0.0;
        /*     
        for(Double x:fila){
            desviacion = desviacion + Math.sqrt(((Math.pow(x-media, 2))/(n)));
        }
        */
        for(Double x:fila){
            desviacion = desviacion + (Math.pow(x-media, 2)/(n));
        }
        
        desviacion = Math.sqrt(desviacion);
        
        Util.print("[FIN] - obtenerDesviacion");
        return desviacion;
    }
    
    public static Double obtenerRango(Double[] datos){
        Util.print("[INI] - obtenerRango");
        Double rango = (double)0;
        Double mayor = (double)0;
        Double menor = (double)0;
        
        for(Double dato : datos){
            if(dato>mayor){
                mayor=dato;
            }
        }
        
        menor = mayor;
        
        for(Double dato : datos){
            if(dato<menor){
                menor=dato;
            }
        }
        
        Util.print("mayor:"+mayor+" menor: "+menor);
        
        rango = mayor - menor;
        Util.print("Rango : "+rango);
        Util.print("[FIN] - obtenerRango");
        return rango;
    }
    
    public static double obtenerMediaDeMedias(List<Double> mediasPorFila){
        Util.print("[INI] - obtenerMediaDeMedias");
        int tamanio = mediasPorFila.size();
        double sumatoria = 0;
        
        for(Double media:mediasPorFila){
            sumatoria = sumatoria+media;
        }
        Util.print("[FIN] - obtenerMediaDeMedias");
        return sumatoria/tamanio;
    }
    
     public static double obtenerMediaDeRangos(List<Double> rangosPorFila){
        Util.print("[INI] - obtenerMediaDeRangos");
        
        int tamanio      = rangosPorFila.size();
        double sumatoria = 0;
        
        for(Double media:rangosPorFila){
            sumatoria = sumatoria+media;
        }
        
        Util.print("[FIN] - obtenerMediaDeRangos");
        return sumatoria/tamanio;
    }
    
    public static double obtenerMediaDeDesviaciones(List<Double> desviacionesPorFila){
        Util.print("[INI] - obtenerMediaDeDesviaciones");
        
        int tamanio      = desviacionesPorFila.size();
        double sumatoria = 0;
        
        for(Double desviacion:desviacionesPorFila){
            sumatoria = sumatoria+desviacion;
        }
        
        Util.print("[FIN] - obtenerMediaDeDesviaciones");
        return sumatoria/tamanio;
    }
     
    public static void print(String mensaje){
        System.out.println("INFORMACION : ["+mensaje+"]");
    }
        
    public static String matrizACSV(Double[][] data){
        Util.print("[INI - matrizACSV");
        
        StringBuilder csvBuilder = new StringBuilder();
        String csvFinal          = null;
        String coma              = Constante.STR_COMMA_SEPARATOR;
        
        for (Double[] fila : data) {
            for (Double dato : fila) {
                csvBuilder.append(dato);
                csvBuilder.append(coma);
            }
        }
        
        csvFinal = csvBuilder.toString();
        
        //Remover la ultima coma.
        csvFinal = csvBuilder.substring(0, csvBuilder.length() - coma.length());
        
        Util.print("[FIN - matrizACSV");
        
        return csvFinal;
    }
    
    public static String obtenerDatosCsvDesdeLista(List<Double> medias){
        Util.print("[INI - obtenerDatosCsvDesdeLista");
        
        StringBuilder csvData = new StringBuilder();
        String coma           = Constante.STR_COMMA_SEPARATOR;
        String csvFinal       = null;
        
        for (Double dato : medias) {
            csvData.append(dato);
            csvData.append(coma);
        }
        
        csvFinal = csvData.toString();
        
        csvFinal = csvData.substring(0, csvData.length() - coma.length());
        
        Util.print("[FIN - obtenerDatosCsvDesdeLista");
        
        return csvFinal;
    }
    
    public static String obtenerDatosCsvDesdeLista(List<Double> medias,int n){
        Util.print("[INI - obtenerDatosCsvDesdeLista");
        
        StringBuilder csvData = new StringBuilder();
        String coma           = Constante.STR_COMMA_SEPARATOR;
        String csvFinal       = null;
        
        for (Double dato : medias) {
            csvData.append(dato/n);
            csvData.append(coma);
        }
        
        csvFinal = csvData.toString();
        
        csvFinal = csvData.substring(0, csvData.length() - coma.length());
        
        Util.print("[FIN - obtenerDatosCsvDesdeLista");
        
        return csvFinal;
    }
    
    public static Double[][] obtenerDatosDesdeTabla (JTable table) throws Exception {
        Util.print("[INI - obtenerDatosDesdeTabla");
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        int cantidadDatos = modelo.getRowCount(), tamanioMuestra = modelo.getColumnCount();
        Double[][] tableData = new Double[cantidadDatos][tamanioMuestra];
        
        for (int fila = 0 ; fila < cantidadDatos ; fila++){
            for (int columna = 0 ; columna < tamanioMuestra; columna++){
                try{
                    String dato = modelo.getValueAt(fila,columna).toString().trim();
                    dato = (dato!=null && !dato.isEmpty())?dato.replace(",","."):dato;
                    tableData[fila][columna] = Double.parseDouble(modelo.getValueAt(fila,columna).toString());
                }catch(Exception e){
                    throw new Exception("Error en la celda ["+(fila+1)+","+(columna+1)+"]");
                }
            }
        }
        Util.print("[FIN - obtenerDatosDesdeTabla");
        return tableData;
    }
    
    public static File examinarArchivo(String extension){
        JFileChooser fileChooser       = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension+" files",extension);
        fileChooser.setFileFilter(filter);
        
        int seleccion = fileChooser.showOpenDialog(null);
        File archivo  = null;
                
        if (seleccion == JFileChooser.APPROVE_OPTION){
            archivo =  fileChooser.getSelectedFile();
        }
        return archivo;
    }
       
    public static List<Double> calcularRangosMoviles(List<Double> listaDatos){
        List<Double> rangosMoviles = new ArrayList<>();
        int tamanio = listaDatos.size();
        
        rangosMoviles.add(0.0);
        
        for(int i=0;i<listaDatos.size();i++){
            if(i+1==tamanio){
                break;
            }
            Double rango = Math.abs(listaDatos.get(i+1)-listaDatos.get(i));
            rangosMoviles.add(rango);
        }
        
        return rangosMoviles;
    }
    
    public static Double calcularMedia(List<Double> valores){

        Double media = (double)0;
        
        for(Double dato:valores){
            media = media+dato;
        }
        
        if(valores!=null && valores.size()>0){
            return media/valores.size();
        }
        
        return (double)0;
    }
    
    public static Double sumarElementos(List<Double> datos){
        Double sumatoria = (double)0;
        for(Double dato:datos){
            sumatoria+=dato;
        }
        return sumatoria;
    }
    
    
    public static List<Double> getDataUnicaColumna(Double data[][]){
        List<Double> datos = new ArrayList<>();
        for (Double[] fila : data) {
            datos.add(fila[0]);
        }
        return datos;
    }
    
    public static List<Double> getDisconformidadesPorUnidad(List<Double> disconformidades,int tamanioMuestra){
        List<Double> disconformidadesPorUnidad = new ArrayList<>();
        for(Double disconformidad: disconformidades){
            System.out.println("disconformidad/tamanioMuestra => ["+disconformidad/tamanioMuestra+"]");
            disconformidadesPorUnidad.add(disconformidad/tamanioMuestra);
//            int n = disconformidadesPorUnidad.size();
//            if(n==tamanioMuestra){
//                break;
//            }
        }
        return disconformidadesPorUnidad;
    }
    
    public static List<PuntoFueraLimite> obtenerPuntosFueraDeLimite(List<Double> data,Double limiteInferior,Double limiteSuperior){
        Util.print("[INI] - obtenerPuntosFueraDeLimite");
        
        List<PuntoFueraLimite> puntosFuera = new ArrayList<>();
        int contadorMuestra = 1;
        
        for (Double dato : data) {
            if (dato >= limiteSuperior || dato <= limiteInferior) {
                puntosFuera.add(new PuntoFueraLimite(contadorMuestra, dato,null));
            }
            contadorMuestra++;
        }
                
        Util.print("[FIN - obtenerPuntosFueraDeLimite");
        return puntosFuera;                
    }
    
    public static void imprimirPuntosFuera(List<PuntoFueraLimite> puntos){
        Util.print("[INI] - imprimirPuntosFuera");
        if(puntos!=null && !puntos.isEmpty()){
            for(PuntoFueraLimite punto : puntos){
                Util.print(punto.toString());
            }
        }
        Util.print("[FIN] - imprimirPuntosFuera");
    }
    
    public static List<Double> obtenerListaDoubleDesdeCsv(String data){
        String datos[] = data.split(Constante.STR_COMMA_SEPARATOR);
        List<Double> dataDouble = new ArrayList<>();
        for(String dato : datos){
            dataDouble.add(new Double(dato));
        }
        return dataDouble;
    }
    
    public static double[][] removerMuestra(double data[][],int ren){
        int rengre=ren;//row to remove
        double mat2[][]= new double [data.length-1][data[0].length];
        int p=0;
        for( int i = 0; i <data.length; ++i){
            if ( i == rengre)
                continue;
            int q = 0;
            for( int j = 0; j <data[0].length; ++j){
                mat2[p][q] = data[i][j];
                ++q;
            }
            ++p;
        }
        return mat2;
    }
    
}
