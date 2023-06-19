
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//https://programmerclick.com/article/6994892329/ FECHAS
//https://stackoverflow.com/questions/27516499/json-date-format-in-spring-boot  fechas
@Entity
@Table (name = "estandar")
public class Estandar {
    
    @Id
    @Column (name = "Estandar_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Estandar_ID;
    @Column (name = "Nombre")
    private String Nombre;
    @Column (name = "Descripcion")
    private String Descripcion;
    @Column (name = "Anio_Creacion")
    private String Anio_Creacion;
    @Column (name = "Anio_Vigencia")
    private  String Anio_Vigencia;
    @Column (name = "Version")
    private String Version;
    @Column (name = "Institucion_Pertenencia")
    private  String Institucion_Pertenencia;
    @Column (name = "Pais_Origen")
    private String Pais_Origen;
    @Column (name = "Region_Aplica")
    private String Region_Aplica;
    @Column (name = "Pagina_Oficial")
    private String Pagina_Oficial;
    @Column (name = "Fecha_Creacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Creacion;
    @Column (name = "Fecha_Modificacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Modificacion;
    @Column (name = "codigo_estandar")
    private String codigo_estandar;
      
    
    @JsonIgnore
    @OneToMany (mappedBy = "estandar")
    private List<Dimension> dimension;
 
    
    @OneToOne
    @JoinTable(name="intermedia_retroalimentacion_estandar"
    ,joinColumns = @JoinColumn(name = "	Estandar_ID")
    ,inverseJoinColumns = @JoinColumn(name = "Retroalimenantacion_Estandar_ID"))
    private Retroalimentacion_Puntaje_Genaral retroalimentacion_puntaje_genaral;

    public int getEstandar_ID() {
        return Estandar_ID;
    }

    public void setEstandar_ID(int Estandar_ID) {
        this.Estandar_ID = Estandar_ID;
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

    public String getAnio_Creacion() {
        return Anio_Creacion;
    }

    public void setAnio_Creacion(String Anio_Creacion) {
        this.Anio_Creacion = Anio_Creacion;
    }

    public String getAnio_Vigencia() {
        return Anio_Vigencia;
    }

    public void setAnio_Vigencia(String Anio_Vigencia) {
        this.Anio_Vigencia = Anio_Vigencia;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getInstitucion_Pertenencia() {
        return Institucion_Pertenencia;
    }

    public void setInstitucion_Pertenencia(String Institucion_Pertenencia) {
        this.Institucion_Pertenencia = Institucion_Pertenencia;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public String getRegion_Aplica() {
        return Region_Aplica;
    }

    public void setRegion_Aplica(String Region_Aplica) {
        this.Region_Aplica = Region_Aplica;
    }

    public String getPagina_Oficial() {
        return Pagina_Oficial;
    }

    public void setPagina_Oficial(String Pagina_Oficial) {
        this.Pagina_Oficial = Pagina_Oficial;
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

    public String getCodigo_estandar() {
        return codigo_estandar;
    }

    public void setCodigo_estandar(String codigo_estandar) {
        this.codigo_estandar = codigo_estandar;
    }

    public List<Dimension> getDimension() {
        return dimension;
    }

    public void setDimension(List<Dimension> dimension) {
        this.dimension = dimension;
    }

    public Retroalimentacion_Puntaje_Genaral getRetroalimentacion_puntaje_genaral() {
        return retroalimentacion_puntaje_genaral;
    }

    public void setRetroalimentacion_puntaje_genaral(Retroalimentacion_Puntaje_Genaral retroalimentacion_puntaje_genaral) {
        this.retroalimentacion_puntaje_genaral = retroalimentacion_puntaje_genaral;
    }

    
   
}
