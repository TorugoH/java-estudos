package com.sitemavendas.vendas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 50, nullable = false)
    private String vencimento;
    @Column(length = 50, nullable = false)
    private int quatidadeEstoque;
    @Column(length = 50, nullable = false)
    private int valor;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public int getQuatidadeEstoque() {
        return quatidadeEstoque;
    }

    public void setQuatidadeEstoque(int quatidadeEstoque) {
        this.quatidadeEstoque = quatidadeEstoque;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", nome:'" + nome + '\'' +
                ", vencimento:'" + vencimento + '\'' +
                ", quatidadeEstoque:" + quatidadeEstoque +
                ", valor:" + valor +
                '}';
    }
}
