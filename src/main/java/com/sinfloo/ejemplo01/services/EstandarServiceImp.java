
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estandar;
import com.sinfloo.ejemplo01.repository.EstandarRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstandarServiceImp implements EstandarService{

    @Autowired
    private EstandarRepositorio repositorio;
    
    @Override
    public Estandar insertarEstandar(Estandar p) {
        return repositorio.save(p);
    }

    @Override
    public List<Estandar> listarEstandares() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Estandar> listarID(int id) {
       return repositorio.findById(id);
    }

    @Override
    public Estandar editar(Estandar p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Estandar> eliminar(int id) {
        Optional<Estandar> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }
    
}
