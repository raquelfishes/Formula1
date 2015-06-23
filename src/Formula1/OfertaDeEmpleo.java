

package Formula1;

import java.io.Serializable;

public class OfertaDeEmpleo implements Enum,Serializable{
    private String DescPuestTrab;
    private E2 EstudMinReq;
    private String tipoContrato;
    private int RangoSalarial;
    private Demandante demandantes;
    
    public OfertaDeEmpleo (String dpt, E2 emr, String tc, int rS){
        DescPuestTrab = dpt;
        EstudMinReq = emr;
        tipoContrato = tc;
        RangoSalarial = rS;
        demandantes = new Demandante();
    }

    public String getDescPuestTrab (){
        return DescPuestTrab;
    }

    public E2 getEstudMinReq (){
        return EstudMinReq;
    }

    public String gettipoContrato (){
        return tipoContrato;
    }

    public int getRangoSalarial (){
        return RangoSalarial;
    }

    public void setDescPuestTrab (String d){
        this.DescPuestTrab=d;
    }

    public void setEstudMinReq (E2 e){
        this.EstudMinReq = e;
    }

    public void settipoContrato (String t){
        this.tipoContrato = t;
    }

    public void setRangoSalarial (int r){
        this.RangoSalarial= r;
    }

    public String toString (){

        return  "   Descripcion:" + this.getDescPuestTrab() +
                " Estudios Minimos: " + this.getEstudMinReq() +
                " Contrato: "+ this.gettipoContrato()+
                " Rango salarial: "+ this.getRangoSalarial()+"\n";
    }

    public boolean comparator (OfertaDeEmpleo of){
        boolean resul = false;
        if (of.DescPuestTrab.equals(this.DescPuestTrab)&& of.EstudMinReq.equals(this.EstudMinReq) && of.tipoContrato.equals(this.tipoContrato)&& of.RangoSalarial == this.RangoSalarial){
            resul = false;
        }
        return resul;
    }

     public OfertaDeEmpleo InsertarEnOferta (Usuario u) {
         if(u.Estado!=E1.REALIZANDO_CURSO){
           demandantes.lisDemandantes.add(u);
        }
        return this;
     }
}
