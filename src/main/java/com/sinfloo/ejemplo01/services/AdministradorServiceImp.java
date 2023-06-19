
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Administrador;
import com.sinfloo.ejemplo01.repository.AdministradorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImp implements AdministradorService{
    
    @Autowired
    private AdministradorRepositorio repositorio;

    @Override
    public Administrador insertarAdministrador(Administrador p) {
        return repositorio.save(p);
    }

    @Override
    public List<Administrador> listarAdministrador() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Administrador> listarID(int id) {
        return  repositorio.findById(id);
    }

    @Override
    public Administrador editar(Administrador p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Administrador> eliminar(int id) {
        Optional<Administrador> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }
    
    
    
    
    
}
