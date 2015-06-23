

package Formula1;

import java.io.Serializable;
import java.util.*;

public class Demandante extends Usuario implements Serializable{
    public ArrayList<Usuario> lisDemandantes;

    public Demandante(){
        lisDemandantes= new ArrayList();
    }

    public boolean existe(Usuario usuario){
        boolean esta=false;
        for (Usuario a:this.lisDemandantes){
            if (a.getDNI()==usuario.getDNI())
                  esta=true;
        }
     return esta;
     }

    public ArrayList InscribirseEnOferta (Usuario usuario){
        if(this.existe(usuario) && (usuario.Estado!=E1.REALIZANDO_CURSO)){
           lisDemandantes.add(usuario);
        }
        return lisDemandantes;

     };


     

}
