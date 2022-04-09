package paneles;

import datos1.*;

public class QuienTieneElLibro extends javax.swing.JPanel {
    private Biblioteca biblioteca;

    public QuienTieneElLibro(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        cargarLibros();
        //Hace invisible el JLabel jtPoseedor
        jlPoseedor.setVisible(false);
        
    }
    
    //Carga los libros en el JComboBox recorriendo la coleccion ubica en Biblioteca 
    public void cargarLibros(){
        for(Libro libro : biblioteca.getLibros()){
            jcLibro.addItem(libro.getTitulo());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcLibro = new javax.swing.JComboBox<>();
        jlPoseedor = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtMostrar = new javax.swing.JTextField();
        jlMensaje = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, -1, 540));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(239, 60, 78));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Saber quién tiene el Libro");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jcLibro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Ninguno-" }));
        jPanel3.add(jcLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 460, 50));

        jlPoseedor.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlPoseedor.setForeground(new java.awt.Color(102, 102, 102));
        jlPoseedor.setText("Poseedor");
        jPanel3.add(jlPoseedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 20));

        jbBuscar.setBackground(new java.awt.Color(239, 60, 78));
        jbBuscar.setFont(new java.awt.Font("Decker", 1, 20)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.setBorderPainted(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 130, 40));

        jLabel3.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Seleccione un Libro:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jtMostrar.setFont(new java.awt.Font("Decker", 1, 20)); // NOI18N
        jtMostrar.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 460, 40));

        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 460, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 540));
    }// </editor-fold>//GEN-END:initComponents

    //Se encarga de mostrar el nombre del que poseedor del Libro
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Libro libroBuscar=null;
        
        //Recorre la coleccion de libros para encontrar el libro que se desea devolver
        for(Libro libro: biblioteca.getLibros()){
            if(libro.getTitulo().equals(jcLibro.getSelectedItem().toString())){
                libroBuscar= libro;
            }                
        }
        
        //Si el libro se encuentra prestado muestra la Leyenda "Poseedor" y su respectivo Nombre
        if(libroBuscar.prestado()){
            jlPoseedor.setVisible(true);
            jtMostrar.setText(biblioteca.quienTieneElLibro(libroBuscar));
        }
        else{
            //Sino, muestra la leyendo "Se encuentra en Biblioteca"
            jtMostrar.setText(biblioteca.quienTieneElLibro(libroBuscar));
        }        

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcLibro;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlPoseedor;
    private javax.swing.JTextField jtMostrar;
    // End of variables declaration//GEN-END:variables
}
