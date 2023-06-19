/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jonnathan
 */
public interface Preguntas_Cualitativas_Repositorio extends JpaRepository<Preguntas_Cualitativas, Integer>{
    
}
