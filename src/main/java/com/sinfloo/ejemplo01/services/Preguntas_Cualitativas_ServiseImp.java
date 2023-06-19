/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas;
import com.sinfloo.ejemplo01.repository.Preguntas_Cualitativas_Repositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonnathan
 */
@Service
public class Preguntas_Cualitativas_ServiseImp implements Preguntas_Cualitativas_Service{

    @Autowired
    private Preguntas_Cualitativas_Repositorio repositorio;
    
    @Override
    public Preguntas_Cualitativas insertarPreguntasCualitativas(Preguntas_Cualitativas p) {
        return repositorio.save(p);
    }

    @Override
    public List<Preguntas_Cualitativas> listarPreguntasCualitativas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Preguntas_Cualitativas> listarID(int id) {
        return  repositorio.findById(id);
    }

    @Override
    public Preguntas_Cualitativas editar(Preguntas_Cualitativas p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Preguntas_Cualitativas> eliminar(int id) {
        Optional<Preguntas_Cualitativas> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }
    
}
