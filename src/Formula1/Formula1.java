/*
 * 
 * 
 * 
 */
package Formula1;
import java.io.Serializable;
import java.text.ParseException;
import java.util.*;

public class Formula1 implements Serializable{
    
    ArrayList<Escuderia> escuderias;
    ArrayList<Piloto> pilotos;
    ArrayList<Circuito> circuitos;
    
    Mundial mundial;
    
    
    public Formula1(){
        escuderias = new ArrayList();
        pilotos = new ArrayList();
        circuitos = new ArrayList();
    }
    
    // Gestionar escuderias
    
    public void añadirEscuderia(Escuderia escuderia){
       escuderias.add(escuderia);
    }
    
    public void borrarEscuderia(Escuderia escuderia){
       escuderias.remove(escuderia);
    }
    
    public void modificarEscuderia(int escuderia ,String nombre, String pais,
            String anyoFundacion, String presupuesto) throws ParseException{
        if (!nombre.equals("")){
            escuderias.get(escuderia-1).setNombre(nombre);
        }
        if (!pais.equals("")){
            escuderias.get(escuderia-1).setPais(pais);
        }
        if (!anyoFundacion.equals("")){
            escuderias.get(escuderia-1).setAnyoFundacion(Integer.parseInt(anyoFundacion));
        }
        if (!presupuesto.equals("")){
            escuderias.get(escuderia-1).setPresupuesto(Integer.parseInt(presupuesto));
        }
    }
    
    public Escuderia consultarEscuderia(Escuderia escuderia){
    for (Escuderia a:this.escuderias){
         if (escuderia.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroEscuderias(){
        return escuderias.size();
    }
    
    public String mostrarEscuderias (){
        StringBuilder s = new StringBuilder();
           for (Escuderia es : escuderias) {           
               s.append (es.toString());
           }
        return s.toString();
   }
    
    // Gestionar pilotos
    
    public void añadirPiloto(Piloto piloto){
       pilotos.add(piloto);
    }
    
    public void borrarPiloto(Piloto piloto){
       pilotos.remove(piloto);
    }
    
    public void modificarPiloto(int piloto ,String nombre, String apellidos,
            DatosPersonales datosPersonales) throws ParseException{
        if (!nombre.equals("")){
            pilotos.get(piloto-1).setNombre(nombre);
        }
        if (!apellidos.equals("")){
            pilotos.get(piloto-1).setApellidos(apellidos);
        }
        if (datosPersonales != null){
            pilotos.get(piloto-1).setDatosPersonales(datosPersonales);
        }
    }
    
    public Piloto consultarPiloto(Piloto piloto){
    for (Piloto a:this.pilotos){
         if (piloto.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroPilotos(){
        return pilotos.size();
    }
    
    public String mostrarPilotos (){
        StringBuilder s = new StringBuilder();
        int p=0;
           for (Piloto pi : pilotos) {
               p++;           
               s.append(p).append (pi.toString());
           }
        return s.toString();
   }
    
    // Gestionar circuitos
    
    public void añadirCircuito(Circuito circuito){
       circuitos.add(circuito);
    }
    
    public void borrarCircuito(Circuito circuito){
       circuitos.remove(circuito);
    }
    
    public void modificarCircuito(int circuito, String nombre, int aforo,
            int canon) throws ParseException{
        if (!nombre.equals("")){
            circuitos.get(circuito-1).setNombre(nombre);
        }
        if (aforo != 0){
            circuitos.get(circuito-1).setAforo(aforo);
        }
        if (canon != 0){
            circuitos.get(circuito-1).setCanon(canon);
        }
    }
    
    public Circuito consultarCircuito(Circuito circuito){
    for (Circuito a:this.circuitos){
         if (circuito.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroCircuitos(){
        return circuitos.size();
    }
    
    public String mostrarCircuitos (){
        StringBuilder s = new StringBuilder();
        int c=0;
           for (Circuito ci : circuitos) {
               c++;           
               s.append(c).append (ci.toString());
           }
        return s.toString();
   }
    
    // Gestionar Mundial
    
    public void crearMundial(){
        mundial = new Mundial(escuderias);
    }
}
