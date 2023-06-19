
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Encuestado_Pregunta_Cualitativa;
import com.sinfloo.ejemplo01.repository.Encuestado_Pregunta_CualitativaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Encuestado_Pregunta_CualitativaServiceImp implements Encuestado_Pregunta_CualitativaService{
    
    @Autowired
    private  Encuestado_Pregunta_CualitativaRepositorio encuestado_Pregunta_CualitativaRepositorio;

    @Override
    public Encuestado_Pregunta_Cualitativa insertarEncuestado_Pregunta_Cualitativa(Encuestado_Pregunta_Cualitativa p) {
        return encuestado_Pregunta_CualitativaRepositorio.save(p);
    }

    @Override
    public List<Encuestado_Pregunta_Cualitativa> listarEncuestado_Pregunta_Cualitativa() {
        return encuestado_Pregunta_CualitativaRepositorio.findAll();
    }
    
}
