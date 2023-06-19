
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Indicador;
import com.sinfloo.ejemplo01.repository.Retroalimentacion_IndicadorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonnathan
 */
@Service
public class Retroalimentacion_IndicadorServiceImp implements Retroalimentacion_IndicadorService{

    @Autowired
    private Retroalimentacion_IndicadorRepositorio repositorio;
    
    @Override
    public Retroalimentacion_Indicador insertarRetroalimentacion_Indicador(Retroalimentacion_Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public List<Retroalimentacion_Indicador> listarRetroalimentacion_Indicador() {
        return repositorio.findAll();
    }
    
}
