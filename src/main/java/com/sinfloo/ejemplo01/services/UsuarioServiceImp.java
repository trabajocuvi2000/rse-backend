package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Usuario;
import com.sinfloo.ejemplo01.repository.UsuarioRepositorio;
import com.sinfloo.ejemplo01.utilerias.BCrypt;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public Usuario insertarUsuario(Usuario p) {

        //para encriptar
        //p.setContrasena(BCrypt.hashpw(p.getContrasena(), BCrypt.gensalt()));
        return repositorio.save(p);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Usuario> listarID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario editar(Usuario p) {
        return repositorio.save(p);
    }

    @Override
    public Optional<Usuario> eliminar(int id) {
        Optional<Usuario> p = repositorio.findById(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return p;
    }

}
