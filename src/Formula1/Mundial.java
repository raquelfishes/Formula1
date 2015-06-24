/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        for (Escuderia escuderia : escuderias) {
            
        }
        
        return true;
    }
    
    public void clasificacionPilotos(){
        
    }
    
    public void clasificacionEscuderias(){
        
    }
    
    public void empezarCarrera(int i){
        for (Escuderia escuderia: escuderias){
            escuderia.pagarCanon(carreras[i].getCircuito().getCanon());
            escuderia.pagarPiloto(escuderia.getPilotoCarrera(i));
        }
        carreras[i]
    }
    
    public void mostrarEstadisticasMundial(){
        
    }
    
    public void mostrarEstadisticasCarrera(){
        
    }
}
