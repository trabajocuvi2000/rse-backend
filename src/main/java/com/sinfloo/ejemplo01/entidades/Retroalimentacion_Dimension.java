package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "retroalimentacion_dimensiones")
public class Retroalimentacion_Dimension {

    @Id
    @Column(name = "Retroalimentacion_Dimensiones_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Retroalimentacion_Dimensiones_ID;

    @Column (name = "retroalimentacion_bueno")
    private String retroalimentacion_bueno;
    
    @Column (name = "retroalimentacion_regular")
    private String retroalimentacion_regular;
    
    @Column (name = "retroalimentacion_malo")
    private String retroalimentacion_malo;

    public int getRetroalimentacion_Dimensiones_ID() {
        return Retroalimentacion_Dimensiones_ID;
    }

    public void setRetroalimentacion_Dimensiones_ID(int Retroalimentacion_Dimensiones_ID) {
        this.Retroalimentacion_Dimensiones_ID = Retroalimentacion_Dimensiones_ID;
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
