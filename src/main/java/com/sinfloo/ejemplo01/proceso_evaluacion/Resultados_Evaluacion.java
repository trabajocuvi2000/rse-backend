/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.proceso_evaluacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Jonnathan
 */
public class Resultados_Evaluacion {
    
    private double resultado_final = 0;
    private List<Dimensiones_Resultados> dimensiones_resultados = new ArrayList<>();
    private double numero_dimensiones_normalizadas;

    public double getResultado_final() {
        return resultado_final;
    }

    public void setResultado_final(double resultado_final) {
        this.resultado_final = resultado_final;
    }

   

    public List<Dimensiones_Resultados> getDimensiones_resultados() {
        return dimensiones_resultados;
    }

    public void setDimensiones_resultados(List<Dimensiones_Resultados> dimensiones_resultados) {
        this.dimensiones_resultados = dimensiones_resultados;
    }

    public double getNumero_dimensiones_normalizadas() {
        return numero_dimensiones_normalizadas;
    }

    public void setNumero_dimensiones_normalizadas(double numero_dimensiones_normalizadas) {
        this.numero_dimensiones_normalizadas = numero_dimensiones_normalizadas;
    }
    
    public boolean buscar_dimension(String nom_dim_evaluada) {
        boolean resultado = false;
        Dimensiones_Resultados buscarDimension = null;
        Iterator<Dimensiones_Resultados> it = this.dimensiones_resultados.iterator();
        while (it.hasNext() && buscarDimension == null) {
            Dimensiones_Resultados p = it.next();
            if (p.getNom_dimension_evaluada().equalsIgnoreCase(nom_dim_evaluada)) {
                resultado = true;
            }
        }
        return resultado;
    }
    
    
    public int getIndex(List<Dimensiones_Resultados> a, String  target) {
        int valor = IntStream.range(0, a.size())
                .filter(i -> target.equals(a.get(i).getNom_dimension_evaluada()))
                .findFirst()
                .orElse(-1);    // return -1 if the target is not found

        return valor;
    }
    
}
