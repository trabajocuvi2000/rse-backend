/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas;
import javax.persistence.*;

@Entity
@Table (name = "respuestas_indicadores_preguntas")
public class Respuestas_Indicadores_Preguntas {
    
    @Id
    @Column (name = "Respuestas_Indicadores_Preguntas_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Respuestas_Indicadores_Preguntas_ID;
    
    @Column(name = "Respuesta")
    private int Respuesta;
    
    //@ManyToOne (cascade = CascadeType.ALL)//para que ingrese en lass dos tablas a la ves
    @ManyToOne
    @JoinColumn (name = "Respuestas_Indicadores_ID")
    private Respuestas_Indicadores respuestasaIndicadores;
    
    @ManyToOne
    @JoinColumn (name = "Pregunta_Cualitativa_ID")
    private Preguntas_Cualitativas preguntasCualitativas;

    public int getRespuestas_Indicadores_Preguntas_ID() {
        return Respuestas_Indicadores_Preguntas_ID;
    }

    public void setRespuestas_Indicadores_Preguntas_ID(int Respuestas_Indicadores_Preguntas_ID) {
        this.Respuestas_Indicadores_Preguntas_ID = Respuestas_Indicadores_Preguntas_ID;
    }

    public int getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(int Respuesta) {
        this.Respuesta = Respuesta;
    }

    public Respuestas_Indicadores getRespuestasaIndicadores() {
        return respuestasaIndicadores;
    }

    public void setRespuestasaIndicadores(Respuestas_Indicadores respuestasaIndicadores) {
        this.respuestasaIndicadores = respuestasaIndicadores;
    }

    public Preguntas_Cualitativas getPreguntasCualitativas() {
        return preguntasCualitativas;
    }

    public void setPreguntasCualitativas(Preguntas_Cualitativas preguntasCualitativas) {
        this.preguntasCualitativas = preguntasCualitativas;
    }
    
    
    
    
}
