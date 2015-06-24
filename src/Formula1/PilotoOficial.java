/*
 * 
 * 
 * 
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
    
    public Piloto getPiloto(){
        return super.getPiloto();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
