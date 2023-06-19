/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import com.sinfloo.ejemplo01.entidades.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonnathan
 */


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {

        boolean valor = false;
        String query = "select u from Usuario as u where u.encuestado.correo = :email"; //hay que comprobar no se si funcionara
        List<Usuario> lista = entityManager.createQuery(query).setParameter("email", usuario.getEncuestado().getCorreo()).getResultList();

        if (lista.isEmpty()) {
            return null;
        }
//
        String passwordHashed = lista.get(0).getContrasena();
//        System.err.println("HASH --> " + passwordHashed);
//        System.err.println("CONTRASENA --> " + usuario.getContrasena());

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, usuario.getContrasena())) {
            return lista.get(0); // devuelve el usuario 
        } else {
            return null;
        }
    }

}
