
package javautn.futbolutn.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Matías Zelarayán
 */


@Entity
@Table (name="Equipo")
public class Equipo implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "titulares", nullable = false)
    private int titulares;
    
    @Column(name = "suplentes", nullable = false)
    private int suplentes;
    
    @Column(name = "directorTecnico", nullable = false)
    private String directorTecnico;
    
    @Column(name = "puntos", nullable = false)
    private int puntos;
    
    @Column(name = "partidosJugados", nullable = false)
    private int partidosJugados;

    
    public Equipo() {
    }

    public Equipo(int id, String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulares() {
        return titulares;
    }

    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre=" + nombre + ", titulares=" + titulares + ", suplentes=" + suplentes + ", directorTecnico=" + directorTecnico + ", puntos=" + puntos + ", partidosJugados=" + partidosJugados + '}';
    }
    
    
}
