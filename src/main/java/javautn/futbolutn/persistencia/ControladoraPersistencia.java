
package javautn.futbolutn.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javautn.futbolutn.logica.Equipo;
import javautn.futbolutn.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();

    public void crearEquipo(Equipo equi) {
        
        equipoJPA.create(equi);
    }

    public ArrayList<Equipo> traerListaEquipos() {
        List<Equipo> lista = equipoJPA.findEquipoEntities();
        ArrayList<Equipo> listaEquipos = new ArrayList<Equipo> (lista);    
            return listaEquipos;        
    }

    public void eliminarEquipo(int id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editarEquipo(Equipo equi) {
        try {
            equipoJPA.edit(equi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
