/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.vista;

import com.jhonfreddypuentes.constante.Constante;
import com.jhonfreddypuentes.constante.TipoGraficaEnum;
import com.jhonfreddypuentes.process.InstallPylabProcess;
import com.jhonfreddypuentes.process.InstallPythonProcess;
import com.jhonfreddypuentes.util.DataTransito;
import com.jhonfreddypuentes.util.Util;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //Properties propiedades;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuGraficosPorVariables = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_xbarr = new javax.swing.JMenuItem();
        jMenuItem_xbars = new javax.swing.JMenuItem();
        jMenuItem_xmr = new javax.swing.JMenuItem();
        jMenuGraficosPorAtributos = new javax.swing.JMenu();
        jMenuItemGraficoP = new javax.swing.JMenuItem();
        jMenuItemGraficoNP = new javax.swing.JMenuItem();
        jMenuItemGraficoC = new javax.swing.JMenuItem();
        jMenuItemGraficoU = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_installPython = new javax.swing.JMenuItem();
        jMenuItem_checkPython = new javax.swing.JMenuItem();
        jMenuItem_checkPIP = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Estadístico");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gráficos de Control");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Esta aplicación ofrece como funcionalidad las siguientes:");

        jLabel3.setText("1) Realizar una simulación de un proceso de control estadistico de calidad.");

        jLabel4.setText("2) Generar graficos de control de calidad.");

        jMenu1.setText("Simulador C.E.C.");

        jMenuItem1.setText("Simulación");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuGraficosPorVariables.setText("Gráficos");

        jMenu6.setText("Gráficos por variables");

        jMenuItem_xbarr.setText("XBar - R");
        jMenuItem_xbarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_xbarrActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_xbarr);

        jMenuItem_xbars.setText("XBar - S");
        jMenuItem_xbars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_xbarsActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_xbars);

        jMenuItem_xmr.setText("X - MR");
        jMenuItem_xmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_xmrActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_xmr);

        jMenuGraficosPorVariables.add(jMenu6);

        jMenuGraficosPorAtributos.setText("Gráficos por atributos");

        jMenuItemGraficoP.setText("Gráfico p");
        jMenuItemGraficoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGraficoPActionPerformed(evt);
            }
        });
        jMenuGraficosPorAtributos.add(jMenuItemGraficoP);

        jMenuItemGraficoNP.setText("Gráfico np");
        jMenuItemGraficoNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGraficoNPActionPerformed(evt);
            }
        });
        jMenuGraficosPorAtributos.add(jMenuItemGraficoNP);

        jMenuItemGraficoC.setText("Gráfico c");
        jMenuItemGraficoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGraficoCActionPerformed(evt);
            }
        });
        jMenuGraficosPorAtributos.add(jMenuItemGraficoC);

        jMenuItemGraficoU.setText("Gráfico u");
        jMenuItemGraficoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGraficoUActionPerformed(evt);
            }
        });
        jMenuGraficosPorAtributos.add(jMenuItemGraficoU);

        jMenuGraficosPorVariables.add(jMenuGraficosPorAtributos);

        jMenuBar1.add(jMenuGraficosPorVariables);

        jMenu2.setText("Manual");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Ver Manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pruebas");

        jMenuItem_installPython.setText("Install python");
        jMenuItem_installPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_installPythonActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_installPython);

        jMenuItem_checkPython.setText("Check python");
        jMenuItem_checkPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_checkPythonActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_checkPython);

        jMenuItem_checkPIP.setText("Check PIP");
        jMenuItem_checkPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_checkPIPActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_checkPIP);

        jMenuItem4.setText("Install numpy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel6)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_xbarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_xbarrActionPerformed
        mostrarVentana(TipoGraficaEnum.X_BARRA_R);
    }//GEN-LAST:event_jMenuItem_xbarrActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaPrincipalControlEstadistico v = new VentanaPrincipalControlEstadistico();
        v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"TO DO : Mostrar manual...");
        mostrarMensaje("TO DO : Mostrar manual...");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem_installPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_installPythonActionPerformed
        
        try{
            if(Util.isPythonInstalled(false)){
                mostrarMensaje("Python ESTÁ instalado. No es necesario que lo instales de nuevo.");
                //JOptionPane.showMessageDialog(null, "Python ESTÁ instalado. No es necesario que lo instales de nuevo.");
            }else{
                InstallPythonProcess p = new  InstallPythonProcess();
                p.execute();
            }
        }catch(Exception e){
            mostrarMensaje(e.getMessage());
            //JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem_installPythonActionPerformed

    private void jMenuItem_checkPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_checkPythonActionPerformed
        if(Util.isPythonInstalled(false)){
            mostrarMensaje("Python ESTÁ instalado...");
            //JOptionPane.showMessageDialog(null, "Python ESTÁ instalado...");
        }else{
            mostrarMensaje("Python NO ESTÁ instalado...");
            //JOptionPane.showMessageDialog(null, "Python NO ESTÁ instalado...");
        }
    }//GEN-LAST:event_jMenuItem_checkPythonActionPerformed

    private void jMenuItem_checkPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_checkPIPActionPerformed
        if(Util.isPythonInstalled(true)){
            mostrarMensaje("PIP esta instalado...");
            //JOptionPane.showMessageDialog(null, "PIP esta instalado...");
        }else{
            mostrarMensaje("PIP no esta instalado...");
            //JOptionPane.showMessageDialog(null, "PIP no esta instalado...");
        }
    }//GEN-LAST:event_jMenuItem_checkPIPActionPerformed

    private void jMenuItem_xbarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_xbarsActionPerformed
        mostrarVentana(TipoGraficaEnum.X_BARRA_S);
    }//GEN-LAST:event_jMenuItem_xbarsActionPerformed

    private void jMenuItem_xmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_xmrActionPerformed
        mostrarVentana(TipoGraficaEnum.X_M_R);
    }//GEN-LAST:event_jMenuItem_xmrActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        InstallPylabProcess p = new  InstallPylabProcess();
        p.execute();
            
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemGraficoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGraficoPActionPerformed
        mostrarVentana(TipoGraficaEnum.P);
    }//GEN-LAST:event_jMenuItemGraficoPActionPerformed

    private void jMenuItemGraficoNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGraficoNPActionPerformed
        mostrarVentana(TipoGraficaEnum.NP);
    }//GEN-LAST:event_jMenuItemGraficoNPActionPerformed

    private void jMenuItemGraficoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGraficoCActionPerformed
        mostrarVentana(TipoGraficaEnum.C);
    }//GEN-LAST:event_jMenuItemGraficoCActionPerformed

    private void jMenuItemGraficoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGraficoUActionPerformed
        mostrarVentana(TipoGraficaEnum.U);
    }//GEN-LAST:event_jMenuItemGraficoUActionPerformed

    private void mostrarVentana(TipoGraficaEnum tipo){
        
        VentanaFormularioGrafica ventanaFormulario = new VentanaFormularioGrafica();
        ventanaFormulario.setTitle("");
        
        if(tipo==TipoGraficaEnum.X_BARRA_R){
            ventanaFormulario.setTitle(Constante.X_BAR_R);
        }else if(tipo==TipoGraficaEnum.X_BARRA_S){
            ventanaFormulario.setTitle(Constante.X_BAR_S);
        }else if(tipo==TipoGraficaEnum.X_M_R){
            ventanaFormulario.setTitle(Constante.X_M_R);
        }else if(tipo==TipoGraficaEnum.P){
            ventanaFormulario.setTitle(Constante.P);
        }else if(tipo==TipoGraficaEnum.NP){
            ventanaFormulario.setTitle(Constante.NP);
        }else if(tipo==TipoGraficaEnum.C){
            ventanaFormulario.setTitle(Constante.C);
        }else if(tipo==TipoGraficaEnum.U){
            ventanaFormulario.setTitle(Constante.U);
        }
        
        DataTransito.tituloVentanaRegistroDatos = ventanaFormulario.getTitle();
        ventanaFormulario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaFormulario.setLocationRelativeTo(null);
        ventanaFormulario.setTipoGrafica(tipo);
        ventanaFormulario.setVisible(true);
    }
    
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal mainWindow = new VentanaPrincipal();
                mainWindow.setLocationRelativeTo(null);
                mainWindow.setResizable(false);
                mainWindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGraficosPorAtributos;
    private javax.swing.JMenu jMenuGraficosPorVariables;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemGraficoC;
    private javax.swing.JMenuItem jMenuItemGraficoNP;
    private javax.swing.JMenuItem jMenuItemGraficoP;
    private javax.swing.JMenuItem jMenuItemGraficoU;
    private javax.swing.JMenuItem jMenuItem_checkPIP;
    private javax.swing.JMenuItem jMenuItem_checkPython;
    private javax.swing.JMenuItem jMenuItem_installPython;
    private javax.swing.JMenuItem jMenuItem_xbarr;
    private javax.swing.JMenuItem jMenuItem_xbars;
    private javax.swing.JMenuItem jMenuItem_xmr;
    // End of variables declaration//GEN-END:variables
}
