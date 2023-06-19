/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Tema;
import com.sinfloo.ejemplo01.repository.Retroalimentacion_TemaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonnathan
 */
@Service
public class Retroalimentacion_TemaServiceImp implements Retroalimentacion_TemaService{
    
    @Autowired
    private Retroalimentacion_TemaRepositorio repositorio;

    @Override
    public Retroalimentacion_Tema insertarRetroalimentacion_Tema(Retroalimentacion_Tema p) {
        return repositorio.save(p);
    }


    @Override
    public List<Retroalimentacion_Tema> listarRetroalimentacion_Tema() {
        return repositorio.findAll();
    }
    
}
