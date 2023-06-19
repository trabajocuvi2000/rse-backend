/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import com.sinfloo.ejemplo01.entidades.*;
import javax.persistence.*;

@Entity
@Table (name = "respuestas_indicadores")
public class Respuestas_Indicadores {
    
    @Id
    @Column (name = "Respuestas_Indicadores_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Respuestas_Indicadores_ID;
    
    @ManyToOne
    @JoinColumn (name = "Encuestado_ID")
    private Encuestado encuestado;
    
    @ManyToOne
    @JoinColumn (name = "Indicador_ID")
    private Indicador indicador;
    
    @Column(name = "cometario_usuario")
    private String cometario_usuario;

    public int getRespuestas_Indicadores_ID() {
        return Respuestas_Indicadores_ID;
    }

    public void setRespuestas_Indicadores_ID(int Respuestas_Indicadores_ID) {
        this.Respuestas_Indicadores_ID = Respuestas_Indicadores_ID;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }

    public String getCometario_usuario() {
        return cometario_usuario;
    }

    public void setCometario_usuario(String cometario_usuario) {
        this.cometario_usuario = cometario_usuario;
    }
    
    
}
