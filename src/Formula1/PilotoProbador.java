/*
 * 
 * 
 * 
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
    
    public Piloto getPiloto(){
        return super.getPiloto();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
