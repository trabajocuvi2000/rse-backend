
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "nivel")
public class Nivel {
    
    @Id
    @Column (name = "Nivel_ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Nivel_ID;
    
    @Column (name = "Nombre")
    private String Nombre;
    
    @Column (name = "Descripcion")
    private String Descripcion;
    
    @Column (name = "prioridad")
    private String prioridad;
    
    @JsonIgnore
    @OneToMany (mappedBy = "nivel")
    private List<Indicador> inidcador;

    public List<Indicador> getInidcador() {
        return inidcador;
    }

    public void setInidcador(List<Indicador> inidcador) {
        this.inidcador = inidcador;
    }

    
    


    
    public int getNivel_ID() {
        return Nivel_ID;
    }

    public void setNivel_ID(int Nivel_ID) {
        this.Nivel_ID = Nivel_ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    
    
}
