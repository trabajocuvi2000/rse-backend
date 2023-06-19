
package com.sinfloo.ejemplo01.entidades;

import javax.persistence.*;

@Entity
@Table (name = "valores_indicadores")
public class Valores_Indicadores {
    
    @Id
    @Column (name = "valores_indicadores_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int valores_indicadores_id;
    
    @Column (name = "numero_indicador")
    private int numero_indicador;

    public int getValores_indicadores_id() {
        return valores_indicadores_id;
    }

    public void setValores_indicadores_id(int valores_indicadores_id) {
        this.valores_indicadores_id = valores_indicadores_id;
    }

    public int getNumero_indicador() {
        return numero_indicador;
    }

    public void setNumero_indicador(int numero_indicador) {
        this.numero_indicador = numero_indicador;
    }
    
    
}
