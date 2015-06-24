
package Formula1;

import java.util.ArrayList;
import java.util.Collections;

public class Mundial {
    
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Piloto> pilotos;
    private Carrera[] carreras = new Carrera[5];
    private boolean empezado;
    
    public Mundial(ArrayList e){
        escuderias = e;
        pilotos = new ArrayList();
    }
    
    public boolean empezarMundial(String mensaje){
        boolean b = true;
        for (Escuderia escuderia : escuderias) {
            if (escuderia.getNumCoches()==0 && escuderia.getNumPilotosOficiales()==0){
                //No se puede inscribir la escuderia(le falta un coche o un piloto oficial)
                mensaje += "La escuderia "+escuderia.getNombre()+" ("+escuderia.getIdentificador()+") no tiene suficientes pilotos oficiales o coches.\n";
                b=false;
            }
            else{
                //Se inscribe la escuderia en el mundial
                for (int i=0; i<carreras.length; i++){
                    if (escuderia.getEquipoCircuito(carreras[i].getCircuito()).size() > 0){
                        escuderias.add(escuderia);
                    }
                    else{
                        escuderia.crearEquipoCircuito(carreras[i].getCircuito());
                        escuderias.add(escuderia);
                    }
                }
            }
        }
        if (!b)
            return false;
        mensaje = "¡El mundial URJC ha comenzado!";
        return b;
    }
    
    public String empezarCarrera(int i){
        String s="";
        // Primero cada escuderia paga los canon y al piloto
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[i].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[i].getCircuito()))){
                escuderia.pagarValor(carreras[i].getCircuito().getCanon());
                escuderia.pagarValor(escuderia.getSueldosPilotos(carreras[i].getCircuito()));
            }
            else{
                s="La escuderia "+escuderia.getNombre()+ " no tiene dinero suficiente para participar en esta carrera";
            }
        }
        // Segundo cada escuderia compite con sus equipos en la carrera
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[i].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[i].getCircuito()))){
                for (EquipoCarrera equipo:escuderia.getEquipoCircuito(carreras[i].getCircuito()))
                    equipo.tiempo = carreras[i].tiempoPiloto(equipo);
            }
        }
        //Rellenar clasificacion 
        carreras[i].rellenarClasificacion(escuderias);
        //mostrar informacion
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[i].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[i].getCircuito()))){
                escuderia.mostrarInformacion();
            }
        }
        Collections.sort(escuderias);
        return s;
    }
    
    public String mostrarEstadisticasMundial(){
        String s = "";
        for (int i=0; i<escuderias.size(); i++){
            s+="Posicion: " + i + "\t" + escuderias.get(i).mostrarInformacion();
        }
        return s;
    }
    
    public String mostrarEstadisticasCarrera(int i){
        String s = "";
        carreras[i].mostrarInformacion();
        return s;
    }

    public boolean isEmpezado() {
        return empezado;
    }

    public void setEmpezado(boolean empezado) {
        this.empezado = empezado;
    }
    
}
