
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;


@Entity
@Table (name = "valores")
public class Valores {
    
    @Id
    @Column (name = "valores_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int valores_id;
    
    @Column (name = "valor_maximo")
    private int valor_maximo;
    
    @Column (name = "valor_minimo")
    private int valor_manimo;
    
    @Column (name = "valor_real")
    private int valor_real;

    public int getValores_id() {
        return valores_id;
    }

    public void setValores_id(int valores_id) {
        this.valores_id = valores_id;
    }

    public int getValor_maximo() {
        return valor_maximo;
    }

    public void setValor_maximo(int valor_maximo) {
        this.valor_maximo = valor_maximo;
    }

    public int getValor_manimo() {
        return valor_manimo;
    }

    public void setValor_manimo(int valor_manimo) {
        this.valor_manimo = valor_manimo;
    }

    public int getValor_real() {
        return valor_real;
    }

    public void setValor_real(int valor_real) {
        this.valor_real = valor_real;
    }
    
    
    
    
    
}
