package Formula1;

import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

public class Curso implements Enum,Serializable{
    static int contador = 0;
    private int Identificador;
    private String Nombre;
    private int Horas;
    private E2 Titulacion;
    private String Lugar;
    private Date f_inicio;
    ArrayList<Usuario> alumnos;

    public Curso(String Nombre,int Horas,E2 Titulacion,String Lugar,
                 Date f_inicio){
        contador++;
        Identificador = contador;
        this.Nombre= Nombre;
        this.Horas= Horas;
        this.Titulacion= Titulacion;
        this.Lugar= Lugar;
        this.f_inicio= f_inicio;
        alumnos = new ArrayList();
    }
    

    public void añadirAlumno(Usuario usuario){
        Estudio Titulos= usuario.getEstudios();
        E2 Titulo= Titulos.getTitulacion();
        E1 Estado= usuario.getEstado();
        if ( Titulo.ordinal()>=this.Titulacion.ordinal() && Estado ==E1.PARO){
            usuario.setEstado(E1.REALIZANDO_CURSO);
            alumnos.add(usuario);
        }
    }

    public Curso borrarAlumno(Usuario usuario){
        E1 Estado= usuario.getEstado();
        Calendar factual=Calendar.getInstance();
        int inicio =factual.getTime().compareTo(f_inicio);
        if((Estado != E1.REALIZANDO_CURSO) && (inicio<0)){
            usuario.setEstado(E1.PARO);
            alumnos.remove(usuario);
        }   
        return this;
    }

    public Usuario editarAlumno(Usuario usuario,String Dirección, String Teléfono,
        String Código_postal, String Localidad){

            if (!Dirección.equals("")){
                usuario.setDirección(Dirección);
            }
            if (!Teléfono.equals("")){
                usuario.setTelefono(Long.valueOf(Teléfono));
            }
            if (!Código_postal.equals("")){
                usuario.setCodigo_Postal(Long.valueOf(Código_postal));
            }
            if (!Localidad.equals("")){
                usuario.setLocalidad(Localidad);
            }

        return usuario;
    }

    public String listarAlumnos(){
        StringBuffer lista = new StringBuffer();
        for(Usuario a:this.alumnos){
            lista.append(a.toString());
        }
        return lista.toString();
    }

    public Usuario consultarAlumno(Usuario usuario){
    for (Usuario a:this.alumnos){
         if (usuario.getDNI() == a.getDNI()) {
             return a; }
        }
    return null;
    }

    public String toString (){
        return "   Identificador: "+Identificador+" Nombre: "+Nombre+" Horas: "+Horas+ " Titulacion: "+Titulacion+
                " Lugar: "+Lugar+" Fecha de inicio: "+f_inicio+"\n";
    }


    public int getIdentificador () {
        return Identificador;
    }

    public void setNombre (String nombre) {
        this.Nombre = nombre;
    }

    public int getHoras () {
        return Horas;
    }

    public void setHoras (int horas) {
        this.Horas = horas;
    }

    public E2 getTitulacion () {
        return Titulacion;
    }

    public void setTitulacion (E2 titulacion) {
        this.Titulacion = titulacion;
    }

    public String getLugar () {
        return Lugar;
    }

    public void setLugar (String lugar) {
        this.Lugar = lugar;
    }

    public Date getF_inicio () {
        return f_inicio;
    }

    public void setF_inicio (Date fecha) {
        this.f_inicio = fecha;
    }
 }