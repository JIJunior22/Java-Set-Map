package me.dio.Set.Model.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    Set<Produto> produtoSet;

    //Construtor

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Metodos
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        //TreeSet deixa organizado
        Set<Produto> produtosPornome = new TreeSet<>(produtoSet);
        return produtosPornome;
    }
    public Set<Produto>exibirPorPreco(){
        Set<Produto>produtosPorPreco=new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}


