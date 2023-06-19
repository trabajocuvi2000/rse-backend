package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "indicador")
public class Indicador {

    @Id
    @Column(name = "Indicador_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Indicador_ID;
    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "Tema_ID")
    private Tema tema;

    @ManyToOne
    @JoinColumn(name = "Nivel_ID")
    private Nivel nivel;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "Fecha_Creacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Creacion;

    @Column(name = "Fecha_Modificacion")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date Fecha_Modificacion;

    @Column(name = "codigo_indicador")
    private String codigo_indicador;

    //____________________________
    //muchas preguntas para un indicador 
    @OneToMany
    @JoinTable(name = "indicador_preguntas_cualitativas",
             joinColumns = @JoinColumn(name = "Indicador_ID"),
             inverseJoinColumns = @JoinColumn(name = "Pregunta_Cualitativa_ID"))
    private List<Preguntas_Cualitativas> preguntas_cualitativas;

    @OneToOne
    @JoinTable(name = "intermedia_retroalimentacion_indicador",
             joinColumns = @JoinColumn(name = "	Indicador_ID"),
             inverseJoinColumns = @JoinColumn(name = "Retroalimentacion_Indicador_ID"))
    private Retroalimentacion_Indicador retroalimentacion_indicadores;

    //____________________________
    public int getIndicador_ID() {
        return Indicador_ID;
    }

    public void setIndicador_ID(int Indicador_ID) {
        this.Indicador_ID = Indicador_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getCodigo_indicador() {
        return codigo_indicador;
    }

    public void setCodigo_indicador(String codigo_indicador) {
        this.codigo_indicador = codigo_indicador;
    }

    public List<Preguntas_Cualitativas> getPreguntas_cualitativas() {
        return preguntas_cualitativas;
    }

    public void setPreguntas_cualitativas(List<Preguntas_Cualitativas> preguntas_cualitativas) {
        this.preguntas_cualitativas = preguntas_cualitativas;
    }

    public Retroalimentacion_Indicador getRetroalimentacion_indicadores() {
        return retroalimentacion_indicadores;
    }

    public void setRetroalimentacion_indicadores(Retroalimentacion_Indicador retroalimentacion_indicadores) {
        this.retroalimentacion_indicadores = retroalimentacion_indicadores;
    }

}
