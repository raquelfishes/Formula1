/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pEditarAlumno.java
 *
 * Created on 06-dic-2010, 19:22:45
 */

package Formula1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author AlbertoMartin
 */
public class jpAñadeEscuderia extends javax.swing.JPanel implements Enum {

    /** Creates new form pEditarAlumno */
    public jpAñadeEscuderia() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        lPais = new javax.swing.JLabel();
        tPais = new javax.swing.JTextField();
        lAnyoFundacion = new javax.swing.JLabel();
        tAnyoFundacion = new javax.swing.JTextField();
        lPresupuesto = new javax.swing.JLabel();
        tPresupuesto = new javax.swing.JTextField();
        lDirectivos = new javax.swing.JLabel();
        tDirectivos = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Escuderia"));

        lNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNombre.setText("Nombre:");

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        lPais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lPais.setText("Pais:");

        lAnyoFundacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lAnyoFundacion.setText("Año Fundación:");

        lPresupuesto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lPresupuesto.setText("Presupuesto:");

        lDirectivos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lDirectivos.setText("Directivos (Separar por comas):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lDirectivos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNombre)
                            .addComponent(lPais))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tPais)
                            .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAnyoFundacion)
                            .addComponent(lPresupuesto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tPresupuesto)
                            .addComponent(tAnyoFundacion, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tDirectivos, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPais)
                    .addComponent(tPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAnyoFundacion)
                    .addComponent(tAnyoFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPresupuesto)
                    .addComponent(tPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDirectivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tDirectivos, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    public String getNombre () {
        String s= "Sin Nombre";
        if (!tNombre.getText().equals("")){
            return tNombre.getText();
        }else{
            return s;
        }
    }
    
    public String getPais () {
        String s= "Sin Pais";
        if (!tPais.getText().equals("")){
            return tPais.getText();
        }else{
            return s;
        }
    }
    
    public int getAnyoFundacion () {
        int s= 0;
        if (!tAnyoFundacion.getText().equals("")){
            return Integer.parseInt(tAnyoFundacion.getText());
        }else{
            return s;
        }
        
        
    }
    
    public int getPresupuesto () {
        int s=0;
        if (!tPresupuesto.getText().equals("")){
            return Integer.parseInt(tPresupuesto.getText());
        }else{
            return s;
        }               
    }
    
    public String[] getDirectivos () {
        String[] s = null;
        if (!tDirectivos.getText().equals("")){
            return tDirectivos.getText().split(",");
        }else{
            return s;
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel lAnyoFundacion;
    private javax.swing.JLabel lDirectivos;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPais;
    private javax.swing.JLabel lPresupuesto;
    private javax.swing.JTextField tAnyoFundacion;
    private javax.swing.JTextField tDirectivos;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPais;
    private javax.swing.JTextField tPresupuesto;
    // End of variables declaration//GEN-END:variables

}
