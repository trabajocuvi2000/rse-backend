/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Respuestas_Indicadores_ServiceImp  implements Respuestas_Indicadores_Service{

    @Autowired
    private Respuestas_Indicadores_Respositorio respositorio;
    
    @Override
    public Respuestas_Indicadores insertarRespuestaIndicador(Respuestas_Indicadores p) {
        return  respositorio.save(p);
    }

    @Override
    public List<Respuestas_Indicadores> listarRespuestaIndicador() {
        return respositorio.findAll();
        
    }

    @Override
    public Respuestas_Indicadores listarID(int id) {
        return respositorio.getOne(id);
    }

    @Override
    public Respuestas_Indicadores editar(Respuestas_Indicadores p) {
        return respositorio.save(p);
    }

    @Override
    public Respuestas_Indicadores eliminar(int id) {
        Respuestas_Indicadores p = respositorio.getOne(id);
        if(p!=null){//comprobamos si el objeto existe
            respositorio.delete(p);
        }
        return p;
    }
    
}
