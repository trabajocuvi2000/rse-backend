
package com.sinfloo.ejemplo01.DTO;

import java.util.List;


public interface Respuestas_Indicadores_Service {
    
    Respuestas_Indicadores insertarRespuestaIndicador(Respuestas_Indicadores p);
    List<Respuestas_Indicadores> listarRespuestaIndicador();
    Respuestas_Indicadores listarID(int id);
    Respuestas_Indicadores editar(Respuestas_Indicadores p);
    Respuestas_Indicadores eliminar(int id);
    
}
