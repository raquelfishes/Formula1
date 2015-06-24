/*
 * 
 * 
 * 
 */
package Formula1;

import java.util.ArrayList;

public class Mundial {
    
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Piloto> pilotos;
    private Carrera[] carreras = new Carrera[5];
    
    public Mundial(ArrayList e){
        escuderias = e;
        pilotos = new ArrayList();
    }
    
    public boolean empezarMundial(String mensaje){
        boolean b = true;
        for (Escuderia escuderia : escuderias) {
            if (escuderia.getNumCoches()==0 && escuderia.getNumPilotosOficiales()==0){
                mensaje += "La escuderia "+escuderia.getNombre()+" ("+escuderia.getIdentificador()+") no tiene suficientes pilotos oficiales o coches.\n";
                b=false;
            }
        }
        if (!b)
            return false;
        mensaje = "¡El mundial URJC ha comenzado!";
        return b;
    }
    
    public void clasificacionPilotos(){
        
    }
    
    public void clasificacionEscuderias(){
        
    }
    
    public void empezarCarrera(int i){
        // Primero cada escuderia paga los canon y al piloto
        for (Escuderia escuderia: escuderias){
            //if (escuderia.presupuestoCanon(carreras[i].getCircuito().getCanon())&& escuderia.presupuestoPiloto(escuderia.getEquipoCarrera(i)))
            //escuderia.pagarCanon(carreras[i].getCircuito().getCanon());
            //escuderia.pagarPiloto(escuderia.getPilotoCarrera(i));
            //carreras[i].inscribirPiloto
        }
        //carreras[i]
        //Estadisticas de cada escuderia
        for (Escuderia escuderia: escuderias){
            
        }
    }
    
    public void mostrarEstadisticasMundial(){
        
    }
    
    public void mostrarEstadisticasCarrera(){
        
    }
}
