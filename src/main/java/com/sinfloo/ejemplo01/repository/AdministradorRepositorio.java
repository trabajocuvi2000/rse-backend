
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Administrador;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepositorio extends JpaRepository<Administrador, Integer>{
    
}
