
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Dimension;
import java.util.List;
import java.util.Optional;

public interface DimensionService {
    
    Dimension insertarDimension(Dimension p); 
    List<Dimension> listarDimensiones();
    Optional<Dimension> listarID(int id);
    Dimension editar(Dimension p);
    Optional<Dimension> eliminar(int id);
}
