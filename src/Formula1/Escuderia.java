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
    
    public void entrenar(int idPiloto, int idCoche){
        
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
    
    public void pagarCanon(float canon){
        presupuesto -= canon;
    }
    
    public String toString(){
        return "   Identificador: " + identificador + " Nombre: " + nombre + " Pais: " + pais + 
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
}
