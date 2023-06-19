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
public class Temas_Resultados {
    
    private String nom_tema_evaluado;
    private String img_tema_enlace;
    private List<Indicadores_Resultados> indicadores_resultados = new ArrayList<>();
    private double resultado_tema_formula=0;
    private double numero_indicadores_normalizados;

    public String getNom_tema_evaluado() {
        return nom_tema_evaluado;
    }

    public void setNom_tema_evaluado(String nom_tema_evaluado) {
        this.nom_tema_evaluado = nom_tema_evaluado;
    }

    public List<Indicadores_Resultados> getIndicadores_resultados() {
        return indicadores_resultados;
    }

    public void setIndicadores_resultados(List<Indicadores_Resultados> indicadores_resultados) {
        this.indicadores_resultados = indicadores_resultados;
    }

    public double getResultado_tema_formula() {
        return resultado_tema_formula;
    }

    public void setResultado_tema_formula(double resultado_tema_formula) {
        this.resultado_tema_formula = resultado_tema_formula;
    }

    

    public double getNumero_indicadores_normalizados() {
        return numero_indicadores_normalizados;
    }

    public void setNumero_indicadores_normalizados(double numero_indicadores_normalizados) {
        this.numero_indicadores_normalizados = numero_indicadores_normalizados;
    }

    public String getImg_tema_enlace() {
        return img_tema_enlace;
    }

    public void setImg_tema_enlace(String img_tema_enlace) {
        this.img_tema_enlace = img_tema_enlace;
    }

    

    public boolean buscar_indicador(String nom_indicador_evaluado) {
        boolean resultado = false;
        Indicadores_Resultados buscarIndicador = null;
        Iterator<Indicadores_Resultados> it = this.indicadores_resultados.iterator();
        while (it.hasNext() && buscarIndicador == null) {
            Indicadores_Resultados p = it.next();
            if (p.getNom_indicador_evaluado().equalsIgnoreCase(nom_indicador_evaluado)) {
                resultado = true;
            }
        }
        return resultado;
    }
    
    public int getIndexIndicador(List<Indicadores_Resultados> a, String  target) {
        int valor = IntStream.range(0, a.size())
                .filter(i -> target.equals(a.get(i).getNom_indicador_evaluado()))
                .findFirst()
                .orElse(-1);    // return -1 if the target is not found

        return valor;
    }
    
}
