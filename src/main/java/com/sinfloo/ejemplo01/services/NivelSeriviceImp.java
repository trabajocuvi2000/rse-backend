package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Nivel;
import com.sinfloo.ejemplo01.repository.NivelRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelSeriviceImp implements NivelSerivice {

    @Autowired
    private NivelRepositorio repositorio;

    @Override
    public Nivel insertarNivel(Nivel p) {
        return repositorio.save(p);
    }

    @Override
    public List<Nivel> listarNivel() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Nivel> listarID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Nivel editar(Nivel p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Nivel> eliminar(int id) {
        Optional<Nivel> p = repositorio.findById(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

}
