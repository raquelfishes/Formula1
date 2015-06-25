package Formula1;

import javax.swing.JOptionPane;

public class jpEscuderia extends javax.swing.JFrame {

    static int id;
    
    public jpEscuderia(int idEscuderia) {
        initComponents();
        id = idEscuderia;
        this.setTitle ("Dueño Escuderia");
        setDefaultCloseOperation(jpEscuderia.DISPOSE_ON_CLOSE);
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
        bInfoEscuderia = new javax.swing.JRadioButton();
        bElegirPilotoyCoche = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        bDescartarPiloto = new javax.swing.JRadioButton();
        bFicharPilotoLibre = new javax.swing.JRadioButton();
        bFicharPilotoOtra = new javax.swing.JRadioButton();
        bIntercambioPiloto = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        bAnyadirCoche = new javax.swing.JRadioButton();
        bBorrarCoche = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        Accion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bEntrenar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dueño Escuderia"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escuderia:"));
        jPanel2.setToolTipText("");

        Agrupados.add(bInfoEscuderia);
        bInfoEscuderia.setText("Informacion");

        Agrupados.add(bElegirPilotoyCoche);
        bElegirPilotoyCoche.setText("Elegir coche y piloto para mundial");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bInfoEscuderia)
                    .addComponent(bElegirPilotoyCoche))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bInfoEscuderia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bElegirPilotoyCoche)
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilotos:"));

        Agrupados.add(bDescartarPiloto);
        bDescartarPiloto.setText("Descartar piloto");

        Agrupados.add(bFicharPilotoLibre);
        bFicharPilotoLibre.setText("Fichar piloto libre");

        Agrupados.add(bFicharPilotoOtra);
        bFicharPilotoOtra.setText("Fichar piloto de otra escuderia");

        Agrupados.add(bIntercambioPiloto);
        bIntercambioPiloto.setText("Intercambiar piloto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDescartarPiloto)
                    .addComponent(bFicharPilotoLibre)
                    .addComponent(bFicharPilotoOtra)
                    .addComponent(bIntercambioPiloto)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(bDescartarPiloto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bFicharPilotoLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bFicharPilotoOtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bIntercambioPiloto))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Coches:"));

        Agrupados.add(bAnyadirCoche);
        bAnyadirCoche.setText("Crear coche");

        Agrupados.add(bBorrarCoche);
        bBorrarCoche.setText("Dar de baja coche");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirCoche)
                    .addComponent(bBorrarCoche))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAnyadirCoche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarCoche))
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrenamiento:"));

        Agrupados.add(bEntrenar);
        bEntrenar.setText("Entrenar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bEntrenar)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bEntrenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Accion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Accion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionActionPerformed

    /* Coche */
        // Crea Coche
        if(bAnyadirCoche.isSelected()){
            jpAñadeCoche pAñade = new jpAñadeCoche();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Coche",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {         
                Coche coche = new Coche(pAñade.getModelo(), pAñade.getCaracteristicasTecnicas());
                Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).anyadirCoche(coche));
            }
        }
        // Borra Coche
        else if(bBorrarCoche.isSelected()){
            jpBorraCoche pBorrar = new jpBorraCoche(id-1);
            if(JOptionPane.showConfirmDialog(this, pBorrar, "Regalar Coche",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {         
                Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).borrarCoche(pBorrar.getId()));
            }
        }
    /* Entrenar */
        else if(bEntrenar.isSelected()){
            jpConsultaCircuito pCircuito = new jpConsultaCircuito();
            if(JOptionPane.showConfirmDialog(this, pCircuito, "Elige Circuito",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION){ 
                if((pCircuito.getNumero()> 0) && (pCircuito.getNumero()< Formula1UI.formula1.numeroCircuitos())){
                    // Si tenemos presupuesto
                    float canon = Formula1UI.formula1.circuitos.get(pCircuito.getNumero()-1).getCanon();
                    if(Formula1UI.formula1.escuderias.get(id-1).presupuestoValor(canon)){
                        jpConsultaCoche pCoche = new jpConsultaCoche(id-1);
                        if(JOptionPane.showConfirmDialog(this, pCoche, "Elige Coche",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                        == JOptionPane.OK_OPTION) {
                            jpPilotoEscuderia pPiloto = new jpPilotoEscuderia(id-1);
                            if(JOptionPane.showConfirmDialog(this, pPiloto, "Elige Piloto",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                            == JOptionPane.OK_OPTION) {
                                boolean correcto =false;
                                Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).entrenar(pPiloto.getNumero(),pCoche.getId(), correcto));
                                if(correcto){
                                    Formula1UI.formula1.escuderias.get(id-1).pagarValor(canon);
                                    Resultados.setText(Resultados.getText()+"\n"+"Has pagado "+canon+" euros por entrenar en este circuito");
                                }
                            }
                        }
                    }else{
                         Resultados.setText ("No tiene presupuesto para este circuito");   
                    } 
                }else{
                    Resultados.setText ("El identifcador de circuito no es correcto");
                }
            }
        }
    /* Piloto */
        // Descartar Piloto
        else if(bDescartarPiloto.isSelected()){
            jpPilotoEscuderia pPiloto = new jpPilotoEscuderia(id-1);
            if(JOptionPane.showConfirmDialog(this, pPiloto, "Elige Piloto",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                Piloto piloto=null;
                Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).descartarPiloto(pPiloto.getNumero(), piloto));
                // Si se ha descartado con exito lo volvemos a poner en la lista de pilotos libres
                if(piloto != null) Formula1UI.formula1.añadirPiloto(piloto);
            }
        }
        // Fichar piloto libre
        else if(bFicharPilotoLibre.isSelected()){
            jpFicharPiloto pPiloto = new jpFicharPiloto();
            if(JOptionPane.showConfirmDialog(this, pPiloto, "Ficha a Piloto",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                int idPil = pPiloto.getNumero();
                if((idPil>0) && (idPil< Formula1UI.formula1.numeroPilotos()+1)){
                    // Decidimos si ficharlo como oficial o probador
                    if(pPiloto.getOficial()){                    
                        PilotoOficial piloto = new PilotoOficial(Formula1UI.formula1.pilotos.get(idPil-1));
                        if(Formula1UI.formula1.escuderias.get(id-1).posibleFichar(piloto)) Formula1UI.formula1.pilotos.remove(idPil-1);
                        Resultados.setText(Formula1UI.formula1.escuderias.get(id-1).ficharPiloto(piloto));               
                    }else{                   
                        PilotoProbador piloto = new PilotoProbador(Formula1UI.formula1.pilotos.get(idPil-1));
                        if(Formula1UI.formula1.escuderias.get(id-1).posibleFichar(piloto)) Formula1UI.formula1.pilotos.remove(idPil-1);
                        Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).ficharPiloto(piloto));                        
                    }   
                    
                }else{               
                    Resultados.setText("No existe ese identificador de Piloto");
                }
            }
        }
        // Robar piloto a otra escudería
        else if(bFicharPilotoOtra.isSelected()){
            if(Formula1UI.formula1.numeroEscuderias() > 1){
                jpRobarPiloto pPiloto = new jpRobarPiloto(id);
                if(JOptionPane.showConfirmDialog(this, pPiloto, "Ficha a Piloto de otra escuderia",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    int idPil = pPiloto.getNumero();
                    int idEsc = pPiloto.getEscuderia();
                    if( idPil != -1){
                        // Dicidimos si ficharlo como oficial o probador
                        if(pPiloto.getOficial()){
                            PilotoOficial piloto = new PilotoOficial(Formula1UI.formula1.escuderias.get(idEsc).getOficiales().get(idPil).getPiloto());
                            if(Formula1UI.formula1.escuderias.get(id-1).posibleFichar(piloto)) 
                                if(pPiloto.oficial()){
                                    Formula1UI.formula1.escuderias.get(idEsc).removeOfic(idPil);
                                }else{
                                    Formula1UI.formula1.escuderias.get(idEsc).removeProb(idPil);
                                }
                            Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).ficharPiloto(piloto));                 
                        }else{                   
                            PilotoProbador piloto = new PilotoProbador(Formula1UI.formula1.escuderias.get(idEsc).getProbadores().get(idPil).getPiloto());
                            if(Formula1UI.formula1.escuderias.get(id-1).posibleFichar(piloto)) 
                                if(pPiloto.oficial()){
                                    Formula1UI.formula1.escuderias.get(idEsc).removeOfic(idPil);
                                }else{
                                    Formula1UI.formula1.escuderias.get(idEsc).removeProb(idPil);
                                }
                            Resultados.setText (Formula1UI.formula1.escuderias.get(id-1).ficharPiloto(piloto));                    
                        }                       
                    }else{               
                        Resultados.setText("No existe ese identificador de Piloto");
                    }
                }
            }else{
                Resultados.setText("No hay mas escuderias");
            }
        }
        // Cambiar piloto a otra escudería
        else if(bIntercambioPiloto.isSelected()){
            if((Formula1UI.formula1.numeroEscuderias() > 1) || (Formula1UI.formula1.escuderias.get(id-1).getNumPilotos() > 0)){
                jpIntercambioPiloto pPiloto = new jpIntercambioPiloto(id);
                if(JOptionPane.showConfirmDialog(this, pPiloto, "Cambiar por Piloto de otra escuderia",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    int idPilT = pPiloto.getTraigo();
                    int idPilC = pPiloto.getCedo();
                    int idEsc = pPiloto.getEscuderia();
                    if((idPilT != -1) && (idPilC != -1)){
                        float val1;
                        float val2;
                        if(pPiloto.getOficial()){ 
                            val1= Formula1UI.formula1.escuderias.get(id-1).getOficiales().get(idPilC).getCaracteristicasTecnicas().getSumaCaracteristicas();
                        }else{
                            val1= Formula1UI.formula1.escuderias.get(id-1).getProbadores().get(idPilC).getCaracteristicasTecnicas().getSumaCaracteristicas();
                        }
                        
                        if(pPiloto.oficial()){ 
                            val2= Formula1UI.formula1.escuderias.get(idEsc).getOficiales().get(idPilT).getCaracteristicasTecnicas().getSumaCaracteristicas();
                        }else{
                            val2= Formula1UI.formula1.escuderias.get(idEsc).getProbadores().get(idPilT).getCaracteristicasTecnicas().getSumaCaracteristicas();
                        }
                        
                        if(Formula1UI.formula1.escuderias.get(id-1).posibleCambiar(val1,val2)){
                            // Dicidimos si ficharlo como oficial o probador
                            if(pPiloto.getOficial()){
                                PilotoOficial piloto;                               
                                    if(pPiloto.oficial()){
                                        piloto = new PilotoOficial(Formula1UI.formula1.escuderias.get(idEsc).getOficiales().get(idPilT).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).removeOfic(idPilT);
                                        Formula1UI.formula1.escuderias.get(idEsc).intercambiarPiloto(Formula1UI.formula1.escuderias.get(id-1).getOficiales().get(idPilC));                                 
                                    }else{
                                        piloto = new PilotoOficial(Formula1UI.formula1.escuderias.get(idEsc).getProbadores().get(idPilT).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).removeProb(idPilT);
                                        PilotoProbador pilotoCedido = new PilotoProbador(Formula1UI.formula1.escuderias.get(id-1).getOficiales().get(idPilC).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).intercambiarPiloto(pilotoCedido);                                  
                                    }
                                    Formula1UI.formula1.escuderias.get(id-1).removeOfic(idPilC);
                                    Formula1UI.formula1.escuderias.get(id-1).intercambiarPiloto(piloto);
                                    Resultados.setText ("Se ha realizado el intercambio");              
                            }else{                   
                                PilotoProbador piloto;
                                    if(pPiloto.oficial()){
                                        piloto = new PilotoProbador(Formula1UI.formula1.escuderias.get(idEsc).getOficiales().get(idPilT).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).removeOfic(idPilT);
                                        PilotoOficial pilotoCedido = new PilotoOficial(Formula1UI.formula1.escuderias.get(id-1).getProbadores().get(idPilC).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).intercambiarPiloto(pilotoCedido);                                 
                                    }else{
                                        piloto = new PilotoProbador(Formula1UI.formula1.escuderias.get(idEsc).getProbadores().get(idPilT).getPiloto());
                                        Formula1UI.formula1.escuderias.get(idEsc).removeProb(idPilT);                     
                                        Formula1UI.formula1.escuderias.get(idEsc).intercambiarPiloto(Formula1UI.formula1.escuderias.get(id-1).getProbadores().get(idPilC));                                  
                                    }
                                    Formula1UI.formula1.escuderias.get(id-1).removeProb(idPilC);
                                    Formula1UI.formula1.escuderias.get(id-1).intercambiarPiloto(piloto);
                                    Resultados.setText ("Se ha realizado el intercambio");                                                 
                            } 
                        }else{
                            Resultados.setText ("No ha podido realizarse, sobrepasan el 10% de valoracion"); 
                        }
                    }else{               
                        Resultados.setText("No has seleccionado un piloto");
                    }
                }
            }else{
                Resultados.setText("No hay mas escuderias o no tienes pilotos para cambiar");
            }
        }
    /* Escuderia */
        // Info Escuderia
        else if(bInfoEscuderia.isSelected()){
            Escuderia escuderia=Formula1UI.formula1.escuderias.get(id-1);
            Resultados.setText (escuderia.toString());
        }
}//GEN-LAST:event_AccionActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jpEscuderia(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion;
    private javax.swing.ButtonGroup Agrupados;
    private javax.swing.JTextArea Resultados;
    private javax.swing.JRadioButton bAnyadirCoche;
    private javax.swing.JRadioButton bBorrarCoche;
    private javax.swing.JRadioButton bDescartarPiloto;
    private javax.swing.JRadioButton bElegirPilotoyCoche;
    private javax.swing.JRadioButton bEntrenar;
    private javax.swing.JRadioButton bFicharPilotoLibre;
    private javax.swing.JRadioButton bFicharPilotoOtra;
    private javax.swing.JRadioButton bInfoEscuderia;
    private javax.swing.JRadioButton bIntercambioPiloto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
