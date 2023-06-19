package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinfloo.ejemplo01.repository.IndicadorRepositorio;
import java.util.Optional;

@Service
public class IndicadorServiceImp implements IndicadorService {

    @Autowired
    private IndicadorRepositorio repositorio;

    @Override
    public List<Indicador> listarIndicador() {
        return repositorio.findAll();
    }

    @Override
    public Indicador ingresarIndicador(Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Indicador> listarID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Indicador editar(Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Indicador> eliminar(int id) {
        Optional<Indicador> p = repositorio.findById(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

}
