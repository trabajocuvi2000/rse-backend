
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "retroalimentacion_temas")
public class Retroalimentacion_Tema {
    
    @Id
    @Column(name = "Retroalimenantacion_Temas_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Retroalimenantacion_Temas_ID;

    @Column (name = "retroalimentacion_bueno")
    private String retroalimentacion_bueno;
    
    @Column (name = "retroalimentacion_regular")
    private String retroalimentacion_regular;
    
    @Column (name = "retroalimentacion_malo")
    private String retroalimentacion_malo;

    public int getRetroalimenantacion_Temas_ID() {
        return Retroalimenantacion_Temas_ID;
    }

    public void setRetroalimenantacion_Temas_ID(int Retroalimenantacion_Temas_ID) {
        this.Retroalimenantacion_Temas_ID = Retroalimenantacion_Temas_ID;
    }

    public String getRetroalimentacion_bueno() {
        return retroalimentacion_bueno;
    }

    public void setRetroalimentacion_bueno(String retroalimentacion_bueno) {
        this.retroalimentacion_bueno = retroalimentacion_bueno;
    }

    public String getRetroalimentacion_regular() {
        return retroalimentacion_regular;
    }

    public void setRetroalimentacion_regular(String retroalimentacion_regular) {
        this.retroalimentacion_regular = retroalimentacion_regular;
    }

    public String getRetroalimentacion_malo() {
        return retroalimentacion_malo;
    }

    public void setRetroalimentacion_malo(String retroalimentacion_malo) {
        this.retroalimentacion_malo = retroalimentacion_malo;
    }
    
    
    
}
