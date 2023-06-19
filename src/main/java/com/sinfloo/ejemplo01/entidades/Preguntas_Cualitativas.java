
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "preguntas_cualitativas")
public class Preguntas_Cualitativas {
    
    @Id
    @Column (name = "Pregunta_Cualitativa_ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Pregunta_Cualitativa_ID;
    
    @Column (name = "pregunta_cualitativa")
    private String pregunta_cualitativa;
    
    @Column (name = "Fecha_Creacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Creacion;
    
    @Column (name = "Fecha_Modificacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Modificacion;
    
    @Column (name = "codigo_pegunta_cualitativa")
    private String codigo_pegunta_cualitativa;

    public int getPregunta_Cualitativa_ID() {
        return Pregunta_Cualitativa_ID;
    }

    public void setPregunta_Cualitativa_ID(int Pregunta_Cualitativa_ID) {
        this.Pregunta_Cualitativa_ID = Pregunta_Cualitativa_ID;
    }

    public String getPregunta_cualitativa() {
        return pregunta_cualitativa;
    }

    public void setPregunta_cualitativa(String pregunta_cualitativa) {
        this.pregunta_cualitativa = pregunta_cualitativa;
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

    public String getCodigo_pegunta_cualitativa() {
        return codigo_pegunta_cualitativa;
    }

    public void setCodigo_pegunta_cualitativa(String codigo_pegunta_cualitativa) {
        this.codigo_pegunta_cualitativa = codigo_pegunta_cualitativa;
    }
    
    
    
    
    
}
