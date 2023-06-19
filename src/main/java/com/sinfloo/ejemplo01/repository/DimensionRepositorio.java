
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Dimension;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimensionRepositorio extends JpaRepository<Dimension, Integer>{
    
}
