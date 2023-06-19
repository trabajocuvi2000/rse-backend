
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas_Indicador;
import com.sinfloo.ejemplo01.repository.Preguntas_Cualitativas_IndicadorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Preguntas_Cualitativas_IndicadorServiceImp implements Preguntas_Cualitativas_IndicadorService{
    
    @Autowired
    private Preguntas_Cualitativas_IndicadorRepositorio repositorio;

    @Override
    public Preguntas_Cualitativas_Indicador insertarPregunta_Cualitativa_Indicador(Preguntas_Cualitativas_Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public List<Preguntas_Cualitativas_Indicador> listarPreguntas_Culitativas_Inidador() {
        return repositorio.findAll();
    }


    @Override
    public Optional<Preguntas_Cualitativas_Indicador> listarID(int id) {
        return  repositorio.findById(id);
    }

    @Override
    public Preguntas_Cualitativas_Indicador editar(Preguntas_Cualitativas_Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Preguntas_Cualitativas_Indicador> eliminar(int id) {
        Optional<Preguntas_Cualitativas_Indicador> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

    
}
