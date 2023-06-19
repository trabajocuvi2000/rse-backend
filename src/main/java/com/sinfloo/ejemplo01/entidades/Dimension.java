
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "dimension")
public class Dimension {
    
    @Id
    @Column (name = "Dimension_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Dimension_ID;
    
    @Column (name = "Nombre")
    private String Nombre;
    
    @Column (name = "Descripcion")
    private String Descripcion;
    
    @Column (name = "Fecha_Creacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Creacion;
    
    @Column (name = "Fecha_Modificacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Modificacion;
    
    @Column (name = "codigo_dimension")
    private String codigo_dimension;
    
    //@OneToOne (cascade = CascadeType.ALL)
    @ManyToOne
    @JoinColumn (name = "Estandar_ID")
    private Estandar estandar;
    
    
    @JsonIgnore
    @OneToMany (mappedBy = "dimension")
    private List<Tema> tema;
    
    @OneToOne
    @JoinTable(name="intermedia_retroalimenantacion_dimension"
    ,joinColumns = @JoinColumn(name = "	Dimension_ID")
    ,inverseJoinColumns = @JoinColumn(name = "Retroalimentacion_Dimensiones_ID"))
    private Retroalimentacion_Dimension retroalimentacion_dimensiones;

    public int getDimension_ID() {
        return Dimension_ID;
    }

    public void setDimension_ID(int Dimension_ID) {
        this.Dimension_ID = Dimension_ID;
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

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date Fecha_Creacion) {
        this.Fecha_Creacion = Fecha_Creacion;
    }

    public Date getFecha_Modificacion() {
        return Fecha_Modificacion;
    }

    public void setFecha_Modificacion(Date Fecha_Modificacion) {
        this.Fecha_Modificacion = Fecha_Modificacion;
    }

    public String getCodigo_dimension() {
        return codigo_dimension;
    }

    public void setCodigo_dimension(String codigo_dimension) {
        this.codigo_dimension = codigo_dimension;
    }

    public Estandar getEstandar() {
        return estandar;
    }

    public void setEstandar(Estandar estandar) {
        this.estandar = estandar;
    }

    public List<Tema> getTema() {
        return tema;
    }

    public void setTema(List<Tema> tema) {
        this.tema = tema;
    }

    public Retroalimentacion_Dimension getRetroalimentacion_dimensiones() {
        return retroalimentacion_dimensiones;
    }

    public void setRetroalimentacion_dimensiones(Retroalimentacion_Dimension retroalimentacion_dimensiones) {
        this.retroalimentacion_dimensiones = retroalimentacion_dimensiones;
    }

    

}
