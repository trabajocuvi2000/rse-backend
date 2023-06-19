/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.proceso_evaluacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonnathan
 */
public class Indicadores_Resultados {

    private String nom_indicador_evaluado;
    private List<Integer> respuestas_preguntas = new ArrayList<>();
    private double valor_real = 0;
    private double valor_minimo = 0;
    private double valor_maximo = 0;
    private double valor_real_normalizado = 0;
    private double resultado_indicador_formula;

    public String getNom_indicador_evaluado() {
        return nom_indicador_evaluado;
    }

    public void setNom_indicador_evaluado(String nom_indicador_evaluado) {
        this.nom_indicador_evaluado = nom_indicador_evaluado;
    }

    public List<Integer> getRespuestas_preguntas() {
        return respuestas_preguntas;
    }

    public void setRespuestas_preguntas(List<Integer> respuestas_preguntas) {
        this.respuestas_preguntas = respuestas_preguntas;
    }

    public double getValor_real() {
        return valor_real;
    }

    public void setValor_real(double valor_real) {
        this.valor_real = valor_real;
    }

    public double getValor_minimo() {
        return valor_minimo;
    }

    public void setValor_minimo(double valor_minimo) {
        this.valor_minimo = valor_minimo;
    }

    public double getValor_maximo() {
        return valor_maximo;
    }

    public void setValor_maximo(double valor_maximo) {
        this.valor_maximo = valor_maximo;
    }

    public double getValor_real_normalizado() {
        return valor_real_normalizado;
    }

    public void setValor_real_normalizado(double valor_real_normalizado) {
        this.valor_real_normalizado = valor_real_normalizado;
    }

    public double getResultado_indicador_formula() {
        return resultado_indicador_formula;
    }

    public void setResultado_indicador_formula(double resultado_indicador_formula) {
        this.resultado_indicador_formula = resultado_indicador_formula;
    }


}
