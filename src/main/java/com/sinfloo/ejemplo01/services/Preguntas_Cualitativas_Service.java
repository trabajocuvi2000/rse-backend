/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jonnathan
 */
public interface Preguntas_Cualitativas_Service {
    
    Preguntas_Cualitativas insertarPreguntasCualitativas(Preguntas_Cualitativas p);
    List <Preguntas_Cualitativas> listarPreguntasCualitativas();
    Optional<Preguntas_Cualitativas> listarID(int id);
    Preguntas_Cualitativas editar(Preguntas_Cualitativas p);
    Optional<Preguntas_Cualitativas> eliminar(int id);
    
}
