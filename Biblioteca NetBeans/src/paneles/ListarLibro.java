package paneles;

import datos1.Biblioteca;

public class ListarLibro extends javax.swing.JPanel {
    
    private Biblioteca biblioteca;

    public ListarLibro(Biblioteca p_biblio) {
        biblioteca= p_biblio;
        initComponents();
        cargarLibros();
    }

    
    public void cargarLibros(){
        //Verifica si se han ingresado libros
        if(biblioteca.getLibros().size()>0){
            //Muestra lista de libros contenidos en la clase Biblioteca
            jtMostrar.append(biblioteca.listaDeLibros());
        }else{
            //Sino, muestra mensaje de que no se ingreso ningun libro
            jtMostrar.append("No se a ingresado ningún Libro");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMostrar = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 60, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Lista de Libros");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jtMostrar.setColumns(20);
        jtMostrar.setRows(5);
        jtMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 60, 78)));
        jScrollPane1.setViewportView(jtMostrar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 390, 380));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtMostrar;
    // End of variables declaration//GEN-END:variables
}
