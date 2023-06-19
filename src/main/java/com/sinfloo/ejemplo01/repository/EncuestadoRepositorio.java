
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Encuestado;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EncuestadoRepositorio extends JpaRepository<Encuestado, Integer>{
    
    
    
}
