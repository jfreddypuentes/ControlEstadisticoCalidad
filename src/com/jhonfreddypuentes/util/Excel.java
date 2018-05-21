/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.util;

import com.jhonfreddypuentes.constante.Constante;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Jhon
 */
public class Excel {
    
    /**
     * Obtener Workbook desde archivo.
     * 
     * @param archivo
     * @return 
     * @throws java.lang.Exception
     */
    public static Workbook getWorkbook(File archivo) throws Exception{
        Util.print("[INI] - getWorkbook");
        if(archivo==null){
            throw new Exception(Constante.ARCHIVO_NO_PUEDE_SER_NULO);
        }
        
        Workbook libroDeTrabajo     = null;
        String nombreArchivo        = archivo.getAbsolutePath();
        FileInputStream inputStream = new FileInputStream(archivo);
        
        if(nombreArchivo.endsWith(Constante.XLS)){
            libroDeTrabajo = new HSSFWorkbook(inputStream);
        }else if(nombreArchivo.endsWith(Constante.XLSX)){
            libroDeTrabajo = new XSSFWorkbook(inputStream);
        }else{
            throw new Exception(Constante.EXTENSION_DE_ARCHIVO_NO_VALIDA);
        }
        Util.print("[FIN] - getWorkbook");
        return libroDeTrabajo;
    }
    
    /**
     * Obtener Double desde objeto celda.
     * @param celda
     * @return 
     */    
    public static Double getDouble(Cell celda){
        if(celda==null){
            return (double) 0;
        }
        return celda.getNumericCellValue();
    }
    
    /**
     * Obtener matriz de datos desde libro de trabajo.
     * @param workbook
     * @return 
     */
    public static Double[][] getMatrix(Workbook workbook){
        Util.print("[INI] - getMatrix");
        Sheet sheet = workbook.getSheetAt(0);
        Double[][] value = null;
        XSSFRow row;
        XSSFCell cell;
       
        int rows  = sheet.getPhysicalNumberOfRows();
        int cells = sheet.getRow(1).getPhysicalNumberOfCells();
        value     = new Double[rows][cells];

        for (int r = 0; r < rows; r++) {
            row = (XSSFRow) sheet.getRow(r);
            if (row != null) {
                for (int c = 0; c < cells; c++) {
                    cell = row.getCell(c);

                    if (cell != null) {
                        Double dato = new Double("0");
                        CellType tipoCelda = cell.getCellTypeEnum();
                        
                        if(tipoCelda==CellType.STRING){
                            dato = Double.parseDouble(cell.getStringCellValue());
                        }
                        if(tipoCelda==CellType.NUMERIC){
                            dato = cell.getNumericCellValue();
                        }
                        value[r][c] = dato;
                    }
                }
            }
        }
        Util.print("[FIN] - getMatrix");
        return value;
    }

    /**
     * Validar los datos del libro de trabajo.
     * @param libroTrabajo
     * @param validarColumnasParaXMR
     * @return 
     */
    public static ArrayList<String> validarLibro(Workbook libroTrabajo,boolean validarColumnasParaXMR){
        Util.print("[INI] - validarLibro");
        ArrayList<String> lista = new ArrayList<>();
        if(libroTrabajo==null){
            lista.add(Constante.LIBRO_DE_TRABAJO_ES_NULO);
        }else{
            Sheet sheet = libroTrabajo.getSheetAt(0);
            XSSFRow row;
            XSSFCell cell;

            int filas    = sheet.getPhysicalNumberOfRows();
            int columnas = sheet.getRow(1).getPhysicalNumberOfCells();
                        
            if(validarColumnasParaXMR){
                if(columnas>1){
                    lista.add(Constante.VALIDACION_GRAFICA_XMR);
                    return lista;
                }
            }
            
            for(int r=0; r<filas; r++){
                row = (XSSFRow) sheet.getRow(r);
                if (row != null) {
                    for (int c = 0; c<columnas; c++) {
                        cell = row.getCell(c);

                        if (cell != null) {
                            CellType tipoCelda = cell.getCellTypeEnum();

                            try{
                                if(tipoCelda==CellType.STRING){
                                    Double.parseDouble(cell.getStringCellValue());
                                }
                                if(tipoCelda==CellType.NUMERIC){
                                    cell.getNumericCellValue();
                                }
                                
                            }catch(Exception e){
                                System.out.println("Exception:"+e.getMessage());
                                lista.add("El dato de la fila ["+r+"] y columna ["+c+"] no es valido.");
                            }
                        }else{
                            lista.add("La celda de la fila ["+r+"] y columna ["+c+"] es nula.");
                        }
                    }
                }
            }            
        }
        Util.print("[FIN] - validarLibro");
        return lista;
    }
        
}
