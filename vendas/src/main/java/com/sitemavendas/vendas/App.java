package com.sitemavendas.vendas;

import com.sitemavendas.vendas.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sitemavendas.vendas.controller.RepositoryProdutos;

@Component

public class App implements CommandLineRunner {
    @Autowired
    private RepositoryProdutos repositorio;
    @Override
    public void run(String... args) throws Exception {
        Produto produto = new Produto();
        produto.setNome("Queijo");
        produto.setVencimento("13/12/2023");
        produto.setQuatidadeEstoque(1);
        produto.setValor(90);
        repositorio.save(produto);

        System.out.println(repositorio.findByNome("Queijo"));

        //for(Produto u: repositorio.findAll()){
          //  System.out.println(u);
        //}
    }


}
