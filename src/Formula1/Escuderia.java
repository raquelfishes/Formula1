/*
 * 
 * 
 * 
 */
package Formula1;

import java.util.ArrayList;

class EquipoCarrera{
    Circuito circuito;
    Coche coche;
    PilotoOficial piloto;
    float tiempo = -1;

    public EquipoCarrera(Circuito circuito, Coche coche, PilotoOficial piloto) {
        this.circuito = circuito;
        this.coche = coche;
        this.piloto = piloto;
        this.tiempo = -1;
    }
    
    @Override
    public String toString() {
        return "circuito=" + circuito + ", coche=" + coche + ", piloto=" + piloto + ", tiempo=" + tiempo;
    }       
}

public class Escuderia {
    static int contador = 0;
    final int MAX_COCHES = 2;
    final int MAX_PILOTOS_OFIC = 2;
    final int MAX_PILOTOS_PROB = 2;
    
    private int identificador;
    private String nombre;
    private String pais;
    private int anyoFundacion;
    private float presupuesto;
    private int puntosMundial;
    private String[] directivos;
    private ArrayList<PilotoOficial> pilotosOficiales;
    private ArrayList<PilotoProbador> pilotosProbadores;
    private ArrayList<Coche> coches;
    
    public Escuderia(String n, String p, int a, int pr, String[] d){
        contador++;
        identificador = contador;
        nombre = n;
        pais = p;
        anyoFundacion = a;
        presupuesto = pr;
        directivos = d;
        puntosMundial = 0;
        pilotosOficiales = new ArrayList();
        pilotosProbadores = new ArrayList();
        coches = new ArrayList();
    }
    
    public String ficharPiloto(PilotoOficial p){
        if(presupuesto < p.getSueldo()){
            return "No tienes presupuesto suficiente para fichar a este corredor";
        }else if(pilotosOficiales.size() < MAX_PILOTOS_OFIC){
            pilotosOficiales.add(p);
            return "Has fichado a "+p.getNombre()+" como piloto oficial.";
        }
        return "Tienes el máximo de pilotos oficiales, no puedes fichar";
    }
    
    public String ficharPiloto(PilotoProbador p){
        if(presupuesto < p.getSueldo()){
            return "No tienes presupuesto suficiente para fichar a este corredor";
        }else if(pilotosProbadores.size() < MAX_PILOTOS_PROB){
            pilotosProbadores.add(p);
            return "Has fichado a "+p.getNombre()+" como piloto probador.";
        }
        return "Tienes el máximo de pilotos probadores, no puedes fichar";     
    }
    
    public void intercambiarPiloto(){
        
    }
    
    public String descartarPiloto(int idPiloto, Piloto piloto){
            if((idPiloto > 0) && (idPiloto < pilotosOficiales.size()+1)){
                if (pilotosOficiales.size() < 2){
                    return "Debes mantener al menos a 1 piloto oficial";
                }else{
                    piloto= pilotosOficiales.get(idPiloto-1).getPiloto();
                    pilotosOficiales.remove(pilotosOficiales.get(idPiloto-1));
                    return "Has descartado al piloto "+piloto.getNombre();
                }
            }else if(idPiloto < (pilotosOficiales.size()+pilotosProbadores.size())){
                piloto= pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1).getPiloto();
                pilotosProbadores.remove(pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1));
                return "Has descartado al piloto "+piloto.getNombre();
            }
            return "No existe ese identificador de Piloto";
    }
    
    public void pagarPilotos(){
        for (Piloto p : pilotosOficiales) {
            presupuesto -= p.getSueldo();
        }
        for (Piloto p : pilotosProbadores) {
            presupuesto -= p.getSueldo();
        }
    }
    
    public String entrenar(int idPiloto, int idCoche, boolean correcto){
        if((idCoche>0) && (idCoche<=coches.size())){
            if((idPiloto > 0) && (idPiloto < pilotosOficiales.size()+1)){
                pilotosOficiales.get(idPiloto-1).mejorar();
                coches.get(idCoche-1).mejorar();
                correcto = true;
                return "El piloto oficial y el coche han mejorado";
            }else if(idPiloto < (pilotosOficiales.size()+pilotosProbadores.size())){
                pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1).mejorar();
                coches.get(idCoche-1).mejorar();
                correcto = true;
                return "El piloto probador y el coche han mejorado";
            }
            return "No existe ese identificador de Piloto";
        }
        return "No existe ese identificador de coche";
    }
    
    public void pagarCanon(float canon){
            presupuesto -= canon;
    }
    
    public boolean presupuestoCanon(float canon){
        if(canon < presupuesto){
            return true;
        }
        return false;
    }
    
    public String anyadirCoche(Coche coche){
        if(coches.size() < MAX_COCHES){
            coches.add(coche);
            return "El coche se ha comprado con exito";
        }
        return "Ya tiene el garaje lleno";
       
    }
    
    public String borrarCoche(int coche){
        if((coche>0) && (coche<=coches.size())){
            coches.remove(coche-1);
            return "El coche se ha regalado";
        }     
        return "El identificador no es correcto";    
    }
    
    public String mostrarCoches (){
        StringBuilder s = new StringBuilder();
           int id=0;
           for (Coche c : coches) { 
               ++id;
               s.append ("Identificador: "+id+" "+c.toString()+"\n");       
           }
        return s.toString();
   }
   
    public String mostrarPilotos (){
        StringBuilder s = new StringBuilder();
           s.append("Pilotos Oficiales \n");
           int id=0;
           for (PilotoOficial p : pilotosOficiales) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
           s.append("Pilotos Probadores \n");
           for (PilotoProbador p : pilotosProbadores) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
        return s.toString();
   }
    
    public String toString(){
        return "Identificador: " + identificador + " Nombre: " + nombre + " Pais: " + pais + 
                " Año Fundacion: " + anyoFundacion + " Presupuesto: " + presupuesto + " FPuntos Mundial: " + puntosMundial +"\n";
    }
    
    // Getters y Setters
    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int i){
        identificador = i;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String s){
        nombre = s;
    }
    
    public String getPais(){
        return pais;
    }
    public void setPais(String p){
        pais = p;
    }
    
    public int getAnyoFundacion(){
        return anyoFundacion;
    }
    public void setAnyoFundacion(int a){
        anyoFundacion = a;
    }
    
    public float getPresupuesto(){
        return presupuesto;
    }
    public void setPresupuesto(float p){
        presupuesto = p;
    }
    
    public int getNumCoches(){
        return coches.size();
    }
    
    public int getNumPilotos(){
        return pilotosOficiales.size() + pilotosProbadores.size();
    }
}
