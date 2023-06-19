
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Encuestado_Pregunta_Cualitativa;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Encuestado_Pregunta_CualitativaRepositorio extends JpaRepository<Encuestado_Pregunta_Cualitativa, Integer>{
    
}
