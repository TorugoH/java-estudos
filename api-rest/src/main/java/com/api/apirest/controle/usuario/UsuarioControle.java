package com.api.apirest.controle.usuario;

import com.api.apirest.model.Usuario;
import com.api.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioControle {
    @Autowired
    UsuarioRepository usuarioRepository;
    @GetMapping("ListarTodosUsuarios")
    private List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();

    }
    @PostMapping("RegistrarUsuario")
    private  void registrarUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @DeleteMapping("{id}")
    private void excluirConta(@PathVariable("id")Integer id){
        usuarioRepository.deleteById(id);
    }



}
