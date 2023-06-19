
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Empresa;
import com.sinfloo.ejemplo01.repository.EmpresaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImp implements EmpresaService{
    
    @Autowired
    private EmpresaRepositorio repositorio;

    @Override
    public Empresa insertarEmpresa(Empresa p) {
        return repositorio.save(p);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Empresa> listarEmpresaID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Empresa editarEmpresa(Empresa p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Empresa> eliminarEmpresa(int id) {
        Optional<Empresa> p = repositorio.findById(id);
        if(p!=null){
            repositorio.deleteById(id);
        }
        return p;
    }
    
}
