
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Valores;
import com.sinfloo.ejemplo01.repository.ValoresRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValoresServiceImp implements ValoresService{
    
    @Autowired
    private ValoresRepositorio repositorio;

    @Override
    public Valores insertarValore(Valores p) {
        return repositorio.save(p);
    }

    @Override
    public List<Valores> listarValores() {
        return repositorio.findAll();
    }

    @Override
    public void eliminarDatos() {
        repositorio.deleteAll();
    }
    
}
