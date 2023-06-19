
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.*;
import java.util.List;
import java.util.Optional;

public interface Retroalimentacion_Puntaje_GeneralService {
    
    Retroalimentacion_Puntaje_Genaral insertarRetroalimentacion_Puntaje_General(Retroalimentacion_Puntaje_Genaral p);
    List<Retroalimentacion_Puntaje_Genaral> listarRetroalimentacion_Puntaje_General();
    Optional<Retroalimentacion_Puntaje_Genaral> listarID(int id);
    Retroalimentacion_Puntaje_Genaral editar(Retroalimentacion_Puntaje_Genaral p);
    Optional<Retroalimentacion_Puntaje_Genaral> eliminar(int id);
}
