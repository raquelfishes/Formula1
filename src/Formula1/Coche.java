/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

class CaracteristicasTecnicasCoche{
    float motor;
    float aerodinamica;
    float neumaticos;
    
    CaracteristicasTecnicasCoche(float m, float a, float n){
        motor = m;
        aerodinamica = a;
        neumaticos = n;
    }
    
    void mejorar(float valor){
        motor += valor;
        aerodinamica += valor;
        neumaticos += valor;
    }

    @Override
    public String toString() {
        return "CaracteristicasTecnicasCoche{" + "motor=" + motor + ", aerodinamica=" + aerodinamica + ", neumaticos=" + neumaticos + '}';
    }
    
}

public class Coche {
    private String modelo;
    private CaracteristicasTecnicasCoche caracteristicasTecnicas;
    private float velocidadRecta;
    private float velocidadCurva;
    
    public Coche(String m, CaracteristicasTecnicasCoche c){
        modelo = m;
        caracteristicasTecnicas = c;
        velocidadRecta = calcularVelocidadRecta();
        velocidadCurva = calcularVelocidadCurva();
    }
    
    public float calcularVelocidadRecta(){
        return (caracteristicasTecnicas.motor * 20) + (caracteristicasTecnicas.aerodinamica * 30);
    }
    
    public float calcularVelocidadCurva(){
        return (caracteristicasTecnicas.motor * 10) + (caracteristicasTecnicas.aerodinamica * 10) + (caracteristicasTecnicas.neumaticos * 10);
    }
    
    public void mejorar(){
        caracteristicasTecnicas.mejorar((float) 0.1);
    }

    @Override
    public String toString() {
        return "modelo=" + modelo + " " + caracteristicasTecnicas.toString() + " velocidadRecta=" + velocidadRecta + " velocidadCurva=" + velocidadCurva;
    }
    
    
}
