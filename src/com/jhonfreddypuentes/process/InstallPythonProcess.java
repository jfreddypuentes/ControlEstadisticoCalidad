/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.process;

import com.jhonfreddypuentes.cmd.Cmd;
import com.jhonfreddypuentes.constante.Constante;
import com.jhonfreddypuentes.util.PropertieSingleton;
import com.jhonfreddypuentes.util.Util;
import java.util.Properties;
import javax.swing.SwingWorker;

/**
 *
 * @author Jhon
 */
public class InstallPythonProcess extends  SwingWorker<Void, Void>{

    Properties propiedades;
    
    public InstallPythonProcess(){
        /** Cargar propiedades */
        propiedades = PropertieSingleton.getInstance().getProperties();
    }
    
    @Override
    protected Void doInBackground() throws Exception {

        /** Obtener y construir rutas */
        String installer_folder = (String)propiedades.get(Constante.KEY_PYTHON_INSTALLER_FOLDER);
        String installer_msi    = (String)propiedades.get(Constante.KEY_PYTHON_INSTALLER_MSI);
        String extension        = (String)propiedades.get(Constante.KEY_PYTHON_INSTALLER_EXT);
        String rutaInstalador   = Util.getHome()+Constante.RUTA_PYTHON_INSTALLER+"/"+installer_folder+"/"+installer_msi;

        /** Crear comando */
        String comandoInstalaPython = null;
        switch (extension) {
            case Constante.MSI:
                comandoInstalaPython = "msiexec /a \""+rutaInstalador.replace("/", "\\")+"\"";
                break;      
            case Constante.EXE:
                comandoInstalaPython = "cmd /k \""+rutaInstalador.replace("/", "\\")+"\"";
                break;
        }

        /** Ejecutar comando */
        Cmd.ejecutarComando(comandoInstalaPython);

        return null;
    }

    @Override
    public void done(){
        System.out.println("Proceso terminado");
    }
    
}
