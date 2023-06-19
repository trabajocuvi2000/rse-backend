
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Dimension;
import com.sinfloo.ejemplo01.repository.DimensionRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DimensionServiceImp implements DimensionService{

    @Autowired
    private DimensionRepositorio repositorio;
    
    @Override
    public Dimension insertarDimension(Dimension p) {
        return repositorio.save(p);
    }

    @Override
    public List<Dimension> listarDimensiones() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Dimension> listarID(int id) {
        return  repositorio.findById(id);
    }

    @Override
    public Dimension editar(Dimension p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Dimension> eliminar(int id) {
        Optional<Dimension> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }
    
}
