package com.sitemavendas.vendas.controller;

import com.sitemavendas.vendas.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends JpaRepository<Usuarios,Integer> {

}
