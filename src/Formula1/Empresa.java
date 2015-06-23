
package Formula1;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Enum,Serializable{
    private String nombre;
    private long CIF;
    private String sector;
    ArrayList<OfertaDeEmpleo> lisOfertas;

    public Empresa (){}
    
    public Empresa (String nom,long iden,String sec) {
        nombre = nom;
        CIF = iden;
        sector = sec;
        lisOfertas=new ArrayList();
    }

    public String getNombre () {
        return nombre;
    }

    public long getCIF () {
        return CIF;
    }

    public String getSector () {
        return sector;
    }

    public void setNombre(String n){
        this.nombre =n;
    }

    public void setCIF (long i){
        this.CIF = i;
    }

    public void setSector(String s){
        this.sector =s;
    }

    public Empresa altaOferta (String despt, E2 esmreq, String tipcon, int RanS ){
        OfertaDeEmpleo Oferta = new OfertaDeEmpleo(despt,esmreq,tipcon, RanS);
        lisOfertas.add(Oferta);
        return this;
    }

    public Empresa bajaOferta (OfertaDeEmpleo ofer){
        lisOfertas.remove(ofer);
        return this;
    }

    public String consultaOferta (OfertaDeEmpleo ofer){
        return ofer.toString();
    }

    public Empresa modificacionOferta (int ofer, String DPT, String EMR, String TC, String RS){
        if(!DPT.equals("")){
            lisOfertas.get(ofer-1).setDescPuestTrab(DPT);
        }
        if(!EMR.equals("")){
            lisOfertas.get(ofer-1).setEstudMinReq(E2.valueOf(EMR));
        }
        if(!TC.equals("")){
            lisOfertas.get(ofer-1).settipoContrato(TC);
        }
        if(!RS.equals("")){
            lisOfertas.get(ofer-1).setRangoSalarial(Integer.parseInt(RS));
        }
      return this;
    }

    public int getNumOfertas(){
        return lisOfertas.size();
    }

    public String mostrarOfertas (){
     StringBuilder s = new StringBuilder();
     int c=0;
     for (OfertaDeEmpleo a:lisOfertas){
             c++;
             s.append(c).append (a.toString());
         }
     return s.toString();
    }

    public String toString (){

        return "   Nombre:" + nombre + " CIF: " + CIF + " Sector: "+ sector+"\n";
    }
    
}
