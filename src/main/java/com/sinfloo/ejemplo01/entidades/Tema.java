
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "tema")
public class Tema {
    
    @Id
    @Column (name = "Tema_ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Tema_ID;
    
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
    
    @Column (name = "codigo_tema")
    private String codigo_tema;
    
    @Column (name = "img_enlace")
    private String img_enlace;
    
    @ManyToOne
    @JoinColumn (name = "Dimension_ID")
    private Dimension dimension;
    
    @OneToOne
    @JoinTable(name="intermedia_retroalimentacion_tema"
    ,joinColumns = @JoinColumn(name = "	Tema_ID")
    ,inverseJoinColumns = @JoinColumn(name = "Retroalimenantacion_Dimensiones_ID"))
    private Retroalimentacion_Tema retroalimentacion_temas;
    

    public int getTema_ID() {
        return Tema_ID;
    }

    public void setTema_ID(int Tema_ID) {
        this.Tema_ID = Tema_ID;
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

    public String getCodigo_tema() {
        return codigo_tema;
    }

    public void setCodigo_tema(String codigo_tema) {
        this.codigo_tema = codigo_tema;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Retroalimentacion_Tema getRetroalimentacion_temas() {
        return retroalimentacion_temas;
    }

    public void setRetroalimentacion_temas(Retroalimentacion_Tema retroalimentacion_temas) {
        this.retroalimentacion_temas = retroalimentacion_temas;
    }

    public String getImg_enlace() {
        return img_enlace;
    }

    public void setImg_enlace(String img_enlace) {
        this.img_enlace = img_enlace;
    }

    
  
}
