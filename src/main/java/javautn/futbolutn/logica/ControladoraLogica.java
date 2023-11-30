
package javautn.futbolutn.logica;

import java.util.ArrayList;
import javautn.futbolutn.persistencia.ControladoraPersistencia;

/**
 *
 * @author Usuario
 */
public class ControladoraLogica {
    
    ControladoraPersistencia controlP = new ControladoraPersistencia();

    public void crearEquipo (Equipo equi){
    
        controlP.crearEquipo (equi);
    }
    
    public ArrayList<Equipo> traerListaEquipos(){
        return controlP.traerListaEquipos();
    }
    
    public void eliminarEquipo (int id){
        controlP.eliminarEquipo (id);
    }
    
    public void editarEquipo (Equipo equi){
        controlP.editarEquipo(equi);
    }
}
