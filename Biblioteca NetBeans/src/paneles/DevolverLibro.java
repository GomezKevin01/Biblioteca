package paneles;

import datos1.*;
import java.awt.Color;

public class DevolverLibro extends javax.swing.JPanel {    
    private Biblioteca biblioteca;

    public DevolverLibro(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        cargarLibrosPrestados();
    }

    //Se encarga de cargar la lista de Libros Prestados al jComboBox
    public void cargarLibrosPrestados(){
        for(Libro libro: biblioteca.getLibros()){
            if(libro.prestado()){
                jcLibro.addItem(libro.getTitulo());
            }
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
        jLabel2 = new javax.swing.JLabel();
        jbMostrar = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(239, 60, 78));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Devolver Libro");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jcLibro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Ninguno-" }));
        jPanel3.add(jcLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 460, 50));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Seleccione un Libro:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jbMostrar.setBackground(new java.awt.Color(239, 60, 78));
        jbMostrar.setFont(new java.awt.Font("Decker", 1, 20)); // NOI18N
        jbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbMostrar.setText("Devolver");
        jbMostrar.setBorderPainted(false);
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 130, 40));

        jlMensaje.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jPanel3.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 460, 40));

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

 //Evento encargado de Devolver un Libro a la Biblioteca   
    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        Libro libroDevolver=null;
        
        try{
            //Recorre la coleccion de libros para encontrar el libro que se desea devolver
            for(Libro libro: biblioteca.getLibros()){
                if(libro.getTitulo().equals(jcLibro.getSelectedItem().toString()) && libro.prestado()){
                    libroDevolver= libro;
                }                
            }
            //Devolvemos el libro
            biblioteca.devolverLibro(libroDevolver);
            
            //Eliminamos el contenido del JComboBox
            jcLibro.removeAllItems();
            
            //Agregamos un item al JComboBox
            jcLibro.addItem("-Ninguno-");
            
            //Posicionamos el jComboBox al indice 0
            jcLibro.setSelectedIndex(0);
            
            //Actualizamos el contenido jComboBox
            cargarLibrosPrestados();
            
            //Mostramos mensaje
            jlMensaje.setForeground(new Color(0,204,102));
            jlMensaje.setText("Libro Devolvido con Éxito");
        } catch(Exception e){
            //Posicionamos el jComboBox al indice 0
            jcLibro.setSelectedIndex(0);
            
            //Mostramos mensaje
            jlMensaje.setForeground(new Color(255,0,0));
            jlMensaje.setText("Error! Debe Seleccionar algún Libro");
        }
    }//GEN-LAST:event_jbMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JComboBox<String> jcLibro;
    private javax.swing.JLabel jlMensaje;
    // End of variables declaration//GEN-END:variables
}
