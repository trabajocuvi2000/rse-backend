
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Usuario;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
    
}
