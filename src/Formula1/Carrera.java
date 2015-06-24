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
    ArrayList<EquipoCarrera> clasificacion;
    
    public Carrera(Circuito c){
        circuito = c;
    }
    
    public float tiempoPiloto(EquipoCarrera equipo){
        float t;
        t = equipo.coche.calcularVelocidadRecta() * circuito.kilometrosRectas() + equipo.coche.calcularVelocidadRecta() * circuito.kilometrosCurvas();
        t -= 0.1 * equipo.piloto.getCaracteristicasTecnicas().getSumaCaracteristicas();
        equipo.tiempo = t;
        clasificacion.add(equipo);
        Collections.sort(clasificacion);
        return t;
    }
    
    public void rellenarClasificacion(ArrayList<Escuderia> escuderias){
        for (int i=0; i<puntos.length; i++){
            clasificacion.get(i).piloto.setPuntosMundial(clasificacion.get(i).piloto.getPuntosMundial()+puntos[i]);
            for (Escuderia escuderia:escuderias){
                if (escuderia.tienePiloto(clasificacion.get(i).piloto))
                    escuderia.setPuntosMundial(escuderia.getPuntosMundial()+puntos[i]);
            }
        }
    }   
    
    public Circuito getCircuito() {
        return circuito;
    }

    public String mostrarInformacion() {
        String s="";
        for (int i=0; i<clasificacion.size(); i++){
            s+="Posicion: "+i+"\t Piloto: "+clasificacion.get(i).piloto.getNombre()+"\t Tiempo: "+clasificacion.get(i).tiempo;
        }
        return s;
    }
}
