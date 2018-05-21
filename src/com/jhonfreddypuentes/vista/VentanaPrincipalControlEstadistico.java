/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonfreddypuentes.vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.jhonfreddypuentes.constante.Constante;
import com.jhonfreddypuentes.logica.Calculus;
import com.jhonfreddypuentes.util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author Jhon
 */
public class VentanaPrincipalControlEstadistico extends javax.swing.JFrame {

    private Progreso progreso;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipalControlEstadistico() {
        initComponents();
        cargarValidadores();
        jLabel_arl.setText(Constante.CADENA_CERO);
    }

    private void cargarValidadores(){
        /** numeroDatosSimular */
         jTextField_NumeroRachas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
                  mostrarMensajeEnBarraDeEstado(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
        
         /** media */
         jTextField_media.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mostrarMensajeEnBarraDeEstado(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
        /** desviacion estandar */
         jTextField_desviacionEstandar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mostrarMensajeEnBarraDeEstado(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
         /** limite De Control Inferior */
         jTextField_limiteDeControlInferior.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mostrarMensajeEnBarraDeEstado(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
         /** limite De Control Superior */
         jTextField_limiteDeControlSuperior.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mostrarMensajeEnBarraDeEstado(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
    }
    
    private void mostrarMensajeEnBarraDeEstado(String mensaje){
        jLabel_barraDeEstado.setText(mensaje);
    }
    
    /**
     * Validar campos y parametros obligatorios.
     */
    private boolean camposValidos(){
        mostrarMensajeEnBarraDeEstado(Constante.VALIDANDO_CAMPOS);
        boolean resultadoValidacion  = false;
        String numeroDatosSimular    = jTextField_NumeroRachas.getText();
        String media                 = null;
        String desviacionEstandar    = null;
        String limiteControlInferior = null;
        String limiteControlSuperior = null;        
        
        if(Util.esNuloOVacio(numeroDatosSimular)){
            mostrarMensajeEnBarraDeEstado(Constante.FALTA_NUMERO_DE_DATOS_POR_COMPLETAR);
        }else{
            media = jTextField_media.getText();
            if(Util.esNuloOVacio(media)){
                mostrarMensajeEnBarraDeEstado(Constante.FALTA_MEDIA_POR_COMPLETAR);
            }else{
                desviacionEstandar = jTextField_desviacionEstandar.getText();
                if(Util.esNuloOVacio(desviacionEstandar)){
                    mostrarMensajeEnBarraDeEstado(Constante.FALTA_DESVIACION_ESTANDAR_POR_COMPLETAR);
                }else{
                    limiteControlInferior = jTextField_limiteDeControlInferior.getText();
                    if(Util.esNuloOVacio(limiteControlInferior)){
                       mostrarMensajeEnBarraDeEstado(Constante.FALTA_LIMITE_CONTROL_INFERIOR_POR_COMPLETAR); 
                    }else{
                        limiteControlSuperior = jTextField_limiteDeControlSuperior.getText();
                        if(Util.esNuloOVacio(limiteControlSuperior)){
                            mostrarMensajeEnBarraDeEstado(Constante.FALTA_LIMITE_CONTROL_SUPERIOR_POR_COMPLETAR); 
                        }else{
                            try{
                                int inLimiteControlInferior = Integer.parseInt(limiteControlInferior);
                                int inLimiteControlSuperior = Integer.parseInt(limiteControlSuperior);
                                
                                if(inLimiteControlInferior>=inLimiteControlSuperior){
                                    mostrarMensajeEnBarraDeEstado(Constante.LIMITE_INFERIOR_MAYOR_A_LIMITE_INFERIOR);
                                }else{
                                    resultadoValidacion = true;
                                }  
                            }catch(Exception e){
                                mostrarMensajeEnBarraDeEstado(Constante.ERROR_AL_CONVERTIR_LOS_LIMITES);
                            }                         
                        }
                    }
                }
            }
        }
        
        return resultadoValidacion;
    }
    
    class Progreso extends  SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() throws Exception {
            desHabilitarBotones(true);
            ejecutar();
            return null;
        }
        
        @Override
        public void done(){
           desHabilitarBotones(false);
           mostrarMensajeEnBarraDeEstado(Constante.TERMINADO);
        }
       
   }
    
    private void desHabilitarBotones(boolean opcion){
        if(opcion){
            /** Dehabilitar  */
            jButton_ejecutarSimulacion.setEnabled(false);
            jButton_limpiarCampos.setEnabled(false);
            jButton_cerrarSimulacion.setEnabled(false);
        }else{
            /** Habilitar */
            jButton_ejecutarSimulacion.setEnabled(true);
            jButton_limpiarCampos.setEnabled(true);
            jButton_cerrarSimulacion.setEnabled(true);
        }
    }
    
    public void ejecutar(){
        
            int numeroDeRachas = Integer.parseInt(jTextField_NumeroRachas.getText());
            int media          = Integer.parseInt(jTextField_media.getText());
            int desviacion     = Integer.parseInt(jTextField_desviacionEstandar.getText());
            int limiteSuperior = Integer.parseInt(jTextField_limiteDeControlSuperior.getText());
            int limiteInferior = Integer.parseInt(jTextField_limiteDeControlInferior.getText());
            
            int cantidadDatosGenerados = 0;
            int contadorRachas         = 0;
            
            while(contadorRachas<numeroDeRachas){
                
                double dato = Calculus.generateRamdomNumber(desviacion, media);
                
                if(dato>limiteSuperior || dato<limiteInferior){
                    contadorRachas++;
                }
                
                cantidadDatosGenerados++;
                
                double arl = Calculus.computeARL(cantidadDatosGenerados,contadorRachas);
                
                jLabel_arl.setText(""+arl);
                jLabel_barraDeEstado.setText(Constante.EN_PROGRESO);
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_NumeroRachas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_media = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_desviacionEstandar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_limiteDeControlInferior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_limiteDeControlSuperior = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_arl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton_ejecutarSimulacion = new javax.swing.JButton();
        jButton_limpiarCampos = new javax.swing.JButton();
        jButton_cerrarSimulacion = new javax.swing.JButton();
        jLabel_barraDeEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulación Control Calidad");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel2.setText("Número de Rachas :");

        jLabel3.setText("Media : ");

        jLabel4.setText("Desviación Estandar :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_NumeroRachas)
                    .addComponent(jTextField_media, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_NumeroRachas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control Estadistico de La Calidad");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Limites de Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel5.setText("Limite Inferior :");

        jLabel6.setText("Limite Superior :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jTextField_limiteDeControlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_limiteDeControlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_limiteDeControlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_limiteDeControlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel7.setText("Longitud Promedio De Corrida (ARL) : ");

        jLabel_arl.setText("370");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel_arl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_arl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jButton_ejecutarSimulacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_ejecutarSimulacion.setForeground(new java.awt.Color(0, 102, 204));
        jButton_ejecutarSimulacion.setText("Ejecutar");
        jButton_ejecutarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ejecutarSimulacionActionPerformed(evt);
            }
        });

        jButton_limpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_limpiarCampos.setForeground(new java.awt.Color(255, 102, 102));
        jButton_limpiarCampos.setText("Limpiar");
        jButton_limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarCamposActionPerformed(evt);
            }
        });

        jButton_cerrarSimulacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_cerrarSimulacion.setForeground(new java.awt.Color(255, 0, 0));
        jButton_cerrarSimulacion.setText("Cerrar");
        jButton_cerrarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarSimulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton_ejecutarSimulacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_limpiarCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cerrarSimulacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton_ejecutarSimulacion)
                .addComponent(jButton_limpiarCampos)
                .addComponent(jButton_cerrarSimulacion))
        );

