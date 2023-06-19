
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "indicador_preguntas_cualitativas")
public class Preguntas_Cualitativas_Indicador {
    
    @Id
    @Column (name = "Indicador_Preguntas_Cualitativas_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Indicador_Preguntas_Cualitativas_ID;
    
    @Column (name = "Indicador_ID")
    private int Indicador_ID;
    
    @Column (name = "Pregunta_Cualitativa_ID")
    private int Pregunta_Cualitativa_ID;

    public int getIndicador_Preguntas_Cualitativas_ID() {
        return Indicador_Preguntas_Cualitativas_ID;
    }

    public void setIndicador_Preguntas_Cualitativas_ID(int Indicador_Preguntas_Cualitativas_ID) {
        this.Indicador_Preguntas_Cualitativas_ID = Indicador_Preguntas_Cualitativas_ID;
    }

    public int getIndicador_ID() {
        return Indicador_ID;
    }

    public void setIndicador_ID(int Indicador_ID) {
        this.Indicador_ID = Indicador_ID;
    }

    public int getPregunta_Cualitativa_ID() {
        return Pregunta_Cualitativa_ID;
    }

    public void setPregunta_Cualitativa_ID(int Pregunta_Cualitativa_ID) {
        this.Pregunta_Cualitativa_ID = Pregunta_Cualitativa_ID;
    }
    
    
    
}
