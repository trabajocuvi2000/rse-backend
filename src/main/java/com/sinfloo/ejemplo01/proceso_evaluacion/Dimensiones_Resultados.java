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
public class Dimensiones_Resultados {
    
    private String nom_dimension_evaluada;  // nombre de la diemnsion evaluada
    private List<Temas_Resultados> temas_resultados = new ArrayList<>(); // temas de esta dimension
    private double resultado_dimension = 0; // resultado de la evaluacion de esta dimension 
    private double numero_temas_normalizados = 0; // numeor de temas de esat dimenion 

    public String getNom_dimension_evaluada() {
        return nom_dimension_evaluada;
    }

    public void setNom_dimension_evaluada(String nom_dimension_evaluada) {
        this.nom_dimension_evaluada = nom_dimension_evaluada;
    }

    public List<Temas_Resultados> getTemas_resultados() {
        return temas_resultados;
    }

    public void setTemas_resultados(List<Temas_Resultados> temas_resultados) {
        this.temas_resultados = temas_resultados;
    }

    public double getResultado_dimension() {
        return resultado_dimension;
    }

    public void setResultado_dimension(double resultado_dimension) {
        this.resultado_dimension = resultado_dimension;
    }

    public double getNumero_temas_normalizados() {
        return numero_temas_normalizados;
    }

    public void setNumero_temas_normalizados(double numero_temas_normalizados) {
        this.numero_temas_normalizados = numero_temas_normalizados;
    }
    
    public boolean buscar_tema(String nom_tema_evaluada) {
        boolean resultado = false;
        Temas_Resultados buscarTema = null;
        Iterator<Temas_Resultados> it = this.temas_resultados.iterator();
        while (it.hasNext() && buscarTema == null) {
            Temas_Resultados p = it.next();
            if (p.getNom_tema_evaluado().equalsIgnoreCase(nom_tema_evaluada)) {
                resultado = true;
            }
        }
        return resultado;
    }
    
    public int getIndexTema(List<Temas_Resultados> a, String  target) {
        int valor = IntStream.range(0, a.size())
                .filter(i -> target.equals(a.get(i).getNom_tema_evaluado()))
                .findFirst()
                .orElse(-1);    // return -1 if the target is not found

        return valor;
    }
    
    
}
