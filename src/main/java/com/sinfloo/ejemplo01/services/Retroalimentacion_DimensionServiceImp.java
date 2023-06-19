/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Dimension;
import com.sinfloo.ejemplo01.repository.Retroalimentacion_DimensionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonnathan
 */
@Service
public class Retroalimentacion_DimensionServiceImp implements Retroalimentacion_DimensionService{

    @Autowired
    private Retroalimentacion_DimensionRepositorio repositorio;
    
    @Override
    public Retroalimentacion_Dimension insertarRetroalimentacion_Dimension(Retroalimentacion_Dimension p) {
        return repositorio.save(p);
    }

    @Override
    public List<Retroalimentacion_Dimension> listarRetroalimentacion_Dimension() {
        return repositorio.findAll();
    }
    
}
