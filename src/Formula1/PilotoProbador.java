/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

public class PilotoProbador extends Piloto{

    public PilotoProbador(String n, String a, DatosPersonales d, CaracteristicasTecnicasPiloto c) {
        super(n, a, d, c);
        sueldo = calcularSueldo();
    }
    
    public void mejorar(){
        caracteristicasTecnicas.mejorar((float) 0.05);
    }

    public float calcularSueldo() {
        return 50 * caracteristicasTecnicas.getSumaCaracteristicas();
    }
    
}
