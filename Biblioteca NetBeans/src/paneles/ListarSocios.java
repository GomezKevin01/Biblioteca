package paneles;

import datos1.Biblioteca;

public class ListarSocios extends javax.swing.JPanel {

    private Biblioteca biblioteca;

    public ListarSocios(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        cargarSocios();
    }

    public void cargarSocios(){
        //Verifica si existen socios en la clase Biblioteca
        if(biblioteca.getSocios().size()>0){
            //Muestra la lista de Socios
            jtMostrar.append(biblioteca.listaDeSocios());
        }else{
            //Si no, muestra mensaje de que no se ingreso ningun socio
            jtMostrar.append("No se a ingresado ningún Socio");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMostrar = new javax.swing.JTextArea();

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 60, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Lista de Socios:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtMostrar.setColumns(20);
        jtMostrar.setRows(5);
        jtMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 60, 78)));
        jScrollPane1.setViewportView(jtMostrar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 570, 380));

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

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtMostrar;
    // End of variables declaration//GEN-END:variables
}
