/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.controlador;

import com.sinfloo.ejemplo01.DTO.UsuarioDao;
import com.sinfloo.ejemplo01.entidades.Usuario;
import com.sinfloo.ejemplo01.utilerias.ComprobarUsuario;
import com.sinfloo.ejemplo01.utilerias.JWTUtil;
import com.sinfloo.ejemplo01.utilerias.Token;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jonnathan
 */
@CrossOrigin
@RestController
@RequestMapping({"/consultas"})
public class AuthControlador {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;
    
    @PersistenceContext
    EntityManager entityManager;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {

        Usuario usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if (usuarioLogueado != null) {
//            miuto 4:02 trabaja en el frontend
            System.err.println("id -> " + usuarioLogueado.getUsuario_ID());
            System.err.println("correo -> " + usuarioLogueado.getEncuestado().getCorreo());
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getUsuario_ID()), usuarioLogueado.getEncuestado().getCorreo());
            System.err.println("*****************************");
            return tokenJwt;
        }
        return "fail";
    }
    
    @GetMapping("/getToken/{id}")
    public Token getData(@PathVariable("id") int id_usuario) {
        Token token = new Token();
        // obtenemos el encuestado ID
        String query = "FROM Usuario where usuario_id = " + id_usuario; // consulta para obtener al usuario
        List<Usuario> usuario = entityManager.createQuery(query).getResultList();
        
        Usuario usuarioLogueado = usuario.get(0);
                
        if (usuarioLogueado != null) {
//            miuto 4:02 trabaja en el frontend
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getUsuario_ID()), usuarioLogueado.getEncuestado().getCorreo());
            token.setToken(tokenJwt);
            return token;
        }
        return null;
    }
    
    @GetMapping("/getTokenUnique")
    public Token getTokenUnique() {
        Token token = new Token();
        String tokenJwt = jwtUtil.create("0101", "jonnathancuvi@gmail.com");
        token.setToken(tokenJwt);
        return token;

    }
    
    @RequestMapping(value = "/comprobarUsuario", method = RequestMethod.POST)
    public ComprobarUsuario comprobarUsuario(@RequestBody Usuario usuario) {
        
        ComprobarUsuario comprobar_usuario = new ComprobarUsuario();
        Usuario usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if (usuarioLogueado != null) {
            comprobar_usuario.setContrasena_correcta(true);
            comprobar_usuario.setContrasena(usuarioLogueado.getContrasena());
            comprobar_usuario.setCorreo(usuarioLogueado.getEncuestado().getCorreo());
            return comprobar_usuario;
        }
        comprobar_usuario.setContrasena_correcta(false);
        return comprobar_usuario;
    }

}
