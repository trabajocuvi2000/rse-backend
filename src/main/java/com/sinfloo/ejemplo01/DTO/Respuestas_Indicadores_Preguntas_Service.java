/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import java.util.List;

/**
 *
 * @author Jonnathan
 */
public interface Respuestas_Indicadores_Preguntas_Service {
    
    List<Respuestas_Indicadores_Preguntas> listarRespuestasIndicadoresPreguntas();
    Respuestas_Indicadores_Preguntas instatarRespuestasIndicadoresPreguntas(Respuestas_Indicadores_Preguntas p);
    Respuestas_Indicadores_Preguntas listarID(int id);
    Respuestas_Indicadores_Preguntas editar(Respuestas_Indicadores_Preguntas p);
    Respuestas_Indicadores_Preguntas eliminar(int id);
    
}
