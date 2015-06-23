
package Formula1;

import java.io.Serializable;
import java.util.*;

public class Trabajo implements Serializable{
    private Date Fecha_alta;
    private Date Fecha_baja;
    private String Empresa;
    private String Puesto;
   

    public Trabajo (Date Fecha_alta, Date Fecha_baja,
            String Empresa, String Puesto){
        this.Fecha_alta=Fecha_alta;
        this.Fecha_baja=Fecha_baja;
        this.Empresa=Empresa;
        this.Puesto=Puesto;
    }

    public Date getFechaAlta () {
        return Fecha_alta;
    }

    public Date getFechaBaja () {
        return Fecha_baja;
    }

    public String getEmpresa () {
        return Empresa;
    }

    public String getPuesto () {
        return Puesto;
    }

    public void setFechaAlta (Date Fecha_alta) {
        this.Fecha_alta=Fecha_alta;
    }

    public void setFechaBaja (Date Fecha_baja) {
        this.Fecha_baja=Fecha_baja;
    }

    public void setEmpresa (String Empresa) {
        this.Empresa=Empresa;
    }

    public void setPuesto (String Puesto) {
        this.Puesto=Puesto;
    }
    
    public String toString (){
        return "Fecha_alta: " + Fecha_alta + "; Fecha_baja: " + Fecha_baja + "; Empresa: " + Empresa + "; Puesto: " +Puesto +"\n";
    }

}