/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Dimension;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Retroalimentacion_DimensionRepositorio extends JpaRepository<Retroalimentacion_Dimension, Integer> {
    
}
