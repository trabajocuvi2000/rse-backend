
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface IndicadorRepositorio extends JpaRepository<Indicador, Integer>{
    
}
