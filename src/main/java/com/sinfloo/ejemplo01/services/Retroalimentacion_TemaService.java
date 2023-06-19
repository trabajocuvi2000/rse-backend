
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Tema;
import java.util.List;

public interface Retroalimentacion_TemaService {
    
    Retroalimentacion_Tema insertarRetroalimentacion_Tema(Retroalimentacion_Tema p);
    List <Retroalimentacion_Tema> listarRetroalimentacion_Tema();
    
}
