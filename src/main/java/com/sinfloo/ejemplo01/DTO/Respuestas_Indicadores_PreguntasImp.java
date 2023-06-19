/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Respuestas_Indicadores_PreguntasImp implements Respuestas_Indicadores_Preguntas_Service{

    @Autowired
    Respuestas_Indicadores_Preguntas_Repositorio repositorio;

    @Override
    public List<Respuestas_Indicadores_Preguntas> listarRespuestasIndicadoresPreguntas() {
        return repositorio.findAll();
    }

    @Override
    public Respuestas_Indicadores_Preguntas instatarRespuestasIndicadoresPreguntas(Respuestas_Indicadores_Preguntas p) {
        return repositorio.save(p);
    }

    @Override
    public Respuestas_Indicadores_Preguntas listarID(int id) {
        return repositorio.getOne(id);
    }

    @Override
    public Respuestas_Indicadores_Preguntas editar(Respuestas_Indicadores_Preguntas p) {
        return repositorio.save(p);
    }

    @Override
    public Respuestas_Indicadores_Preguntas eliminar(int id) {
        Respuestas_Indicadores_Preguntas p = repositorio.getOne(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }
    
    
    
}
