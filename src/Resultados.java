
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52614
 */
public class Resultados extends javax.swing.JFrame {

 
    
    public Resultados(double desviacion, double rango, double varianza, double mayorcali, double menorcali, double media, String moda,String repeticiones, double mediana) {
        
        initComponents();
        this.getContentPane().setBackground(Color.LIGHT_GRAY);     
        this.setTitle("Resultados");
        
        String desS = String.valueOf(desviacion);
            this.Desviacion.setText(desS);
        String rangoS = String.valueOf(rango);
            this.rango.setText(rangoS);         
        String vazS = String.valueOf(varianza);
            this.varianza.setText(vazS);          
        String mayoS = String.valueOf(mayorcali);
            this.calimayor.setText(mayoS);          
        String menS = String.valueOf(menorcali);
            this.calimenor.setText(menS);  
        String mediaS = String.valueOf(media);
            this.Media.setText(mediaS);  
            this.Moda.setText(moda);
            this.No_Rep.setText(repeticiones);
        String madianaS = String.valueOf(mediana);
            this.Mediana.setText(madianaS);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Lab_Desviación = new javax.swing.JLabel();
        Lab_Rango = new javax.swing.JLabel();
        Lab_Calme = new javax.swing.JLabel();
        No_Rep = new javax.swing.JTextField();
        Media = new javax.swing.JTextField();
        Lab_Dispersión = new javax.swing.JLabel();
        Lab_Reporte_Datos = new javax.swing.JLabel();
        Lab_Tendencia_Central = new javax.swing.JLabel();
        varianza = new javax.swing.JTextField();
        Lab_CalMa = new javax.swing.JLabel();
        Lab_Moda = new javax.swing.JLabel();
        Lab_Varianza = new javax.swing.JLabel();
        Lab_Media = new javax.swing.JLabel();
        Lab_Mediana = new javax.swing.JLabel();
        Desviacion = new javax.swing.JTextField();
        calimayor = new javax.swing.JTextField();
        Mediana = new javax.swing.JTextField();
        calimenor = new javax.swing.JTextField();
        Moda = new javax.swing.JTextField();
        rango = new javax.swing.JTextField();
        Btn_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Labelico = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lab_Desviación.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Desviación.setText("Desviación Estandar:");
        jPanel2.add(Lab_Desviación, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        Lab_Rango.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Rango.setText("Rango:");
        jPanel2.add(Lab_Rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Lab_Calme.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Calme.setText("Menor Calificación:");
        jPanel2.add(Lab_Calme, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        No_Rep.setBackground(new java.awt.Color(63, 73, 74));
        No_Rep.setForeground(new java.awt.Color(255, 255, 255));
        No_Rep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        No_Rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_RepActionPerformed(evt);
            }
        });
        jPanel2.add(No_Rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, -1));

