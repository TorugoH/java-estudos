package com.api.apirest.repository;

import com.api.apirest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
       /*@Query(value = "SELECT * FROM UsuariosSistema WHERE nome=:nome and senha=:senha", nativeQuery = true)
        Usuario findnomeAndsenha(@Param("nome") String nome, @Param("senha") String senha)*/


}