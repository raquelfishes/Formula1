/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

import java.util.ArrayList;

public class Circuito {
    static int contador = 0;
    private int identificador;
    private String nombre;
    private int aforo;
    private float canon;
    private int numeroRectas;
    private int numeroCurvas;
    private int[] premios = {100000, 75000, 50000, 25000, 15000, 10000};
    
    public Circuito(String n, int a, float c, int nR, int nC){
        contador++;
        identificador = contador;
        nombre = n;
        aforo = a;
        canon = c;
        numeroRectas = nR;
        numeroCurvas = nC;
    }
    
    public String toString(){
        return "   Identificador: " + identificador + " Nombre: " + nombre + " Aforo: " + aforo + 
                " Canon: " + canon + " Numero Rectas: " + numeroRectas + " Numero Curvas: " + numeroCurvas +"\n";
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
    
    public int getAforo(){
        return aforo;
    }
    public void setAforo(int i){
        aforo = i;
    }
    
    public float getCanon(){
        return canon;
    }
    public void setCanon(int f){
        canon = f;
    }
    
    public int getPremio(int i){
        return premios[i];
    }

}
