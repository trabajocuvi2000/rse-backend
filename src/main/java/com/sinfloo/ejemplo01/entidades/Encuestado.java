
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "encuestado")
public class Encuestado {
    
    @Id
    @Column (name = "Encuestado_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Encuestado_ID;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "correo")
    private String correo;
    @Column (name = "terminos_aceptacion")
    private String terminos_aceptacion;
    @Column (name = "tipo_cuenta")
    private String tipo_cuenta;
    
    @OneToOne
    @JoinColumn (name = "Empresa_ID")
    private Empresa empresa;

    public List<Encuestado_Pregunta_Cualitativa> getEncuestado_Pregunta_Cualitativa() {
        return encuestado_Pregunta_Cualitativa;
    }

    public void setEncuestado_Pregunta_Cualitativa(List<Encuestado_Pregunta_Cualitativa> encuestado_Pregunta_Cualitativa) {
        this.encuestado_Pregunta_Cualitativa = encuestado_Pregunta_Cualitativa;
    }
    
    @JsonIgnore
    @OneToMany (mappedBy = "encuestado")
    private List<Encuestado_Pregunta_Cualitativa> encuestado_Pregunta_Cualitativa;
    
    /*
    @OneToMany
    @JoinTable (name = "respuestas_indicadores"
    ,joinColumns = @JoinColumn (name = "Encuestado_ID")
    ,inverseJoinColumns = @JoinColumn (name = "Indicador_ID"))
    private List<Indicador> indicadores;
    */
   
    /*
    public List<Encuestado_Pregunta_Cualitativa> getEncuestado_Pregunta_Cualitativa() {
        return encuestado_Pregunta_Cualitativa;
    }

    public void setEncuestado_Pregunta_Cualitativa(List<Encuestado_Pregunta_Cualitativa> encuestado_Pregunta_Cualitativa) {
        this.encuestado_Pregunta_Cualitativa = encuestado_Pregunta_Cualitativa;
    }
    */
    
    
    public int getEncuestado_ID() {
        return Encuestado_ID;
    }

    public void setEncuestado_ID(int Encuestado_ID) {
        this.Encuestado_ID = Encuestado_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTerminos_aceptacion() {
        return terminos_aceptacion;
    }

    public void setTerminos_aceptacion(String terminos_aceptacion) {
        this.terminos_aceptacion = terminos_aceptacion;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    
    
    
}
