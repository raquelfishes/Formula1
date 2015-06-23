
package Formula1;
import java.io.Serializable;
import java.util.*;
import java.text.*; 

public class Inem implements Enum,Serializable {

    Demandante demandante;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    ArrayList<Empresa> empresas;

    public Inem(){
        demandante= new Demandante();
        usuarios= new ArrayList();
        cursos= new ArrayList();
        empresas= new ArrayList();
    }

    public String encontrarCandidatosOferta(OfertaDeEmpleo ofer){
        StringBuilder s = new StringBuilder();
            for ( Usuario u :demandante.lisDemandantes){
                if ( u.getEstudios().getTitulacion()==ofer.getEstudMinReq()){
                    s.append(u);
                }
            }
        return s.toString();
    }

    public String encontrarCandidatosCurso (Curso c){
        return c.listarAlumnos();
    }

    public String encontrarOfertas() {   //Unicamente devuelve un ArrayList de string de TODAS las ofertas
        StringBuilder s = new StringBuilder();
        for (Empresa e: empresas){
            for (OfertaDeEmpleo o : e.lisOfertas){
                s.append(o.toString());
            }
        }
        return s.toString();
    }

     public String encontrarCursos() { //he añadido un toString en curso
        StringBuilder s = new StringBuilder();      //Devuelve un ArrayList con todos los cursos
        for (Curso c: cursos){
            s.append(c.toString());
        }
        return s.toString();
    }

    public String consultarVidaLaboral(Usuario u) {
        return u.mostrarTrabajos();
    }

    public int numeroPersonasCurso(int i){       
        Curso curso=cursos.get(i);      
        return curso.alumnos.size();
    }

    public void añadirCurso(Curso curso){
       cursos.add(curso);
    }

    public void añadirEmpresa(Empresa empresa){
       empresas.add(empresa);
    }

    public void añadirUsuario(Usuario usuario){
       usuarios.add(usuario);
    }

    public void borrarCurso(Curso curso){
       cursos.remove(curso);
    }

    public void borrarEmpresa(Empresa empresa){
       empresas.remove(empresa);
    }

    public void borrarUsuario(Usuario usuario){
       usuarios.remove(usuario);
    }

    public void modificarCurso(int curso,String Nombre,String Horas,
            String Titulacion,String Lugar,String f_inicio) throws ParseException{
        if (!Nombre.equals("")){
            cursos.get(curso-1).setNombre(Nombre);
        }
        if (!Horas.equals("")){
            cursos.get(curso-1).setHoras(Integer.parseInt(Horas));
        }
        if (!Titulacion.equals("")){
            cursos.get(curso-1).setTitulacion(E2.valueOf(Titulacion));
        }
        if (!Lugar.equals("")){
        cursos.get(curso-1).setLugar(Lugar);
        }
        if (!f_inicio.equals("")){
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
            cursos.get(curso-1).setF_inicio(formatoDelTexto.parse(f_inicio));
        }
    }

    public void modificarEmpresa(int empresa,String Nombre,String CIF,
            String Sector){
        if (!Nombre.equals("")){
            empresas.get(empresa-1).setNombre(Nombre);
        }
        if (!CIF.equals("")){
            empresas.get(empresa-1).setCIF(Long.parseLong(CIF));
        }
        if (!Sector.equals("")){
            empresas.get(empresa-1).setSector(Sector);
        }
    }

    public Curso consultarCurso(Curso curso){
    for (Curso a:this.cursos){
         if (curso.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }

    public String mostrarCursos (){
     StringBuilder s = new StringBuilder();
     int c=0;
     for (Iterator it = cursos.iterator();it.hasNext();){    
         Curso cl = (Curso) it.next();
            c++;           
            s.append(c).append (cl.toString());
     }
     return s.toString();
    }

    public String mostrarEmpresas (){
     StringBuilder s = new StringBuilder();
     int c=0;
     for (Iterator it = empresas.iterator();it.hasNext();){
         Empresa cl = (Empresa) it.next();
         c++;
         s.append(c).append (cl.toString());
     }
     return s.toString();
    }

    public String mostrarOfertas (){
     StringBuilder s = new StringBuilder();
     int c=0;
     for (Empresa a:empresas){
         for (Iterator it = a.lisOfertas.iterator();it.hasNext();){
             OfertaDeEmpleo cl = (OfertaDeEmpleo) it.next();
             c++;
             s.append(c).append (cl.toString());
         }
     }
     return s.toString();
    }

    public String mostrarUsuarios (){
     StringBuilder s = new StringBuilder();
     int c=0;
     for (Iterator it = usuarios.iterator();it.hasNext();){
         Usuario cl = (Usuario) it.next();
         c++;
         s.append(c).append (cl.toString());
     }
     return s.toString();
    }

    public int numeroTotalDesempleados () {
        int c=0;
        for (Usuario u: usuarios) {
            if (u.Estado==E1.PARO) {
                c=c+1;
            }
        }
        return c;
    }

    public int numeroTotalDesempleados (int meses) {
        int c=0;
        Calendar fecha = Calendar.getInstance();
        Date fHoy= fecha.getTime();
        int m1= fHoy.getMonth();

        for (Usuario u: usuarios) {
            if (u.Estado==E1.PARO) {
                Date fU =u.Fecha_inscripción;
                 int m2 = m1- fU.getMonth();
                 if (meses==m2) {
                     c=c+1;
                 }
            }
        }
        return c;
    }

    public int numeroEmpresasSistema () {    
        return empresas.size();
    }

    public int numeroCursos () {
        return cursos.size();
    }

    public int numeroOfertas () {
        int x=0;
        for(Empresa a:empresas)
            x+=a.lisOfertas.size();
        return x;
    }

    public String cCurso (Usuario u) {
        StringBuilder s = new StringBuilder ();
        for (Curso c: cursos) {
            for (Usuario u1: c.alumnos) {
                if (u.getDNI()==u1.getDNI()) {
                    s.append(c.toString());
                }
            }
        }
        return s.toString();
    }
}
