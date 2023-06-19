package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Puntaje_Genaral;
import com.sinfloo.ejemplo01.repository.Retroalimentacion_Puntaje_GeneralRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Retroalimentacion_Puntaje_GeneralServiceImp implements Retroalimentacion_Puntaje_GeneralService {

    @Autowired
    private Retroalimentacion_Puntaje_GeneralRepositorio repositorio;

    @Override
    public Retroalimentacion_Puntaje_Genaral insertarRetroalimentacion_Puntaje_General(Retroalimentacion_Puntaje_Genaral p) {
        return repositorio.save(p);
    }

    @Override
    public List<Retroalimentacion_Puntaje_Genaral> listarRetroalimentacion_Puntaje_General() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Retroalimentacion_Puntaje_Genaral> listarID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Retroalimentacion_Puntaje_Genaral editar(Retroalimentacion_Puntaje_Genaral p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Retroalimentacion_Puntaje_Genaral> eliminar(int id) {
        Optional<Retroalimentacion_Puntaje_Genaral> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

}
