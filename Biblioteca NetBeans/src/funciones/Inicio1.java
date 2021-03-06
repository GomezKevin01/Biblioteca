/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import datos1.*;

/**
 *
 * @author Usuario
 */
public class Inicio1 extends javax.swing.JInternalFrame {

    private Biblioteca biblioteca;
    /**
     * Creates new form Inicio1
     */
    public Inicio1(Biblioteca p_biblio) {
        biblioteca = p_biblio;
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cargarDatosInforme();
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
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlPrestVenci = new javax.swing.JLabel();
        jlLibros = new javax.swing.JLabel();
        jlEstudiantes = new javax.swing.JLabel();
        jlDocentes = new javax.swing.JLabel();
        jlDocenResp = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(239, 60, 78));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Decker", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("BIENVENIDO!");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 314, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 30, 46)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Informe");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 21, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cantidad de Prestamos Vencidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Cantidad de Libros:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Cantidad de Socios Estudiantes:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Cantidad de Socios Docentes:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cantidad de Docentes Responsables:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jlPrestVenci.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlPrestVenci.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jlPrestVenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 30, 20));

        jlLibros.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlLibros.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jlLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 30, 20));

        jlEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlEstudiantes.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jlEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 20));

        jlDocentes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlDocentes.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jlDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 30, 20));

        jlDocenResp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlDocenResp.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jlDocenResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 320, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void cargarDatosInforme(){
        jlLibros.setText(String.valueOf(biblioteca.getLibros().size()));
        jlEstudiantes.setText(String.valueOf(biblioteca.cantidadDeSociosPorTipo("Estudiante")));
        jlDocentes.setText(String.valueOf(biblioteca.cantidadDeSociosPorTipo("Docente")));
        jlDocenResp.setText(String.valueOf(biblioteca.docentesResponsables().size()));
        jlPrestVenci.setText(String.valueOf(biblioteca.prestamosVencidos().size()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlDocenResp;
    private javax.swing.JLabel jlDocentes;
    private javax.swing.JLabel jlEstudiantes;
    private javax.swing.JLabel jlLibros;
    private javax.swing.JLabel jlPrestVenci;
    // End of variables declaration//GEN-END:variables
}
