/*
 * 
 * 
 * 
 */
package Formula1;

import java.util.ArrayList;
import java.util.Collections;

public class Carrera {
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
        clasificacion.add(p);
        Collections.sort(clasificacion);
        return t;
    }
    
    public void rellenarClasificacion(){
        for (int i=0; i<puntos.length; i++){
            clasificacion.get(i).setPuntosMundial(clasificacion.get(i).getPuntosMundial()+puntos[i]);
        }
    }   
    
    public Circuito getCircuito() {
        return circuito;
    }
}
