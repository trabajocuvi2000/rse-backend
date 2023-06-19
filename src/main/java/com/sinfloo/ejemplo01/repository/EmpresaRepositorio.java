
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresaRepositorio extends JpaRepository<Empresa,Integer>{
    
}
