/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jonnathan
 */
public interface Respuestas_Indicadores_Preguntas_Repositorio extends JpaRepository<Respuestas_Indicadores_Preguntas, Integer>{
    
}
