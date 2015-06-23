/*
 * jpI.java
 *
 * Created on 06-dic-2010, 19:48:51
 */

package Formula1;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class jpAdmin extends javax.swing.JFrame {

    
    public jpAdmin() {
        initComponents();
        this.setTitle ("Administrador");
        setDefaultCloseOperation(jpAdmin.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bAnyadirEscuderia = new javax.swing.JRadioButton();
        bModificarEscuderia = new javax.swing.JRadioButton();
        bBorrarEscuderia = new javax.swing.JRadioButton();
        bConsultarEscuderia = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        bAnyadirPiloto = new javax.swing.JRadioButton();
        bModificarPiloto = new javax.swing.JRadioButton();
        bBorrarPiloto = new javax.swing.JRadioButton();
        bConsultarPiloto = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        bAnyadirCircuito = new javax.swing.JRadioButton();
        bModificarCircuito = new javax.swing.JRadioButton();
        bBorrarCircuito = new javax.swing.JRadioButton();
        bConsultarCircuito = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        Accion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escuderias:"));
        jPanel2.setToolTipText("");

        Agrupados.add(bAnyadirEscuderia);
        bAnyadirEscuderia.setText("Añadir Escuderia");
        bAnyadirEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnyadirEscuderiaActionPerformed(evt);
            }
        });

        Agrupados.add(bModificarEscuderia);
        bModificarEscuderia.setText("Modificar Escuderia");
        bModificarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarEscuderiaActionPerformed(evt);
            }
        });

        Agrupados.add(bBorrarEscuderia);
        bBorrarEscuderia.setText("Borrar Escuderia");

        Agrupados.add(bConsultarEscuderia);
        bConsultarEscuderia.setText("Consultar Escuderia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirEscuderia)
                    .addComponent(bModificarEscuderia)
                    .addComponent(bBorrarEscuderia)
                    .addComponent(bConsultarEscuderia))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bAnyadirEscuderia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarEscuderia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarEscuderia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarEscuderia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilotos:"));

        Agrupados.add(bAnyadirPiloto);
        bAnyadirPiloto.setText("Añadir Piloto");

        Agrupados.add(bModificarPiloto);
        bModificarPiloto.setText("Modificar Piloto");

        Agrupados.add(bBorrarPiloto);
        bBorrarPiloto.setText("Borrar Piloto");

        Agrupados.add(bConsultarPiloto);
        bConsultarPiloto.setText("Consultar Piloto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirPiloto)
                    .addComponent(bModificarPiloto)
                    .addComponent(bBorrarPiloto)
                    .addComponent(bConsultarPiloto))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bAnyadirPiloto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarPiloto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarPiloto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarPiloto)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Circuitos:"));

        Agrupados.add(bAnyadirCircuito);
        bAnyadirCircuito.setText("Añadir Circuito");

        Agrupados.add(bModificarCircuito);
        bModificarCircuito.setText("Modificar Circuito");

        Agrupados.add(bBorrarCircuito);
        bBorrarCircuito.setText("Borrar Circuito");

        Agrupados.add(bConsultarCircuito);
        bConsultarCircuito.setText("Consultar Circuito");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirCircuito)
                    .addComponent(bModificarCircuito)
                    .addComponent(bBorrarCircuito)
                    .addComponent(bConsultarCircuito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bAnyadirCircuito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarCircuito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarCircuito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarCircuito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Resultados.setColumns(20);
        Resultados.setRows(5);
        jScrollPane1.setViewportView(Resultados);

        Accion.setText("Realizar Accion");
        Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Accion))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Accion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionActionPerformed

    //Añade Escuderia
        if(bAnyadirEscuderia.isSelected()){
            jpAñadeEscuderia pAñade = new jpAñadeEscuderia();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Escuderia",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Escuderia escuderia = new Escuderia(pAñade.getNombre(), pAñade.getPais(),
                    pAñade.getAnyoFundacion(), pAñade.getPresupuesto(), pAñade.getDirectivos());
                Formula1UI.formula1.añadirEscuderia(escuderia);
                Resultados.setText ("La escuderia se ha insertado satisfactoriamente");
            }
        }
    //Modificar Escuderia
        else if(bModificarEscuderia.isSelected()){
          if(!Formula1UI.formula1.escuderias.isEmpty()){
            jpEditaEscuderia pEdita = new jpEditaEscuderia();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Escuderia",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    Formula1UI.formula1.modificarEscuderia(pEdita.getNumero()-1, pEdita.getNombre(), pEdita.getPais(),
                            pEdita.getAnyoFundacion(), pEdita.getPresupuesto());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("La escuderia se ha modificado satisfactoriamente");
            }
          }
        }
    //Borrar Escuderia
        else if(bBorrarEscuderia.isSelected()){
          if(!Formula1UI.formula1.escuderias.isEmpty()){
            jpBorraEscuderia pBorra = new jpBorraEscuderia();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Escuderia",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Escuderia escuderia=Formula1UI.formula1.escuderias.get(pBorra.getNumero()-1);
                    Formula1UI.formula1.borrarEscuderia(escuderia);
                    Resultados.setText ("La escuderia se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay escuderias");
            }
        }
    //Consultar Escuderia
        else if(bConsultarEscuderia.isSelected()){
          if(!Formula1UI.formula1.escuderias.isEmpty()){
            jpConsultaEscuderia pConsulta = new jpConsultaEscuderia();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Escuderia",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Escuderia escuderia=Formula1UI.formula1.escuderias.get(pConsulta.getNumero()-1);
                    Escuderia x= Formula1UI.formula1.consultarEscuderia(escuderia);
                    Resultados.setText (x.toString());
                }
            }else{
                Resultados.setText ("No hay escuderias");
            }
        }
        
    //Añade Piloto
        if(bAnyadirPiloto.isSelected()){
            jpAñadePiloto pAñade = new jpAñadePiloto();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Piloto",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Piloto piloto = new Piloto(pAñade.getNombre(), pAñade.getApellidos(),
                    pAñade.getDatosPersonales(), pAñade.getCaracteristicasTecnicas());
                Formula1UI.formula1.añadirPiloto(piloto);
                Resultados.setText ("El piloto se ha insertado satisfactoriamente");
            }
        }
    //Modificar Piloto
        else if(bModificarPiloto.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpEditaPiloto pEdita = new jpEditaPiloto();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Piloto",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    Formula1UI.formula1.modificarPiloto(pEdita.getNumero()-1, pEdita.getNombre(), 
                            pEdita.getApellidos(), pEdita.getDatosPersonales());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("El piloto se ha modificado satisfactoriamente");
            }
          }
        }
    //Borrar Piloto
        else if(bBorrarPiloto.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpBorraPiloto pBorra = new jpBorraPiloto();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Piloto",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Piloto piloto=Formula1UI.formula1.pilotos.get(pBorra.getNumero()-1);
                    Formula1UI.formula1.borrarPiloto(piloto);
                    Resultados.setText ("El piloto se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay pilotos");
            }
        }
    //Consultar Piloto
        else if(bConsultarPiloto.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpConsultaPiloto pConsulta = new jpConsultaPiloto();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Piloto",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Piloto piloto=Formula1UI.formula1.pilotos.get(pConsulta.getNumero()-1);
                    Piloto x= Formula1UI.formula1.consultarPiloto(piloto);
                    Resultados.setText (x.toString());
                }
            }else{
                Resultados.setText ("No hay pilotos");
            }
        }
        
    //Añade Circuito
        if(bAnyadirCircuito.isSelected()){
            jpAñadeCircuito pAñade = new jpAñadeCircuito();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Circuito",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Circuito circuito = new Circuito(pAñade.getNombre(), pAñade.getAforo(),
                    pAñade.getCanon(), pAñade.getNumRectas(), pAñade.getNumCurvas());
                Formula1UI.formula1.añadirCircuito(circuito);
                Resultados.setText ("El circuito se ha insertado satisfactoriamente");
            }
        }
    //Modificar Circuito
        else if(bModificarCircuito.isSelected()){
          if(!Formula1UI.formula1.circuitos.isEmpty()){
            jpEditaCircuito pEdita = new jpEditaCircuito();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Circuito",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    Formula1UI.formula1.modificarCircuito(pEdita.getNumero()-1, pEdita.getNombre(), 
                            pEdita.getAforo(), pEdita.getCanon());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("El circuito se ha modificado satisfactoriamente");
            }
          }
        }
    //Borrar Circuito
        else if(bBorrarCircuito.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpBorraCircuito pBorra = new jpBorraCircuito();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Circuito",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Circuito circuito=Formula1UI.formula1.circuitos.get(pBorra.getNumero()-1);
                    Formula1UI.formula1.borrarCircuito(circuito);
                    Resultados.setText ("El circuito se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay circuitos");
            }
        }
    //Consultar Circuito
        else if(bConsultarCircuito.isSelected()){
          if(!Formula1UI.formula1.circuitos.isEmpty()){
            jpConsultaCircuito pConsulta = new jpConsultaCircuito();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Circuito",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Circuito circuito=Formula1UI.formula1.circuitos.get(pConsulta.getNumero()-1);
                    Circuito x= Formula1UI.formula1.consultarCircuito(circuito);
                    Resultados.setText (x.toString());
                }
            }else{
                Resultados.setText ("No hay circuitos");
            }
        }
}//GEN-LAST:event_AccionActionPerformed

    private void bModificarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarEscuderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bModificarEscuderiaActionPerformed

    private void bAnyadirEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnyadirEscuderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnyadirEscuderiaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jpAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion;
    private javax.swing.ButtonGroup Agrupados;
    private javax.swing.JTextArea Resultados;
    private javax.swing.JRadioButton bAnyadirCircuito;
    private javax.swing.JRadioButton bAnyadirEscuderia;
    private javax.swing.JRadioButton bAnyadirPiloto;
    private javax.swing.JRadioButton bBorrarCircuito;
    private javax.swing.JRadioButton bBorrarEscuderia;
    private javax.swing.JRadioButton bBorrarPiloto;
    private javax.swing.JRadioButton bConsultarCircuito;
    private javax.swing.JRadioButton bConsultarEscuderia;
    private javax.swing.JRadioButton bConsultarPiloto;
    private javax.swing.JRadioButton bModificarCircuito;
    private javax.swing.JRadioButton bModificarEscuderia;
    private javax.swing.JRadioButton bModificarPiloto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
