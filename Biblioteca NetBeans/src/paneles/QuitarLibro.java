package paneles;
import datos1.*;
import java.awt.Color;

public class QuitarLibro extends javax.swing.JPanel {
    private Biblioteca biblioteca;
 
    public QuitarLibro(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        cargarLibros();
    }

    //Carga los libros al jComboBox recorriendo la coleccion de libros ubicada en Biblioteca
    public void cargarLibros(){
        for(Libro libro : biblioteca.getLibros()){
            jcLista.addItem(libro.getTitulo());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcLista = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 60, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Quitar Libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jpFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jcLista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        jpFondo.add(jcLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 340, 40));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Seleccione un Libro");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(239, 60, 78));
        jButton1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quitar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 40));

        jlMensaje.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 440, 50));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            if(jcLista.getSelectedIndex()==0){
                jlMensaje.setForeground(new Color(255,0,0));
            jlMensaje.setText("Seleccione Un Libro Primero");
            }else{
                Libro eliminar=null;
            for(Libro libro: biblioteca.getLibros()){
                if(libro.getTitulo().equals(jcLista.getSelectedItem().toString())){;
                    eliminar=libro;                                        
                }
            }
                    //Elimina el libro de la lista
                    biblioteca.removeLibro(eliminar);
                    
                     //Muestra mensaje
                    jlMensaje.setForeground(new Color(0,204,102));
                    jlMensaje.setText("Libro Eliminado Correctamente");
                    
                    jcLista.removeAllItems();
                    jcLista.addItem("Ninguno");
                            
                    cargarLibros();
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcLista;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables
}
