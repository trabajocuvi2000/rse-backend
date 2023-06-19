
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Valores_Indicadores;
import com.sinfloo.ejemplo01.repository.Valores_Indicadores_Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Valores_Indicadores_ServiceImp implements Valores_Indicadores_Service{
    
    @Autowired
    private Valores_Indicadores_Repositorio repositorio;

    @Override
    public Valores_Indicadores insertarValoresIndicadores(Valores_Indicadores p) {
        return repositorio.save(p);
    }

    @Override
    public List<Valores_Indicadores> listarValoresIndicadores() {
        return repositorio.findAll();
    }

    @Override
    public void eliminarValoresIndicadores() {
        repositorio.deleteAll();
    }
    
}
