

package Formula1;

import java.io.Serializable;

public class Estudio implements Enum,Serializable {
    private E2 Titulación;
    private String Nombre;
    private String Duración;
    private String Lugar;

    public Estudio (E2 Titulacion,String Nombre,String Duración, String Lugar){
        this.Titulación=Titulacion;
        this.Nombre=Nombre;
        this.Duración=Duración;
        this.Lugar=Lugar;
    }
    
    public void setTitulacion (E2 a) {
        switch (a) {
            case SIN_ESTUDIOS:
                this.Titulación = E2.SIN_ESTUDIOS;
                break;
            case SECUNDARIA:
                this.Titulación = E2.SECUNDARIA;
                break;
            case BACHILLERATO:
                this.Titulación = E2.BACHILLERATO;
                break;
            case FP:
                this.Titulación = E2.FP;
                break;
            case GRADO:
                this.Titulación = E2.GRADO;
                break;
            case MASTER:
                this.Titulación = E2.MASTER;
                break;
            case DOCTORADO:
                this.Titulación = E2.DOCTORADO;
                break;
        }
    }

    public E2 getTitulacion () {
        return Titulación;
    }

    public void setNombre (String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre () {
        return Nombre;
    }

    public void setDuración (String duración) {
        this.Duración = duración;
    }

    public String getDuración () {
        return Duración;
    }

    public void setLugar (String lugar) {
        this.Lugar = lugar;
    }

    public String getLugar () {
        return Lugar;
    }

    public String toString () {
         return "Titulación: " + Titulación + "; Nombre: " + Nombre + "; Duración: "
                + Duración + "; Lugar: " +Lugar;
    }
}
