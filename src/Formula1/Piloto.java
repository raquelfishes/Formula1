/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

class DatosPersonales{
    int edad;
    float altura;
    float peso;
    
    DatosPersonales(int e, float a, float p){
        edad = e;
        altura = a;
        peso = p;
    }
    
}

class CaracteristicasTecnicasPiloto{
    float reflejos;
    float agresividad;
    float paciencia;
    float valentia;
    
    CaracteristicasTecnicasPiloto(float r, float a, float p, float v){
        reflejos = r;
        agresividad = a;
        paciencia = p;
        valentia = v;
    }
    
    float getSumaCaracteristicas(){
        return reflejos + agresividad + paciencia + valentia;
    }
    
    void mejorar(float valor){
        reflejos += valor;
        agresividad += valor;
        paciencia += valor;
        valentia += valor;
    }
}

public abstract class Piloto {
    static int contador = 0;
    private int identificador;
    private String nombre;
    private String apellidos;
    private DatosPersonales datosPersonales;
    private int puntosMundial;
    protected float sueldo;
    protected CaracteristicasTecnicasPiloto caracteristicasTecnicas;
    
    public Piloto(String n, String a, DatosPersonales d, CaracteristicasTecnicasPiloto c){
        contador++;
        identificador = contador;
        nombre = n;
        apellidos = a;
        datosPersonales = d;
        caracteristicasTecnicas = c;
        puntosMundial = 0;
    }
    
    public void sumarPuntos(int puntos){
        puntosMundial += puntos;
    }
    
    public String toString(){
        return "   Identificador: " + identificador + " Nombre: " + nombre + " Apellidos: " + apellidos + 
                " Datos Personales: " + "edad, " + datosPersonales.edad + "altura, " + datosPersonales.altura + "peso, " + datosPersonales.peso + 
                " Puntos Mundial: " + puntosMundial + " Sueldo: " + sueldo + 
                " Caracteristicas Tecnicas: " + "reflejos, " + caracteristicasTecnicas.reflejos + "agresividad, " + caracteristicasTecnicas.agresividad + 
                "paciencia, " + caracteristicasTecnicas.paciencia +  "valentia, " + caracteristicasTecnicas.valentia + "\n";
    }
    
    // Metodos abstractos
    
    abstract public float calcularSueldo();
    
    abstract public void mejorar();
    
    
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
    
    public String setApellidos(){
        return apellidos;
    }
    public void setApellidos(String s){
        apellidos = s;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    public void setSueldo(float s){
        sueldo = s;
    }
    
    public DatosPersonales getDatosPersonales(){
        return datosPersonales;
    }
    public void setDatosPersonales(DatosPersonales d){
        datosPersonales = d;
    }
    
    
    
}
