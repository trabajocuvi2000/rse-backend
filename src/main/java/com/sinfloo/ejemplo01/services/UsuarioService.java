
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    
    Usuario insertarUsuario(Usuario p);
    List<Usuario> listarUsuarios();
    Optional<Usuario> listarID(int id);
    Usuario editar(Usuario p);
    Optional<Usuario> eliminar(int id);
    
}
