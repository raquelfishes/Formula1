/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

public class PilotoOficial extends Piloto{
    
    int plusPeligrosidad;
    
    public PilotoOficial(String n, String a, DatosPersonales d, CaracteristicasTecnicasPiloto c) {
        super(n, a, d, c);
        sueldo = calcularSueldo();
    }

    public float calcularSueldo() {
        return 50 * caracteristicasTecnicas.getSumaCaracteristicas() + plusPeligrosidad; 
    }

    public void mejorar() {
       caracteristicasTecnicas.mejorar((float) 0.1);
    }
    
}
