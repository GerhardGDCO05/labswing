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
public class PantallaModificar extends javax.swing.JFrame {
    ArrayList<LibroDigital>  modD= new ArrayList<>();
    ArrayList<LibroFisico>  modF= new ArrayList<>();

    public PantallaModificar() {
        initComponents();
        PantallaPrincipalEmpleado.IconManager.setIcon(this, "portada_001.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscarlibro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JTextArea();
        modificarD = new javax.swing.JButton();
        modificarF = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text6 = new javax.swing.JTextField();
        combobox1 = new javax.swing.JComboBox<>();
        combobox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        text8 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        text9 = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        text5 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        combobox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$", "BS", "€" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Informacion");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("codigo del libro");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 570, -1));

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        jPanel3.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 280, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FORMATO->[978-3-16-148410-0]");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 570, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecciona el tipo de libro a mdodificar");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 570, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("  Llena el campo que deseas y  haz click en guardar");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, 570, 30));

        buscarlibro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscarlibro.setText("Buscar");
        buscarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarlibroActionPerformed(evt);
            }
        });
        jPanel3.add(buscarlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 111, -1));

        panel1.setEditable(false);
        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setColumns(20);
        panel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panel1.setRows(5);
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane3.setViewportView(panel1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 220, 240, 260));

        panel2.setEditable(false);
        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setColumns(20);
        panel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panel2.setRows(5);
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(panel2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 240, 260));

        modificarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/editar.png"))); // NOI18N
        modificarD.setText("Digitales");
        modificarD.setEnabled(false);
        modificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDActionPerformed(evt);
            }
        });
        jPanel3.add(modificarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 119, -1));

        modificarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/editar.png"))); // NOI18N
        modificarF.setText("Fisicos");
        modificarF.setEnabled(false);
        modificarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarFActionPerformed(evt);
            }
        });
        jPanel3.add(modificarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 119, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/libro editar.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -4, 560, 600));

        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 600));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Costo de envio");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 150, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tamaño");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Titulo");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        text1.setEnabled(false);
        jPanel5.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Autor");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, -1));

        text2.setEnabled(false);
        jPanel5.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("costo del libro");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cantidad Disponible");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, -1));

        text3.setEnabled(false);
        jPanel5.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, -1));

        text4.setEnabled(false);
        jPanel5.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 340, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Categoria del Libro");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Año de Publicacion");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));

        text6.setEnabled(false);
        jPanel5.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, -1));

        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "PDF", "EPUB", "MOBI", "RTF", "SWF" }));
        combobox1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        combobox1.setEnabled(false);
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        jPanel5.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, -1));

        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB", "GB" }));
        combobox2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        combobox2.setEnabled(false);
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });
        jPanel5.add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 60, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Formato del Libro");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, -1));

        text8.setEnabled(false);
        jPanel5.add(text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        text7.setEnabled(false);
        text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text7ActionPerformed(evt);
            }
        });
        jPanel5.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 280, 80, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Peso del Libro");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 130, -1));

        jLabel18.setText("KG");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 20));

        text9.setEnabled(false);
        jPanel5.add(text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, -1));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/imagenGuardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel5.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 180, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 320, 10));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 320, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/flecha-izquierda.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 180, -1));

        jLabel2.setText("$");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 20, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/libro.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 320, 220));

        text5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "CIENCIA FICCION", "ACCION Y AVENTURA", "HISTORIA", "INFANTIL", "TERROR/HORROR", "ROMANCE", "MISTERIO/THRILLER", "POESIA", "LITERATURA CLASICA", "LITERATURA INFANTIL", "LITERATURA DIDACTICA", "CUENTOS", "NOVELAS", "BIOGRAFIAS", "AUTOAYUDA" }));
        text5.setEnabled(false);
        jPanel5.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, 140, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Estado");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 200, 310, -1));

        combobox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "0", "1" }));
        combobox3.setEnabled(false);
        jPanel5.add(combobox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labswing/pantallas/libro.png"))); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 320, 610));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 570, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed

    }//GEN-LAST:event_combobox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaPrincipalEmpleado ppe =new PantallaPrincipalEmpleado();
        ppe.setVisible(true);
        ppe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarlibroActionPerformed
        JFrame frame = new JFrame();
        StringBuilder sd = new StringBuilder();
        StringBuilder sf = new StringBuilder();
        Controlador ct = new Controlador();
        if(!"".equals(codigo.getText()) && !" ".equals(codigo.getText())){
            modD=ct.BuscarCodigoDigitales(codigo.getText());
            modF=ct.BuscarCodigoFisico(codigo.getText());
            
            if(modD.isEmpty()==false){
                for (LibroDigital libro : modD) {
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
                modificarD.setEnabled(true);
            }
            if(modF.isEmpty()==false){
                for (LibroFisico libro : modF) {
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
                modificarF.setEnabled(true);
            } 
        }
        else{
            modificarD.setEnabled(false);modificarF.setEnabled(false);
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            text4.setEnabled(false);
            text5.setEnabled(false);
            text6.setEnabled(false);
            text7.setEnabled(false);
            text8.setEnabled(false);
            text9.setEnabled(false);
            combobox1.setEnabled(false);
            combobox2.setEnabled(false);
            combobox3.setEnabled(false);
            JOptionPane.showMessageDialog(frame, "INGRESE UN CODIGO PARA HABILITAR LA MODIFICACION ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        panel1.setText(sd.toString());
        panel2.setText(sf.toString());
        
        
    }//GEN-LAST:event_buscarlibroActionPerformed

    private void modificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDActionPerformed
        text1.setEnabled(true);
        text2.setEnabled(true);
        text3.setEnabled(true);
        text4.setEnabled(true);
        text5.setEnabled(true);
        text6.setEnabled(true);
        text7.setEnabled(true);
        combobox1.setEnabled(true);
        combobox2.setEnabled(true);
        combobox3.setEnabled(true);
        if(text8.isEnabled()){text8.setEnabled(false);}
        if(text9.isEnabled()){text9.setEnabled(false);}
        
    }//GEN-LAST:event_modificarDActionPerformed

    private void modificarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarFActionPerformed
        text1.setEnabled(true);
        text2.setEnabled(true);
        text3.setEnabled(true);
        text4.setEnabled(true);
        text5.setEnabled(true);
        text6.setEnabled(true);
        text8.setEnabled(true);
        text9.setEnabled(true);
        combobox3.setEnabled(true);
        if(text7.isEnabled()){text7.setEnabled(false);}
        if(combobox1.isEnabled()){combobox1.setEnabled(false);}
        if(combobox2.isEnabled()){combobox2.setEnabled(false);}
    }//GEN-LAST:event_modificarFActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        Controlador ct = new Controlador();        
        JFrame frame = new JFrame();
        //GUARDAMOS LOS DATOS MODIFICADOS EN LA LISTA modD
        
        if(combobox1.isEnabled()){
            if((!"".equals(text1.getText()) && !" ".equals(text1.getText())) || (!"".equals(text2.getText()) && !" ".equals(text2.getText())) || (!"".equals(text3.getText()) && !" ".equals(text3.getText())) || (!"".equals(text4.getText()) && !" ".equals(text4.getText())) || (!"".equals(text6.getText()) && !" ".equals(text6.getText())) || (!"".equals(text7.getText()) && !" ".equals(text7.getText()))){
                if(!"".equals(text1.getText()) && !" ".equals(text1.getText())){
                    for( LibroDigital d : modD){
                        d.setTítulo_del_libro(text1.getText());
                        if(text5.getSelectedItem()!="ELEGIR"){
                            d.setCategoria((String) text5.getSelectedItem());
                        }
                        if(combobox1.getSelectedItem()!="ELEGIR"){
                            d.setFormato((String) combobox1.getSelectedItem());
                        }
                        if(combobox3.getSelectedItem()!="ELEGIR"){
                            d.setEstado((int) combobox1.getSelectedItem());
                        }
                    }
                }
                if(!"".equals(text2.getText()) && !" ".equals(text2.getText())){
                    if(ct.validarRegex(text2.getText(), "^[^0-9]*$")){
                        for( LibroDigital d : modD){
                            d.setAutor_del_libro(text2.getText());
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "NOMBRE DEL AUTOR iNVALIDO NO SE ACEPTAN NUMEROS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text3.getText()) && !" ".equals(text3.getText())){
                    if(ct.validarRegex(text3.getText(), "^-?\\d+([.,]\\d+)?$")){
                        double costo=Double.parseDouble(text3.getText().replace(",", "."));
                        for( LibroDigital d : modD){
                            d.setCosto_del_libro(costo);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "COSTO iNVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text4.getText()) && !" ".equals(text4.getText())){
                    if(ct.validarRegex(text4.getText(), "^[1-9]\\d*$")){
                        int cant = Integer.parseInt(text4.getText());
                        for( LibroDigital d : modD){
                            d.setCantidad_disponibles(cant);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "CANTIDAD INVALIDA NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }    
                if(!"".equals(text6.getText()) && !" ".equals(text6.getText())){
                    if(ct.validarRegex(text6.getText(), "^(19[0-9]{2}|1[0-9]{1,3}|20[0-1][0-9]|202[0-3]|[0-9]{1,3})$")){
                        int cant = Integer.parseInt(text6.getText());
                        for( LibroDigital d : modD){
                            d.setCantidad_disponibles(cant);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "PUBLICACION INVALIDA NO SE ACEPTAN LETRAS NI UN AÑO MAYOR AL ACTUAL", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text7.getText()) && !" ".equals(text7.getText())){
                    String tam = text7.getText()+(String)combobox2.getSelectedItem();
                    if(ct.validarRegex(tam, "^\\s*\\d+\\s*(MB|GB|mb|gb)\\s*$")){
                        for( LibroDigital d : modD){
                            d.setTamañoacrhivo(tam);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "TAMAÑO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                ct.modificarD(modD);
            }
            else{JOptionPane.showMessageDialog(frame, "NO HAY DATOS PARA MODIFICAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);}
        }
        //GUARDAMOS LOS DATOS MODIFICADOS EN LA LISTA modF
        if(text8.isEnabled()){
            if((!"".equals(text1.getText()) && !" ".equals(text1.getText())) || (!"".equals(text2.getText()) && !" ".equals(text2.getText())) || (!"".equals(text3.getText()) && !" ".equals(text3.getText())) || (!"".equals(text4.getText()) && !" ".equals(text4.getText())) || (!"".equals(text6.getText()) && !" ".equals(text6.getText())) || (!"".equals(text8.getText()) && !" ".equals(text8.getText())) || (!"".equals(text9.getText()) && !" ".equals(text9.getText()))){
                if(!"".equals(text1.getText()) && !" ".equals(text1.getText())){
                    for( LibroFisico f : modF){
                        f.setTítulo_del_libro(text1.getText());
                        if(text5.getSelectedItem()!=" "){
                            f.setCategoria((String) text5.getSelectedItem());
                        } 
                        if(combobox3.getSelectedItem()!="ELEGIR"){
                            f.setEstado((int) combobox1.getSelectedItem());
                        }
                    }
                }
                if(!"".equals(text2.getText()) && !" ".equals(text2.getText())){
                    if(ct.validarRegex(text2.getText(), "^[^0-9]*$")){
                        for( LibroFisico f : modF){
                            f.setAutor_del_libro(text2.getText());
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "NOMBRE DEL AUTOR iNVALIDO NO SE ACEPTAN NUMEROS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text3.getText()) && !" ".equals(text3.getText())){
                    if(ct.validarRegex(text3.getText(), "^-?\\d+([.,]\\d+)?$")){
                        double costo=Double.parseDouble(text3.getText().replace(",", "."));
                        for( LibroFisico f : modF){
                            f.setCosto_del_libro(costo);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "COSTO iNVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text4.getText()) && !" ".equals(text4.getText())){
                    if(ct.validarRegex(text4.getText(), "^[1-9]\\d*$")){
                        int cant = Integer.parseInt(text4.getText());
                        for( LibroFisico f : modF){
                            f.setCantidad_disponibles(cant);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "CANTIDAD INVALIDA NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }    
                if(!"".equals(text6.getText()) && !" ".equals(text6.getText())){
                    if(ct.validarRegex(text6.getText(), "^(19[0-9]{2}|1[0-9]{1,3}|20[0-1][0-9]|202[0-3]|[0-9]{1,3})$")){
                        int pub = Integer.parseInt(text6.getText());
                        for( LibroFisico f : modF){
                            f.setAño_publicacion(pub);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "PUBLICACION INVALIDA NO SE ACEPTAN LETRAS NI UN AÑO MAYOR AL ACTUAL", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }
                if(!"".equals(text8.getText()) && !" ".equals(text8.getText())){

                    if(ct.validarRegex(text8.getText(), "^-?\\d+([.,]\\d+)?$")){
                        double costoenvio=Double.parseDouble(text8.getText().replace(",", "."));
                        for( LibroFisico f : modF){
                            f.setCosto_envio(costoenvio);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "TAMAÑO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                }   
                if(!"".equals(text9.getText()) && !" ".equals(text9.getText())){

                    if(ct.validarRegex(text9.getText(), "^-?\\d+([.,]\\d+)?$")){
                        double peso=Double.parseDouble(text9.getText().replace(",", "."));
                        for( LibroFisico f : modF){
                            f.setPeso(peso);
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame, "COSTO DE ENVIO INVALIDO NO ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
                } 
                ct.modificarF(modF);
            }
            else{JOptionPane.showMessageDialog(frame, "NO HAY DATOS PARA MODIFICAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);}  
        }    
    }//GEN-LAST:event_guardarActionPerformed
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
        java.awt.EventQueue.invokeLater(() -> {
            new IngresarFisico().setVisible(true);
        } // Variables declaration - do not modify
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarlibro;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JComboBox<String> combobox3;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton modificarD;
    private javax.swing.JButton modificarF;
    private javax.swing.JTextArea panel1;
    private javax.swing.JTextArea panel2;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JComboBox<String> text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    private javax.swing.JTextField text9;
    // End of variables declaration//GEN-END:variables
}