        Media.setBackground(new java.awt.Color(63, 73, 74));
        Media.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Media.setForeground(new java.awt.Color(255, 255, 255));
        Media.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaActionPerformed(evt);
            }
        });
        jPanel2.add(Media, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, 20));

        Lab_Dispersión.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        Lab_Dispersión.setForeground(new java.awt.Color(204, 204, 0));
        Lab_Dispersión.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lab_Dispersión.setText("Medidas de Dispersión");
        jPanel2.add(Lab_Dispersión, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Lab_Reporte_Datos.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        Lab_Reporte_Datos.setForeground(new java.awt.Color(255, 51, 0));
        Lab_Reporte_Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lab_Reporte_Datos.setText("Reporte de Datos");
        Lab_Reporte_Datos.setToolTipText("");
        jPanel2.add(Lab_Reporte_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        Lab_Tendencia_Central.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        Lab_Tendencia_Central.setForeground(new java.awt.Color(255, 155, 0));
        Lab_Tendencia_Central.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lab_Tendencia_Central.setText("Medidas de Tendencia Central");
        jPanel2.add(Lab_Tendencia_Central, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 20));

        varianza.setBackground(new java.awt.Color(63, 73, 74));
        varianza.setForeground(new java.awt.Color(255, 255, 255));
        varianza.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        varianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varianzaActionPerformed(evt);
            }
        });
        jPanel2.add(varianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 200, 20));

        Lab_CalMa.setForeground(new java.awt.Color(255, 255, 255));
        Lab_CalMa.setText("Mayor Calificación:");
        jPanel2.add(Lab_CalMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        Lab_Moda.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Moda.setText("Moda:");
        jPanel2.add(Lab_Moda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Lab_Varianza.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Varianza.setText("Varianza:");
        jPanel2.add(Lab_Varianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        Lab_Media.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Media.setText("Media:");
        jPanel2.add(Lab_Media, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Lab_Mediana.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Mediana.setText("Mediana:");
        jPanel2.add(Lab_Mediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Desviacion.setBackground(new java.awt.Color(63, 73, 74));
        Desviacion.setForeground(new java.awt.Color(255, 255, 255));
        Desviacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Desviacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesviacionActionPerformed(evt);
            }
        });
        jPanel2.add(Desviacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        calimayor.setBackground(new java.awt.Color(63, 73, 74));
        calimayor.setForeground(new java.awt.Color(255, 255, 255));
        calimayor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calimayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calimayorActionPerformed(evt);
            }
        });
        jPanel2.add(calimayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, 20));

        Mediana.setBackground(new java.awt.Color(63, 73, 74));
        Mediana.setForeground(new java.awt.Color(255, 255, 255));
        Mediana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedianaActionPerformed(evt);
            }
        });
        jPanel2.add(Mediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, 20));

        calimenor.setBackground(new java.awt.Color(63, 73, 74));
        calimenor.setForeground(new java.awt.Color(255, 255, 255));
        calimenor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calimenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calimenorActionPerformed(evt);
            }
        });
        jPanel2.add(calimenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, 20));

        Moda.setBackground(new java.awt.Color(63, 73, 74));
        Moda.setForeground(new java.awt.Color(255, 255, 255));
        Moda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Moda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModaActionPerformed(evt);
            }
        });
        jPanel2.add(Moda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 80, 20));

        rango.setBackground(new java.awt.Color(63, 73, 74));
        rango.setForeground(new java.awt.Color(255, 255, 255));
        rango.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangoActionPerformed(evt);
            }
        });
        jPanel2.add(rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, 20));

        Btn_Salir.setBackground(new java.awt.Color(63, 73, 74));
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Salir");
        Btn_Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 120, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. de Rep:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        Labelico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa-blanco-fondo-oscuro_28629-838.jpg"))); // NOI18N
        jPanel2.add(Labelico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesviacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesviacionActionPerformed
    
    }//GEN-LAST:event_DesviacionActionPerformed

    private void MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaActionPerformed
       
    }//GEN-LAST:event_MediaActionPerformed

    private void ModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModaActionPerformed

    private void MedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedianaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedianaActionPerformed

    private void rangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangoActionPerformed

    private void calimayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calimayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calimayorActionPerformed

    private void varianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varianzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varianzaActionPerformed

    private void calimenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calimenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calimenorActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void No_RepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_RepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_No_RepActionPerformed

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
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados(0,0,0,0,0,0,"","",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JTextField Desviacion;
    private javax.swing.JLabel Lab_CalMa;
    private javax.swing.JLabel Lab_Calme;
    private javax.swing.JLabel Lab_Desviación;
    private javax.swing.JLabel Lab_Dispersión;
    private javax.swing.JLabel Lab_Media;
    private javax.swing.JLabel Lab_Mediana;
    private javax.swing.JLabel Lab_Moda;
    private javax.swing.JLabel Lab_Rango;
    private javax.swing.JLabel Lab_Reporte_Datos;
    private javax.swing.JLabel Lab_Tendencia_Central;
    private javax.swing.JLabel Lab_Varianza;
    private javax.swing.JLabel Labelico;
    private javax.swing.JTextField Media;
    private javax.swing.JTextField Mediana;
    private javax.swing.JTextField Moda;
    private javax.swing.JTextField No_Rep;
    private javax.swing.JTextField calimayor;
    private javax.swing.JTextField calimenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField rango;
    private javax.swing.JTextField varianza;
    // End of variables declaration//GEN-END:variables
}