        jLabel_barraDeEstado.setText("No hay mensajes que mostrar.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_barraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_barraDeEstado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ejecutarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ejecutarSimulacionActionPerformed
        // TODO add your handling code here:
        
        if(camposValidos()){
            try {
               progreso = new Progreso();
               progreso.execute();
           } catch (Exception ex) {
               Logger.getLogger(VentanaPrincipalControlEstadistico.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
    }//GEN-LAST:event_jButton_ejecutarSimulacionActionPerformed

    private void jButton_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarCamposActionPerformed
        // TODO add your handling code here:
            jTextField_NumeroRachas.setText("");
            jTextField_media.setText("");
            jTextField_desviacionEstandar.setText("");
            jTextField_limiteDeControlSuperior.setText("");
            jTextField_limiteDeControlInferior.setText("");
            jLabel_arl.setText("0");
    }//GEN-LAST:event_jButton_limpiarCamposActionPerformed

    private void jButton_cerrarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarSimulacionActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_cerrarSimulacionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipalControlEstadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalControlEstadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalControlEstadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalControlEstadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
//                VentanaPrincipalControlEstadistico v = new VentanaPrincipalControlEstadistico();
//                v.setResizable(false);
//                v.setLocationRelativeTo(null);
//                v.setVisible(true);
//                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cerrarSimulacion;
    private javax.swing.JButton jButton_ejecutarSimulacion;
    private javax.swing.JButton jButton_limpiarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_arl;
    private javax.swing.JLabel jLabel_barraDeEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField_NumeroRachas;
    private javax.swing.JTextField jTextField_desviacionEstandar;
    private javax.swing.JTextField jTextField_limiteDeControlInferior;
    private javax.swing.JTextField jTextField_limiteDeControlSuperior;
    private javax.swing.JTextField jTextField_media;
    // End of variables declaration//GEN-END:variables
}
