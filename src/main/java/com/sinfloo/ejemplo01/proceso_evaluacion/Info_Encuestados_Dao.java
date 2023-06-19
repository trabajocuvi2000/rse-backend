/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.proceso_evaluacion;

import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores;
import com.sinfloo.ejemplo01.entidades.Encuestado;
import com.sinfloo.ejemplo01.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Jonnathan
 */
public interface Info_Encuestados_Dao {
    List<Encuestado> getEncuestados(); //obtenemos los encuetsado 

    // obtenemos el encuestado ID
    List<Usuario> getUsuarioId(int id_usuario);
    
    // obtenemos las respuestas por inidcadores del ecnuetado ID
    List<Respuestas_Indicadores> getRespuestasIndicadoresEncuestado(int id_encuestado);
    // obtenemos solo las respuestas de ese indicador
    
    Resultados_Evaluacion getData (int id_usuario);
    
    Resultados_Evaluacion getEvaluationFull (int id_usuario);
}
