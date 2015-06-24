
package Formula1;

import java.io.*;
import javax.swing.JOptionPane;

public class Formula1UI extends javax.swing.JFrame {

    static Formula1 formula1;
    public Formula1UI() {
        formula1 = new Formula1();
        initComponents();
        this.setTitle ("Formula 1");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAdministrador = new javax.swing.JButton();
        bEscuderia = new javax.swing.JButton();
        bMundial = new javax.swing.JButton();
        bGuarda = new javax.swing.JButton();
        bCargar = new javax.swing.JButton();
        jAviso = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAdministrador.setText("Administrador");
        bAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdministradorActionPerformed(evt);
            }
        });

        bEscuderia.setText("Escuderia");
        bEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEscuderiaActionPerformed(evt);
            }
        });

        bMundial.setText("Mundial URJC");
        bMundial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMundialActionPerformed(evt);
            }
        });

        bGuarda.setText("Guardar Formula 1");
        bGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardaActionPerformed(evt);
            }
        });

        bCargar.setText("Cargar Formula 1");
        bCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarActionPerformed(evt);
            }
        });

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formula1/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bMundial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAdministrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(bGuarda)
                        .addGap(27, 27, 27)
                        .addComponent(bCargar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagen)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Imagen)
                .addGap(18, 18, 18)
                .addComponent(bAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEscuderia)
                .addGap(13, 13, 13)
                .addComponent(bMundial)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCargar)
                    .addComponent(bGuarda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEscuderiaActionPerformed
        if(!Formula1UI.formula1.escuderias.isEmpty()){
            jpConsultaEscuderia pConsulta = new jpConsultaEscuderia();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Informacion Escuderia",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    if ((pConsulta.getNumero()>0) && (pConsulta.getNumero()<Formula1UI.formula1.escuderias.size()+1)){
                        jAviso.setText ("");
                        jpEscuderia pEscudria = new jpEscuderia(pConsulta.getNumero());
                        pEscudria.setVisible(true);
                    }else{
                        jAviso.setText ("El identificador de escuderia no es correcto");
                    }
            }
        }else{
           jAviso.setText ("No hay escuderias");
        }
    }//GEN-LAST:event_bEscuderiaActionPerformed

    private void bMundialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMundialActionPerformed
        jpMundial pMundial = new jpMundial();
        formula1.crearMundial();
        pMundial.setVisible (true);
    }//GEN-LAST:event_bMundialActionPerformed

    private void bAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdministradorActionPerformed
        jpAdmin pAdmin = new jpAdmin();
        pAdmin.setVisible (true);
    }//GEN-LAST:event_bAdministradorActionPerformed

    private void bGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardaActionPerformed
        pArchivo archivo = new pArchivo();

        if(JOptionPane.showConfirmDialog(this, archivo, "Introduzca directorio",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
        == JOptionPane.OK_OPTION){
        Ficheros fichero= new Ficheros();
        try {
            fichero.abrirEscribir(archivo.getDirectorio());
            fichero.escribir(formula1);
            fichero.cerrar();
            jAviso.setText ("Se ha guardado Formula 1 en: " + archivo.getDirectorio());
        } catch (FileNotFoundException ex1) {
            jAviso.setText(ex1.getMessage());
        } catch (IOException ex2) {
            jAviso.setText(ex2.getMessage());
            System.out.println(ex2.getMessage());
        }
        }
    }//GEN-LAST:event_bGuardaActionPerformed

    private void bCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarActionPerformed
        pArchivo archivo = new pArchivo();

        if(JOptionPane.showConfirmDialog(this, archivo, "Introduzca directorio",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
        == JOptionPane.OK_OPTION){
            try {
                Ficheros fichero = new Ficheros();
                fichero.abrirLeer(archivo.getDirectorio());
                formula1 = fichero.leer();
                fichero.cerrar();
                jAviso.setText("Se ha cargado " + archivo.getDirectorio());
            } catch (IOException ex) {
                jAviso.setText(ex.getMessage());
            } catch (ClassNotFoundException ex1) {
                jAviso.setText(ex1.getMessage());
            }

        }
    }//GEN-LAST:event_bCargarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formula1UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton bAdministrador;
    private javax.swing.JButton bCargar;
    private javax.swing.JButton bEscuderia;
    private javax.swing.JButton bGuarda;
    private javax.swing.JButton bMundial;
    private javax.swing.JLabel jAviso;
    // End of variables declaration//GEN-END:variables

}
