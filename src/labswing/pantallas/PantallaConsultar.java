/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labswing.pantallas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import laboratoriolibro.Controlador;
import laboratoriolibro.LibroDigital;
import laboratoriolibro.LibroFisico;

/**
 *
 * @author Usuario
 */
public class PantallaConsultar extends javax.swing.JFrame {

    public PantallaConsultar() {
        ArrayList<LibroDigital> listaDigitales= new ArrayList<>();
        ArrayList<LibroFisico> listaFisicos= new ArrayList<>();
        JFrame frame = new JFrame();
        Controlador ct = new Controlador();
        initComponents();
        PantallaPrincipalEmpleado.IconManager.setIcon(this, "portada_001.jpg");
        listaDigitales=ct.buscarInfoDigitales();
        listaFisicos=ct.buscarInfoFisicos();
        
        if(listaDigitales.isEmpty() && listaFisicos.isEmpty()){
            JOptionPane.showMessageDialog(frame, "NO HAY LIBROS PARA MOSTRAR", "INFORMACION", JOptionPane.WARNING_MESSAGE);
        }
        else{
            StringBuilder sd = new StringBuilder();
            StringBuilder sf = new StringBuilder();
            if(listaDigitales.isEmpty()){
                JOptionPane.showMessageDialog(frame, "NO HAY LIBROS DIGITALES PARA MOSTRAR", "INFORMACION", JOptionPane.WARNING_MESSAGE);
            }
            else{
                for (LibroDigital libro : listaDigitales) {
                    sd.append("CODIGO:   ").append(libro.getCódigo_del_libro()).append("\n");

                    sd.append("TITULO:   ").append(libro.getTítulo_del_libro()).append("\n");

                    sd.append("AUTOR:   ").append(libro.getAutor_del_libro()).append("\n");

                    sd.append("COSTO:   ").append(libro.getCosto_del_libro()).append("\n");

                    sd.append("CANTIDAD:   ").append(libro.getCantidad_disponibles()).append("\n");

                    sd.append("CATEGORIA:   ").append(libro.getCategoria()).append("\n");

                    sd.append("AÑO DE PUBLICACION:   ").append(libro.getAño_publicacion()).append("\n");

                    sd.append("PRECIO:   ").append(libro.getPrecio_del_libro()).append("\n");

                    sd.append("FORMATO:   ").append(libro.getFormato()).append("\n");

                    sd.append("TAMAÑO:   ").append(libro.getTamañoacrhivo()).append("\n");

                    sd.append("ESTADO:   ").append(libro.getEstado()).append("\n\n");
                }
            }
            
            if(listaFisicos.isEmpty()){
                JOptionPane.showMessageDialog(frame, "NO HAY LIBROS FISICOS PARA MOSTRAR", "INFORMACION", JOptionPane.WARNING_MESSAGE);
            }
            else{
                for (LibroFisico libro : listaFisicos) {
                    sf.append("CODIGO:   ").append(libro.getCódigo_del_libro()).append("\n");;

                    sf.append("TITULO:   ").append(libro.getTítulo_del_libro()).append("\n");

                    sf.append("AUTOR:   ").append(libro.getAutor_del_libro()).append("\n");

                    sf.append("COSTO:   ").append(libro.getCosto_del_libro()).append("\n");

                    sf.append("CANTIDAD:   ").append(libro.getCantidad_disponibles()).append("\n");

                    sf.append("CATEGORIA:   ").append(libro.getCategoria()).append("\n");

                    sf.append("AÑO DE PUBLICACION:   ").append(libro.getAño_publicacion()).append("\n");

                    sf.append("PRECIO:   ").append(libro.getPrecio_del_libro()).append("\n");

                    sf.append("Peso:   ").append(libro.getPeso()).append("\n");

                    sf.append("COSTO DEL ENVIO:   ").append(libro.getCosto_envio()).append("\n");

                    sf.append("ESTADO:   ").append(libro.getEstado()).append("\n\n");  
                }
            }
          
           panel1.setText(sd.toString());
           panel2.setText(sf.toString());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMACION");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("    Data Libros");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 0, 172, -1));

        panel1.setEditable(false);
        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(panel1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 240, 432));

        panel2.setEditable(false);
        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(panel2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 62, 230, 432));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("   E-Books");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 38, 75, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("   Fisicos");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 38, 75, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("   Regresar");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 571, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/flecha-izquierda.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel3.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 524, 100, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/resuelto.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        switch(this.getName()){
            case "empleado"->{
                PantallaPrincipalEmpleado panta = new PantallaPrincipalEmpleado();
                panta.setVisible(true);
                panta.setLocationRelativeTo(null);
            }
            case "cliente"->{
                PantallaPrincipalCliente panca = new PantallaPrincipalCliente();
                panca.setVisible(true);
                panca.setLocationRelativeTo(null);
            }
        }
        
    }//GEN-LAST:event_VolverActionPerformed
    
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
            java.util.logging.Logger.getLogger(IngresarFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarFisico().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane panel1;
    private javax.swing.JTextPane panel2;
    // End of variables declaration//GEN-END:variables
}
