
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Tema;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TemaRepositorio extends JpaRepository<Tema, Integer>{
    
}
