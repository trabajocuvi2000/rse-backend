
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Indicador;
import java.util.List;

public interface Retroalimentacion_IndicadorService {
    
    Retroalimentacion_Indicador insertarRetroalimentacion_Indicador(Retroalimentacion_Indicador p);
    List <Retroalimentacion_Indicador> listarRetroalimentacion_Indicador();
    
}
