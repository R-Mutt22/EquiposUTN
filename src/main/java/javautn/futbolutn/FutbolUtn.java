
package javautn.futbolutn;

import java.util.ArrayList;
import javautn.futbolutn.logica.ControladoraLogica;
import javautn.futbolutn.logica.Equipo;

/**
 *
 * @author Usuario
 */
public class FutbolUtn {

    public static void main(String[] args) {
        
        ControladoraLogica controlL = new ControladoraLogica();
        
        Equipo equipo1 = new Equipo (1, "San Martin de Tucuaman", 22, 11, "Roldan", 33, 2);
        controlL.crearEquipo(equipo1);
    
        
        Equipo equipo2 = new Equipo (2, "Sportivo Guzman", 16, 7, "Perez", 2, 2);
        controlL.crearEquipo(equipo2);
    
        
        Equipo equipo3 = new Equipo (3, "Central Cordoba", 17, 8, "Carlos", 6, 2);
        controlL.crearEquipo(equipo3);
        
        System.out.println("------------------Lista de equipos-----------------");
        ArrayList<Equipo> listaEquipos = controlL.traerListaEquipos();
        for (Equipo e : listaEquipos){
            System.out.println("Lista: " + e.toString());
        }
        
        controlL.eliminarEquipo(3);
        
        equipo2.setDirectorTecnico("Sanchez");
        controlL.editarEquipo(equipo2);
        
        System.out.println("--------------------Lista modificada-----------------");
        ArrayList<Equipo> listaEquiposModificada = controlL.traerListaEquipos();
        for (Equipo e : listaEquiposModificada){
            System.out.println("Lista: " + e.toString());
        }
    }
}
