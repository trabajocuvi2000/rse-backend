 
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Encuestado;
import com.sinfloo.ejemplo01.repository.EncuestadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestadoServiceImp implements EncuestadoService{

    @Autowired
    private EncuestadoRepositorio repositorio;
    
    @Override
    public List<Encuestado> listarEncuesatdos() {
        return repositorio.findAll();
    }
    
}
