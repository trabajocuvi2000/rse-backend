
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Encuestado_Pregunta_Cualitativa;
import java.util.List;


public interface Encuestado_Pregunta_CualitativaService {
    
    Encuestado_Pregunta_Cualitativa insertarEncuestado_Pregunta_Cualitativa (Encuestado_Pregunta_Cualitativa p);
    List<Encuestado_Pregunta_Cualitativa> listarEncuestado_Pregunta_Cualitativa();
    
}
