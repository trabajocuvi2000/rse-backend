
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Empresa;
import java.util.List;
import java.util.Optional;

public interface EmpresaService {
    
    Empresa insertarEmpresa(Empresa p);
    List<Empresa> listarEmpresas();
    Optional<Empresa> listarEmpresaID(int id);
    Empresa editarEmpresa(Empresa p);
    Optional<Empresa> eliminarEmpresa(int id);
}
