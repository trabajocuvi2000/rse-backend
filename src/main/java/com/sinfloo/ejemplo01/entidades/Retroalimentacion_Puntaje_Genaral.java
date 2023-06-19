
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "retroalimentacion_puntaje_general")
public class Retroalimentacion_Puntaje_Genaral {
    @Id
    @Column (name = "Retroalimenantacion_Estandar_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Retroalimenantacion_Estandar_ID;
    
    @Column (name = "retroalimentacion_bueno")
    private String retroalimentacion_bueno;
    
    @Column (name = "retroalimentacion_regular")
    private String retroalimentacion_regular;
    
    @Column (name = "retroalimentacion_malo")
    private String retroalimentacion_malo;
   

    public int getRetroalimenantacion_Estandar_ID() {
        return Retroalimenantacion_Estandar_ID;
    }

    public void setRetroalimenantacion_Estandar_ID(int Retroalimenantacion_Estandar_ID) {
        this.Retroalimenantacion_Estandar_ID = Retroalimenantacion_Estandar_ID;
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
