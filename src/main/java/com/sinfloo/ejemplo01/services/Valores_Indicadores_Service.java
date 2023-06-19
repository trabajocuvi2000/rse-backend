
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Valores_Indicadores;
import java.util.List;


public interface Valores_Indicadores_Service {
    
    Valores_Indicadores insertarValoresIndicadores(Valores_Indicadores p);
    List<Valores_Indicadores> listarValoresIndicadores();
    void eliminarValoresIndicadores();
}
