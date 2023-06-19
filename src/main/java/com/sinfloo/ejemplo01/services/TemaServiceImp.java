package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Tema;
import com.sinfloo.ejemplo01.repository.TemaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaServiceImp implements TemaService {

    @Autowired
    private TemaRepositorio repositorio;

    @Override
    public Tema insertarTema(Tema p) {
        return repositorio.save(p);
    }

    @Override
    public List<Tema> listarTema() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Tema> listarID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Tema editar(Tema p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Tema> eliminar(int id) {
        Optional<Tema> p = repositorio.findById(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

}
