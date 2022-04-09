package paneles;
import datos1.Biblioteca;
import datos1.Docente;
import datos1.Estudiante;
import datos1.Socio;

public class QuitarSocio extends javax.swing.JPanel {
    private Biblioteca biblioteca;
    public QuitarSocio(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcLista = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbQuitar = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();
        jcEstudiante = new javax.swing.JCheckBox();
        jcDocente = new javax.swing.JCheckBox();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 60, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Quitar Socio:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jpFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jcLista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ningun Seleccionado" }));
        jpFondo.add(jcLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 340, 40));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Desea eliminar a un:");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jbQuitar.setBackground(new java.awt.Color(239, 60, 78));
        jbQuitar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jbQuitar.setForeground(new java.awt.Color(255, 255, 255));
        jbQuitar.setText("Quitar");
        jbQuitar.setBorderPainted(false);
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });
        jpFondo.add(jbQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 40));

        jlMensaje.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 440, 50));

        jcEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcEstudiante.setText("Estudiante");
        jcEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstudianteActionPerformed(evt);
            }
        });
        jpFondo.add(jcEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jcDocente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcDocente.setText("Docente");
        jcDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDocenteActionPerformed(evt);
            }
        });
        jpFondo.add(jcDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jPanel1.add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        //Verifica si se a seleccionado algun jCheckBox
        if(jcEstudiante.isSelected() || jcDocente.isSelected()){
            //Verifica si se a seleccionado algún socio de la lista
            if(jcLista.getSelectedIndex() != 0){
                
                //En caso de seleccionar un socio de Tipo Estudiante
                if(jcEstudiante.isSelected()){
                    Estudiante eliminar=null;
                    for(Socio socio: biblioteca.getSocios()){
                        if(socio.getNombre().equals(jcLista.getSelectedItem().toString()) && socio.soyDeLaClase().equals("Estudiante")){
                            eliminar= (Estudiante)socio;
                        }
                    }
                    
                    //Si el Estudiante no posee ningún libro se quita de la coleccion de socios
                    if(eliminar != null){
                        if(eliminar.cantLibrosPrestados()==0){
                            biblioteca.removeSocio(eliminar);
                        }
                    }
                }
                              
                //En caso de seleccionar un socio de Tipo Estudiante
                if(jcDocente.isSelected()){
                    Docente eliminar=null;
                    for(Socio socio: biblioteca.getSocios()){
                        if(socio.getNombre().equals(jcLista.getSelectedItem().toString()) && socio.soyDeLaClase().equals("Docente")){
                            eliminar= (Docente)socio;
                        }
                    }
                    
                    //Si el Docente no posee ningún libro se quita de la coleccion de socios
                    if(eliminar != null){
                        if(eliminar.cantLibrosPrestados()==0){
                            biblioteca.removeSocio(eliminar);
                        }
                    }
                }
            }    
        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    //Se encarga de cargar los Docentes al jComboBox
    private void jcDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDocenteActionPerformed
       for(Socio socio: biblioteca.getSocios()){
            if(socio.soyDeLaClase().equals("Docente")){
                jcLista.addItem(socio.getNombre());
            }
         }
         jcEstudiante.setEnabled(false);
    }//GEN-LAST:event_jcDocenteActionPerformed

    //Se encarga de cargar los Estudiantes al JComboBox
    private void jcEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstudianteActionPerformed
        for(Socio socio: biblioteca.getSocios()){
            if(socio.soyDeLaClase().equals("Estudiante")){
                jcLista.addItem(socio.getNombre());
            }
        }
        jcDocente.setEnabled(false);
    }//GEN-LAST:event_jcEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JCheckBox jcDocente;
    private javax.swing.JCheckBox jcEstudiante;
    private javax.swing.JComboBox<String> jcLista;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables
}
