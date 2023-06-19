
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Dimension;
import java.util.List;

public interface Retroalimentacion_DimensionService {
 
    Retroalimentacion_Dimension insertarRetroalimentacion_Dimension(Retroalimentacion_Dimension p);
    List <Retroalimentacion_Dimension> listarRetroalimentacion_Dimension();
    
}
