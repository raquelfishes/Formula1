/*
 * 
 * 
 * 
 */
package Formula1;

import java.io.Serializable;
import java.util.ArrayList;

public class Carrera implements Serializable{
    Circuito circuito;
    private int[] puntos = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    ArrayList<Piloto> clasificacion;
    
    public Carrera(Circuito c){
        circuito = c;
    }
    
    public float tiempoPiloto(Piloto p, Coche c){
        float t;
        t = c.calcularVelocidadRecta() * circuito.kilometrosRectas() + c.calcularVelocidadRecta() * circuito.kilometrosCurvas();
        t -= 0.1 * p.getCaracteristicasTecnicas().getSumaCaracteristicas();
        return t;
    }
    
    public void rellenarClasificacion(){
        
    }   
    
    public Circuito getCircuito() {
        return circuito;
    }
}
