/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import datos1.*;
import java.awt.Color;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class PrestarLibro extends javax.swing.JPanel {
    private Biblioteca biblioteca;
    /**
     * Creates new form PrestarLibro
     */
    public PrestarLibro(Biblioteca p_biblio) {
        biblioteca = p_biblio;
        initComponents();
        cargarDatos();
    }

    
    public void cargarDatos(){
        for(Socio socio: biblioteca.getSocios()){
            jcSocio.addItem(socio.getNombre());
        }
        for(Libro libro: biblioteca.getLibros()){
            jcLibro.addItem(libro.getTitulo());
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcSocio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcLibro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbMostrar = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 60, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Prestar Libro");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jcSocio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Ninguno-" }));
        jPanel2.add(jcSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 460, 50));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Seleccione un Socio:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jcLibro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Ninguno-" }));
        jPanel2.add(jcLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 460, 50));

        jLabel3.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Seleccione un Libro");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 20));

        jbMostrar.setBackground(new java.awt.Color(239, 60, 78));
        jbMostrar.setFont(new java.awt.Font("Decker", 1, 20)); // NOI18N
        jbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbMostrar.setText("Prestar");
        jbMostrar.setBorderPainted(false);
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 130, 40));

        jlMensaje.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jPanel2.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 460, 40));

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        try{
            Calendar fecha= Calendar.getInstance();
            Socio prestar= null;
            Libro prestarLibro= null;
            for(Socio socio: biblioteca.getSocios()){
                if(socio.getNombre().equals(jcSocio.getSelectedItem().toString())){
                    prestar= socio;
                }
            }  
             for(Libro libro: biblioteca.getLibros()){
                if(libro.getTitulo().equals(jcLibro.getSelectedItem().toString())){
                    prestarLibro= libro;
                }
            }
             
             //Verifica si el libro se encuentra en la biblioteca, si es as?? realiza el prestamo
             if(prestarLibro.prestado()){
                jcLibro.setSelectedIndex(0);
                jcSocio.setSelectedIndex(0);
             
                jlMensaje.setForeground(new Color(255,0,0));
                jlMensaje.setText("Error! El Libro ya se encuentra Prestado!");
             } else{
                biblioteca.prestarLibro(fecha, prestar, prestarLibro);

                jlMensaje.setForeground(new Color(0,204,102));
                jlMensaje.setText("Libro Prestado Correctamente");

                jcLibro.setSelectedIndex(0);
                jcSocio.setSelectedIndex(0);            
             }
             
             
             
        } catch(Exception e){   
            
            jcLibro.setSelectedIndex(0);
            jcSocio.setSelectedIndex(0);
             
            jlMensaje.setForeground(new Color(255,0,0));
            jlMensaje.setText("Error! Debe Seleccionar alg??n Libro y a un Socio");
        }     
    }//GEN-LAST:event_jbMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JComboBox<String> jcLibro;
    private javax.swing.JComboBox<String> jcSocio;
    private javax.swing.JLabel jlMensaje;
    // End of variables declaration//GEN-END:variables
}
