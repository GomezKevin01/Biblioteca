package paneles;

import datos1.*;
import java.awt.Color;
import funciones.Validar;

public class AgregarLibro extends javax.swing.JPanel {
    private Biblioteca biblioteca; 
    private Validar v = new Validar();
    
    public AgregarLibro(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        //Supervisa que se ingresen unicamente Letras
        v.validarSoloLetras(jtTitulo);
        //Supervisa que se ingresen unicamente Números
        v.validarSoloNumeros(jtEdicion);
        //Supervisa que se ingresen unicamente Números
        v.validarSoloNumeros(jtAnio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtEdicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtEditorial = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 60, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Agregar Libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 60, 78)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, 31));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("TÍTULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 63, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("EDICIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(jtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 310, 31));

        jLabel4.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("EDITORIAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(jtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 31));
        jPanel1.add(jtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 310, 31));

        jLabel5.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("AÑO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 430, 260));

        jbAgregar.setBackground(new java.awt.Color(239, 60, 78));
        jbAgregar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Aceptar");
        jbAgregar.setBorderPainted(false);
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 40));

        jlMensaje.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 440, 30));
    }// </editor-fold>//GEN-END:initComponents

    //Se encarga de instanciar y agregar un obj de tipo Libro a la coleccion 
    // ubicada en la clase Biblioteca
    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try{    
            // Obtenemos los datos necesarios para instaciar un objeto de tipo Libro
            String titulo= jtTitulo.getText();
            int edicion= Integer.valueOf(jtEdicion.getText());
            String editorial= jtEditorial.getText();
            int anio= Integer.valueOf(jtAnio.getText());

            //Creamos y añadimos un libro a la coleccion de libros
            biblioteca.nuevoLibro(titulo, edicion, editorial, anio);
            
            //Limpiamos lo ingresado
            jtTitulo.setText("");
            jtEdicion.setText("");
            jtEditorial.setText("");
            jtAnio.setText("");
            
            jlMensaje.setForeground(new Color(0,204,102));
            jlMensaje.setText("Libro Agregado Correctamente");
        }catch(Exception e){
            
            //Limpiamos lo ingresado
            jtTitulo.setText("");
            jtEdicion.setText("");
            jtEditorial.setText("");
            jtAnio.setText("");
            
            jlMensaje.setForeground(new Color(255,0,0));
            jlMensaje.setText("Error! Verifique los datos ingresados");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtEdicion;
    private javax.swing.JTextField jtEditorial;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
}
