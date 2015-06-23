
package Formula1;


import java.io.Serializable;
import java.util.*;

public class Usuario implements Enum, Serializable{
    protected String Nombre;
    protected String Dirección;
    protected long Teléfono;
    protected long Código_postal;
    protected String Localidad;
    protected String Provincia;
    protected long DNI;
    protected Date Fecha_nacimiento;
    protected Estudio Estudios;
    protected Date Fecha_inscripción;
    protected boolean Autónomo;
    protected boolean Autorización;
    protected E1 Estado;
    protected boolean Cobrando_prestaciones;
    protected ArrayList<Trabajo> lista;

    public Usuario () {
    }

    public Usuario (String Nombre, String Dirección, long Teléfono,
        long Código_postal, String Localidad, String Provincia, long DNI,
        Date Fecha_nacimiento, Estudio Estudios,boolean Autónomo,
        boolean Autorización,boolean Cobrando_prestaciones) {

            this.Nombre=Nombre;
            this.Dirección=Dirección;
            this.Teléfono=Teléfono;
            this.Código_postal=Código_postal;
            this.Localidad=Localidad;
            this.Provincia=Provincia;
            this.DNI=DNI;
            this.Fecha_nacimiento=Fecha_nacimiento;
            this.Estudios=Estudios;
            Calendar fecha = Calendar.getInstance();
            this.Fecha_inscripción= fecha.getTime();
            this.Autónomo=Autónomo;
            this.Autorización=Autorización;
            this.Estado= E1.PARO;
            this.Cobrando_prestaciones=Cobrando_prestaciones;
            this.lista = new ArrayList();
    }

    // AL UTILIZAR SOLAMENTE LOS ATRIBUTOS "ESTADO" Y "TITULACION, NO HEMOS
    //CREIDO CONVENIENTE INCLUIR LOS MÉTODOS "GET" Y "SET" DEL RESTO DE ATRIBUTOS.

    public void editarUsuario(String Nombre, String Dirección, String Teléfono,
      String Código_postal, String Localidad, String Provincia, boolean Autonomo,
      boolean Autorizacion, boolean Prestaciones, Estudio estudio ){

            if (!Nombre.equals("")){
                this.setNombre(Nombre);
            }
            if (!Dirección.equals("")){
                this.setDirección(Dirección);
            }
            if (!Teléfono.equals("")){
                this.setTelefono(Long.valueOf(Teléfono));
            }
            if (!Código_postal.equals("")){
                this.setCodigo_Postal(Long.valueOf(Código_postal));
            }
            if (!Localidad.equals("")){
                this.setLocalidad(Localidad);
            }
            if (!Provincia.equals("")){
                this.setProvincia(Provincia);
            }
            this.setAutónomo(Autonomo);
            this.setAutorización(Autorizacion);
            this.setCobrando_prestaciones(Prestaciones);
            this.setEstudios(estudio);
    }

    public void setEstado (E1 a) {
        this.Estado=a;
    }

    public E1 getEstado () {
        return this.Estado;
    }   
       
    public void setNombre (String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre () {
        return Nombre;
    }
    
    public void setDirección (String direccion) {
        this.Dirección = direccion;
    }

    public String getDirección () {
        return Dirección;
    }

    public void setTelefono (Long tlf) {
        this.Teléfono = tlf;
    }

    public Long getTelefono () {
        return Teléfono;
    }

    public void setCodigo_Postal (Long cp) {
        this.Código_postal = cp;
    }

    public Long getCodigo_Postal () {
        return Código_postal;
    }

    public void setLocalidad (String localidad) {
        this.Localidad = localidad;
    }

    public String getLocalidad () {
        return Localidad;
    }

    public void setProvincia (String provincia) {
        this.Provincia = provincia;
    }

    public String getProvincia () {
        return Provincia;
    }

    public void setDNI ( Long dni) {
        this.DNI = dni;
    }

    public Long getDNI () {
        return DNI;
    }

    public void setFecha_nacimiento (Date fecha) {
        this.Fecha_nacimiento = fecha;
    }

    public Date getFecha_nacimiento () {
        return Fecha_nacimiento;
    }

    public void setFecha_inscripción (Date fecha) {
        this.Fecha_inscripción = fecha;
    }

    public Date getFecha_inscripción () {
        return Fecha_inscripción;
    }

    public void setAutónomo (boolean autonomo) {
        this.Autónomo = autonomo;
    }

    public boolean getAutónomo () {
        return Autónomo;
    }

    public void setAutorización (boolean autorizacion) {
        this.Autorización = autorizacion;
    }

    public boolean getAutorización () {
        return Autorización;
    }

    public void setCobrando_prestaciones (boolean prestaciones) {
        this.Cobrando_prestaciones = prestaciones;
    }

    public boolean getCobrando_prestaciones () {
        return Cobrando_prestaciones;
    }

    public void setEstudios(Estudio estudio){
        this.Estudios.setTitulacion(estudio.getTitulacion());
        this.Estudios.setDuración(estudio.getDuración());
        this.Estudios.setNombre(estudio.getNombre());
        this.Estudios.setLugar(estudio.getLugar());
    }

    public Estudio getEstudios () {
        return Estudios;
    }

    public void añadirTrabajo (Trabajo t) {
        lista.add(t);
    }

    public String mostrarTrabajos (){
     StringBuilder s = new StringBuilder();
     for (Iterator it = lista.iterator();it.hasNext();){
         Trabajo t = (Trabajo) it.next();
         s.append (t.toString());
     }
 return s.toString();
 }

    public void inscribirseEnCurso (Curso c) {
        c.añadirAlumno (this);
    }

    public String consultarCurso (Curso c) {
        return c.toString();
    }

    public void borrarseDeCurso (Curso c) {
        c.borrarAlumno(this);
    }

    public String consultarVidaLaboral () {
        return this.mostrarTrabajos();
    }

    public String toString (){
        return "   Nombre: " + Nombre + "; Dirección: " + Dirección + "; Teléfono: "
                + Teléfono+ "; CP: " +Código_postal+"; Localidad: "+ Localidad
                +"; Provincia: "+Provincia+ "; DNI: "+DNI+"; Fecha de Nacimiento"
                +Fecha_nacimiento+"; Estudios "+Estudios.toString()+"; Fecha de inscripcion: "
                +Fecha_inscripción+ "; Autónomo: "+Autónomo
                + "; Autorización: "+Autorización+ "; Estado: "+Estado
                +"; Cobrando Prestaciones:"+Cobrando_prestaciones+"\n";
    }
}


