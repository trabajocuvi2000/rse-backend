
package com.sinfloo.ejemplo01.entidades;

import javax.persistence.*;


@Entity
@Table (name = "encuestado_preguntas_cualitativa")
public class  Encuestado_Pregunta_Cualitativa{
    
    @Id
    @Column (name = "Encuestado_Preguntas_Cualitativa_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Encuestado_Preguntas_Cualitativa_ID;
    
    //@Column (name="Encuestado_ID")
    //private int Encuestado_ID;
    @ManyToOne
    @JoinColumn (name = "Encuestado_ID")
    private Encuestado encuestado;
    
    /*
    @OneToOne
    @JoinColumn (name = "Pregunta_Cualitativa_ID")
    private Preguntas_Cualitativas pregunta_Cualitativa;
    */

    //@Column (name = "Pregunta_Cualitativa_ID")
    //private int pregunta_Cualitativa_ID;

    
    @Column (name = "respuesta_pregunta")
    private float respuesta_pregunta;
    
    @Column (name = "pregunta_activa")
    private byte pregunta_activa;
    
    @Column (name = "comentario")
    private String comentario;
    
    @Column (name = "marcar_pregunta")
    private byte marcar_pregunta;
    
    @Column (name = "pregunta_respondida")
    private byte pregunta_respondida;

    public int getEncuestado_Preguntas_Cualitativa_ID() {
        return Encuestado_Preguntas_Cualitativa_ID;
    }

    public void setEncuestado_Preguntas_Cualitativa_ID(int Encuestado_Preguntas_Cualitativa_ID) {
        this.Encuestado_Preguntas_Cualitativa_ID = Encuestado_Preguntas_Cualitativa_ID;
    }
 
    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }
 
   

    public float getRespuesta_pregunta() {
        return respuesta_pregunta;
    }

    public void setRespuesta_pregunta(float respuesta_pregunta) {
        this.respuesta_pregunta = respuesta_pregunta;
    }

    public byte getPregunta_activa() {
        return pregunta_activa;
    }

    public void setPregunta_activa(byte pregunta_activa) {
        this.pregunta_activa = pregunta_activa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public byte getMarcar_pregunta() {
        return marcar_pregunta;
    }

    public void setMarcar_pregunta(byte marcar_pregunta) {
        this.marcar_pregunta = marcar_pregunta;
    }

    public byte getPregunta_respondida() {
        return pregunta_respondida;
    }

    public void setPregunta_respondida(byte pregunta_respondida) {
        this.pregunta_respondida = pregunta_respondida;
    }

    
    

}

