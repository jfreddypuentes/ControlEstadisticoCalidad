/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.constante;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class Constante {
    
    /**
     * ¿Debug?
     */
    public static final boolean DEBUG = true;
    
    /** Project */
    public static final String PROJECT_JAR_NAME = "ControlEstadisticoCalidad.jar";
    
    /** Mensajes de validación */
    public static final String DEBE_DIGITAR_SOLO_NUMEROS                   = "Debe digitar solo números.";
    public static final String VALIDANDO_CAMPOS                            = "Validando campos obligatorios.";
    public static final String FALTA_NUMERO_DE_DATOS_POR_COMPLETAR         = "Debe ingresar la cantidad de datos a generar.";
    public static final String FALTA_MEDIA_POR_COMPLETAR                   = "Debe ingresar la media.";
    public static final String FALTA_DESVIACION_ESTANDAR_POR_COMPLETAR     = "Debe ingresar la desviación estandar.";
    public static final String FALTA_LIMITE_CONTROL_INFERIOR_POR_COMPLETAR = "Debe ingresar el limite de control inferior.";
    public static final String FALTA_LIMITE_CONTROL_SUPERIOR_POR_COMPLETAR = "Debe ingresar el limite de control superior.";
    public static final String CALCULO_ARL_NO_EJECUTADO_DATOS_NULOS        = "Calculo de ARL no ejecutado. la lista de datos es nula.";
    public static final String CALCULO_ARL_NO_EJECUTADO_SIN_DATOS          = "Calculo de ARL no ejecutado. la lista de datos esta vacia.";
    public static final String CALCULO_ARL_EJECUTADO_CON_EXITO             = "Calculo de ARL ejecutado con exito.";
    public static final String LIMITE_INFERIOR_MAYOR_A_LIMITE_INFERIOR     = "El limite inferior no puede ser mayor al limite superior.";
    public static final String ERROR_AL_CONVERTIR_LOS_LIMITES              = "Error al validar los limites.";
    public static final String ERROR_COMANDO_NULL                          = "El comando a ejecutar es nulo.";
    public static final String ERROR_CARGUE_ARCHIVO                        = "Ocurrio un error al cargar el archivo. Verifique que el archivo no este dañado.";
    public static final String INFO_ESPERA                                 = "Ejecutando proceso...";
    public static final String EXTENSION_DE_ARCHIVO_NO_VALIDA              = "El archivo no tiene una extension valida.";
    public static final String ARCHIVO_NO_PUEDE_SER_NULO                   = "El archivo no puede ser nulo.";
    public static final String LIBRO_DE_TRABAJO_ES_NULO                    = "El libro de trabajo es nulo.";
    public static final String VALIDACION_GRAFICA_XMR                      = "Para este tipo de grafica solo debe haber una columna de datos.";
    public static final String VALIDACION_TAMANIO_MUESTRA                  = "Debe ingresar el tamaño de la muestra.";
    public static final String VALIDACION_MEDIA_CONOCIDA                   = "Para continuar, debe indicar la media del proceso o indicar que no es conocida.";
    public static final String VALIDACION_MEDIA_CONOCIDA_DATO              = "El valor de la media ingresada no es válido. Verifique que sea un número real válido.";
    public static final String ERROR_AL_ABRIR_MANUAL_PDF                   = "No fué posible abrir el manual de forma automática. \nDirijase a la ruta : ControlEstadistico\\home\\guide y abralo desde ahí.\nCompruebe que el computador tenga instalado un lector de archivos pdf.";
    public static final String CANTIDAD_DE_MUESTRAS                        = "Cantidad de muestras: *";
    public static final String MENSAJE_PUNTOS_FUERA_DE_LIMITES             = "Hay {} punto(s) más allá de límites. ¿Desea gestionarlo(s)?";
    public static final String TITLE_PUNTOS_FUERA                          = "Puntos Fuera";
    public static final String CONFIRMACION_ELIMINADOS                     = "¿Está seguro de eliminar {} punto(s) de los datos?";
    
    /** Parámetros */
    public static final String NUMERO_DE_DATOS_GENERAR = "numeroDatosGenerar";
    public static final String MEDIA                   = "media";
    public static final String DESVIACION_ESTANDAR     = "desviacionEstandar";
    public static final String LIMITE_CONTROL_INFERIOR = "limiteControlInferior";
    public static final String LIMITE_CONTROL_SUPERIOR = "limiteControlSuperior";
    
    /** Datos de resultados en generacion de numeros aleatorios */
    public static final String GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EJECUTADO       = "generacionDatosConDistribucionNormalEjecutado";
    public static final String MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL         = "mensajeGeneracionDatosConDistribucionNormal";
    public static final String MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EXITOSO = "mensajeGeneracionDatosConDistribucionNormalExitoso";
    
    /** Datos de resultados en calculo de ARL*/
    public static final String LISTA_DATOS_GENERADOS   = "listaDatosGenerados";
    public static final String CALCULO_ARL_EJECUTADO   = "calculoArlEejcutado";
    public static final String MEDIA_DATOS_EXTREMOS    = "mediaDatosExtremos";
    public static final String CANTIDAD_DATOS_EXTREMOS = "cantidadDatosExtremos";
    public static final String AVERAGE_RUN_LENGTH      = "arl";
    public static final String MENSAJE_CALCULO_ARL     = "mensajeCalculoArl";
    
    /** Tiempo de ejecucion de operaciones */
    public static final String TIEMPO_DE_EJECUCION = "tiempoDeEjecucion";
    
    /** Progreso */
    public static final String GENERANDO_NUMEROS_ALEATORIOS      = "Generando números aleatorios...";
    public static final String REALIZANDO_CALCULOS_DE_RESULTADOS = "Realizando calculos de resultados...";
    public static final String EN_PROGRESO                       = "En progreso...";
    public static final String TERMINADO                         = "TERMINADO";
        
    /** Extension archivos */
    public static final String XLS   = ".xls";
    public static final String XLSX  = ".xlsx";
    public static final String _XLSX = "xlsx";
    public static final String TXT   = ".txt";
    public static final String PDF   = ".pdf";
    public static final String MSI   = "msi";
    public static final String EXE   = "exe";
    
    /**
     * Tipos de graficos.
     */
    public static final String NO_APLICA= "NA";
    public static final String EQUIS    = "X";
    public static final String ERRE     = "R";
    public static final String ESE      = "S";
    public static final String EME_ERRE = "MR";
    
    public static final String PE     = "P";
    public static final String ENE_PE = "NP";
    public static final String SE     = "C";
    public static final String UU     = "U";
    
    
    
    /**
     * Datos de encabezado de archivo excel Hoja Uno.
     */
    public static final String TITULO_HOJA_DATOS      = "DATOS";
    public static final String INDICE                 = "INDICE";
    public static final String DATO_ALEATORIO         = "DATO ALEATORIO";
    public static final String SUPERA_LIMITE_INFERIOR = "¿SUPERA LIMITE INFERIROR?";
    public static final String SUPERA_LIMITE_SUPERIOR = "¿SUPERA LIMITE SUPERIOR?";
    
    /**
     * Datos de encabezado de archivo excel Hoja Dos.
     */
    public static final String TITULO_HOJA_RESULTADOS     = "RESULTADOS";
    public static final String COLUMNA_LIMITE_INFERIOR    = "LIMITE INFERIOR";
    public static final String COLUMNA_LIMITE_SUPERIOR    = "LIMITE SUPERIOR";
    public static final String COLUMNA_MEDIA              = "MEDIA";
    public static final String COLUMNA_DATOS_FUERA_LIMITE = "# DATOS FUERA DE LIMITE";
    public static final String COLUMNA_ARL                = "LONGITUD PROMEDIO CORRIDA (ARL)";
        
    /**
     * Mensajes de generacion de archivos.
     */
    public static final String GENERANDO_ARCHIVO_EXCEL_CON_RESULTADOS_ESPERE = "Generando reporte excel con resultados. Por favor espere.";
    public static final String ARCHIVO_EXCEL_CON_RESULTADOS_GENERADO = "Reporte excel con resultados generado con exito.";
    public static final String CADENA_CERO = "0";
    
    /** HOME. */
    public static final String HOME_NAME                      = "home";
    public static final String RUTA_PYTHON27                  = "/installers/python27/python ";
    public static final String SCRIPTS                        = "/scripts/";
    public static final String RUTA_MANUAL_USUARIO            = "/guide/manual.pdf";
   
    /** 
     * Utils. 
     */
    public static final String STR_EMPTY           = "";
    public static final String STR_SALTO_LINEA     = "\n";
    public static final String STR_COMMA_SEPARATOR = ",";
    public static final String STR_PUNTO           = ".";
    public static final String STR_BUILD_CLASES    = "/build/classes";
    
    /** Scripts python. */
    public static final String FILE_X_BAR_PY       = "xbar.py";
    public static final String FILE_X_BAR_S_PY     = "xbars.py";
    public static final String FILE_X_M_R_PY       = "xmr.py";
    public static final String FILE_P_PY           = "p.py";
    public static final String FILE_NP_PY          = "np.py";
    public static final String FILE_C_PY           = "c.py";
    public static final String FILE_U_PY           = "u.py";
    public static final String FILE_X_BAR_EXTENDIDO_PY = "xbar_extendido.py";
    
    /** 
     * Titulos ventanas. 
     */
    public static final String INGRESO_MANUAL = "Ingreso datos manual";
    public static final String X_BAR_R =  "Datos Para Grafica X-BAR R";
    public static final String X_BAR_S =  "Datos Para Grafica X-BAR S";
    public static final String X_M_R   =  "Datos Para Grafica X-MR";
    public static final String P       =  "Datos Para Grafica P";
    public static final String NP      =  "Datos Para Grafica NP";
    public static final String C       =  "Datos Para Grafica C";
    public static final String U       =  "Datos Para Grafica U";
    
    
    /**
     * Comandos python.
     */
    public static final String COMANDO_PYTHON     = "python ";
    
    /**
     * Numeros.
     */
    public static final String STR_CERO_CERO = "0.0000";
   
    /**
     * Constantes tabla.
     */   
    
    public static final Double D4 = 3.267;
    
    public static List<Double> LISTA_A2 = Arrays.asList(
            0.0,  //0
            0.0,  //1
            1.880,//2
            1.023,//3
            0.729,//4
            0.577,//5
            
            0.483,//6
            0.419,//7
            0.373,//8
            0.337,//9
            0.308,//10
            
            0.285,//11
            0.266,//12
            0.249,//13
            0.235,//14
            0.223,//15
            
            0.212,//16
            0.203,//17
            0.194,//18
            0.187,//19
            0.180,//20
            
            0.173,//21
            0.167,//22
            0.162,//23
            0.157,//24
            0.153);//25  
    
    public static List<Double> LISTA_D4 = Arrays.asList(
            0.0,  //0
            0.0,  //1
            3.267,//2
            2.575,//3
            2.282,//4
            2.114,//5
            
            2.004,//6
            1.924,//7
            1.864,//8
            1.816,//9
            1.777,//10
            
            1.744,//11
            1.717,//12
            1.693,//13
            1.672,//14
            1.653,//15
            
            1.637,//16
            1.622,//17
            1.609,//18
            1.596,//19
            1.585,//20
            
            1.575,//21
            1.565,//22
            1.557,//23
            1.548,//24
            1.541);//25
    
    public static List<Double> LISTA_D3 = Arrays.asList(
            0.0,   //0
            0.0,   //1
            0.0,   //2
            0.0,   //3
            0.0,   //4
            0.0,   //5
            
            0.0,   //6
            0.076, //7
            0.136, //8
            0.184, //9
            0.223, //10
            
            0.256, //11
            0.283, //12
            0.307, //13
            0.328, //14
            0.347, //15
            
            0.363, //16
            0.378, //17
            0.391, //18
            0.404, //19
            0.415, //20
            
            0.425, //21
            0.435, //22
            0.443, //23
            0.452, //24
            0.459);//25
    
    public static List<Double> LISTA_B3 = Arrays.asList(
            0.0,   //0
            0.0,   //1
            0.0,   //2
            0.0,   //3
            0.0,   //4
            0.0,   //5
            
            0.030, //6
            0.118, //7
            0.185, //8
            0.239, //9
            0.284, //10
            
            0.321, //11
            0.354, //12
            0.382, //13
            0.406, //14
            0.428, //15
            
            0.448, //16
            0.466, //17
            0.482, //18
            0.497, //19
            0.510, //20
            
            0.523, //21
            0.534, //22
            0.545, //23
            0.555, //24
            0.565);//25
    
    public static List<Double> LISTA_B4 = Arrays.asList(
            0.0,   //0
            0.0,   //1
            3.267, //2
            2.568, //3
            2.266, //4
            2.089, //5
            
            1.970, //6
            1.882, //7
            1.815, //8
            1.761, //9
            1.716, //10
            
            1.679, //11
            1.646, //12
            1.618, //13
            1.594, //14
            1.572, //15
            
            1.552, //16
            1.534, //17
            1.518, //18
            1.503, //19
            1.490, //20
            
            1.477, //21
            1.466, //22
            1.455, //23
            1.445, //24
            1.435);//25
    
    public static List<Double> LISTA_A3 = Arrays.asList(
            0.0,   //0
            0.0,   //1
            2.659, //2
            1.954, //3
            1.628, //4
            1.427, //5
            
            1.287, //6
            1.182, //7
            1.099, //8
            1.032, //9
            0.975, //10
            
            0.927, //11
            0.886, //12
            0.850, //13
            0.817, //14
            0.789, //15
            
            0.763, //16
            0.739, //17
            0.718, //18
            0.698, //19
            0.680, //20
            
            0.663, //21
            0.647, //22
            0.633, //23
            0.619, //24
            0.606);//25
      
}
