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
public class jpAñadePiloto extends javax.swing.JPanel implements Enum {

    /** Creates new form pEditarAlumno */
    public jpAñadePiloto() {
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
        lApellidos = new javax.swing.JLabel();
        tApellidos = new javax.swing.JTextField();
        lDatosPersonales = new javax.swing.JLabel();
        lEdad = new javax.swing.JLabel();
        tEdad = new javax.swing.JTextField();
        lAltura = new javax.swing.JLabel();
        tAltura = new javax.swing.JTextField();
        lPeso = new javax.swing.JLabel();
        tPeso = new javax.swing.JTextField();
        lCaracteristicasTecnicas = new javax.swing.JLabel();
        lReflejos = new javax.swing.JLabel();
        tReflejos = new javax.swing.JTextField();
        lAgresividad = new javax.swing.JLabel();
        tAgresividad = new javax.swing.JTextField();
        lPaciencia = new javax.swing.JLabel();
        tPaciencia = new javax.swing.JTextField();
        lValentia = new javax.swing.JLabel();
        tValentia = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Escuderia"));

        lNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNombre.setText("Nombre:");

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        lApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lApellidos.setText("Apellidos:");

        lDatosPersonales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lDatosPersonales.setText("Datos Personales:");

        lEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lEdad.setText("Edad:");

        lAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lAltura.setText("Altura:");

        lPeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lPeso.setText("Peso:");

        lCaracteristicasTecnicas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lCaracteristicasTecnicas.setText("Caracteristicas Tecnicas:");

        lReflejos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lReflejos.setText("Reflejos:");

        lAgresividad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lAgresividad.setText("Agresivida:");

        lPaciencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lPaciencia.setText("Paciencia:");

        lValentia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lValentia.setText("Valentia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNombre)
                                    .addComponent(lApellidos))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tApellidos)
                                    .addComponent(tNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDatosPersonales)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lAltura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lEdad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCaracteristicasTecnicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lReflejos)
                                .addGap(25, 25, 25)
                                .addComponent(tReflejos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lAgresividad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tAgresividad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lValentia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tValentia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lPaciencia)
                                    .addGap(18, 18, 18)
                                    .addComponent(tPaciencia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(21, Short.MAX_VALUE))))
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
                    .addComponent(lApellidos)
                    .addComponent(tApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDatosPersonales)
                    .addComponent(tEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCaracteristicasTecnicas)
                    .addComponent(tReflejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lReflejos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAgresividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAgresividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPaciencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPaciencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tValentia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lValentia))
                .addContainerGap(29, Short.MAX_VALUE))
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
    
    public String getApellidos () {
        String s= "Sin Apellidos";
        if (!tApellidos.getText().equals("")){
            return tApellidos.getText();
        }else{
            return s;
        }
    }
    
    public DatosPersonales getDatosPersonales() {
        int edad = 0;
        float altura = 0;
        float peso = 0;
        if (!tEdad.getText().equals("")){
            edad = Integer.parseInt(tEdad.getText());
        }
        if (!tAltura.getText().equals("")){
            altura = Float.parseFloat(tAltura.getText());
        }
        if (!tPeso.getText().equals("")){
            peso = Float.parseFloat(tPeso.getText());
        }
        return new DatosPersonales(edad,altura,peso);               
    }
    
    public CaracteristicasTecnicasPiloto getCaracteristicasTecnicas () {
        float reflejos = 0;
        float agresividad = 0;
        float paciencia = 0;
        float valentia = 0;
        if (!tReflejos.getText().equals("")){
            reflejos = Float.parseFloat(tReflejos.getText());
        }
        if (!tAgresividad.getText().equals("")){
            agresividad = Float.parseFloat(tAgresividad.getText());
        }
        if (!tPaciencia.getText().equals("")){
            paciencia = Float.parseFloat(tPaciencia.getText());
        }
        if (!tValentia.getText().equals("")){
            valentia = Float.parseFloat(tValentia.getText());
        }
        return new CaracteristicasTecnicasPiloto(reflejos,agresividad,paciencia,valentia);               
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel lAgresividad;
    private javax.swing.JLabel lAltura;
    private javax.swing.JLabel lApellidos;
    private javax.swing.JLabel lCaracteristicasTecnicas;
    private javax.swing.JLabel lDatosPersonales;
    private javax.swing.JLabel lEdad;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPaciencia;
    private javax.swing.JLabel lPeso;
    private javax.swing.JLabel lReflejos;
    private javax.swing.JLabel lValentia;
    private javax.swing.JTextField tAgresividad;
    private javax.swing.JTextField tAltura;
    private javax.swing.JTextField tApellidos;
    private javax.swing.JTextField tEdad;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPaciencia;
    private javax.swing.JTextField tPeso;
    private javax.swing.JTextField tReflejos;
    private javax.swing.JTextField tValentia;
    // End of variables declaration//GEN-END:variables

}
