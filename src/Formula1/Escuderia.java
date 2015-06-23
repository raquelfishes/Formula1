/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

import java.util.ArrayList;

public class Escuderia {
    static int contador = 0;
    private int identificador;
    private String nombre;
    private String pais;
    private int anyoFundacion;
    private int presupuesto;
    private int puntosMundial;
    private String[] directivos;
    private ArrayList<PilotoOficial> pilotosOficiales;
    private ArrayList<PilotoProbador> pilotosProbadores;
    private ArrayList<Coche> coches;
    final int MAX_COCHES = 2;
    
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
    
    public void ficharPiloto(Piloto p){
        
    }
    
    public void intercambiarPiloto(){
        
    }
    
    public void pagarPilotos(){
        for (PilotoOficial p : pilotosOficiales) {
            presupuesto -= p.getSueldo();
        }
        for (PilotoProbador p : pilotosProbadores) {
            presupuesto -= p.getSueldo();
        }
    }
    
    public String entrenar(int idPiloto, int idCoche){
        if((idCoche>0) && (idCoche<=coches.size())){
            if((idPiloto>0) && (idPiloto<=pilotosOficiales.size())){
                coches.get(idCoche).mejorar();
            }
            return "No existe ese identificador de Piloto";
        }
        return "No existe ese identificador de coche";
    }
    
    public String pagarCanon(int canon){
        if (canon < presupuesto){
            presupuesto -= canon;
            return "Este entrenamiento te ha costado "+canon+" euros";
        }
        return "No tienes dinero suficiente para entrenar en este circuito";
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
    
    public int getPresupuesto(){
        return presupuesto;
    }
    public void setPresupuesto(int p){
        presupuesto = p;
    }
    
    public int getNumCoches(){
        return coches.size();
    }
    
}
