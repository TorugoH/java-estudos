package com.sitemavendas.vendas.controller;

import com.sitemavendas.vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RepositoryProdutos extends JpaRepository<Produto,Integer> {

    List<Produto> findByNome(String nome);

}
